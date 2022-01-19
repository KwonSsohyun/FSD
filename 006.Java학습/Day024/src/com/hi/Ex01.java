package com.hi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// << IO - 필터 >>
		// 파일당 1:1로 빨대 꽂아줘야 한다.
		// origin 이미지 파일
		File origin = new File("origin.jpg");
		// origin 복사할 파일
		File  file = new File("copy1.jpg");
		// File  file = new File("test01.bin");
		
		
		if(!file.exists()){ // 파일이 없으면
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 성능 더 빠르게 하기
		// 인위적으로 버퍼의 양 결정함
		byte[] buf = new byte[2];
		
		try {
			// 읽어온것을 쓰는것 ▶ FileInputStream → FileOutputStream
			// 파일당 1:1로 빨대 꽂아줘야 한다.
			FileInputStream fis = new FileInputStream(origin); // → 입력
			FileOutputStream fos = new FileOutputStream(file); // → 출력
			
			// --------------------------------------------------------------------------
			// 성능 빠르게 하기
			// 1바이트씩 읽는데, (파일과 가까운위치에서 읽어오고, 캐쉬에 쓰고 밀어냄)
			// 버퍼에서 미리 읽었다는거지 (그러니 성능차이가 남)
			// 인풋에 버퍼달기
			BufferedInputStream bis = new BufferedInputStream(fis);
			// 아웃풋에 버퍼달기 (얘가 먼저 클로즈되고 위에게 클로즈 되야함)
			// 이미 버퍼의 사이즈가 결정되어있다. (8192를 읽고 8192씀)
			// IO 끊기면 데이터 유실
			// read를 통해서 읽어왔는데 날아가버린다. (읽어와서 버퍼에 담아놓는다)
			// 한쪽밖에 빨대를 못 꽂음 (데이터 무결성)
			// 정확히 읽고 끊어줘야함.
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// << 버퍼달아보기 >>
			// 버퍼를 담아와서 씀
			// BufferedOutputStream bos = new BufferedOutputStream(fos);
			// bos.write("버퍼를 달아서 작성합니다.".getBytes());
			// bos.close();
			
			// 시간측정 (작동전 시간)
			long before = System.currentTimeMillis();
			
			// << 버퍼없이 써보기 >>
			while(true){
				// 하나씩 읽고
				// int su = fis.read();
				// int su = bis.read();
				int su = bis.read(buf);
	
				if(su == -1){break;} // 읽은게 없는것. // 예를들면 100바이트 파일이다. 101은 없으니 -1
				// 하나씩 출력해라. 
				// fos.write(su);
				// bos.write(su);
				bos.write(buf, 0 , su); // 여기서 su는 갯수
			}
			// 시간측정 (작동후 시간)
			long after = System.currentTimeMillis();
			
			// 버퍼가 클로즈되고 -> 파일이 클로즈
			// 정확히 읽고 끊어줘야함.
			bis.close();
			bos.close();
			
			fis.close();
			fos.close();
			
			//// 시간측정 (전시간에서 후시간 빼기 : 소요시간)
			System.out.println(after-before + "ms");
			// 내부버퍼를 사용해서 하다보니까 성능차이가 난다.
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
