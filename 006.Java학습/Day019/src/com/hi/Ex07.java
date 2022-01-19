package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File origin = new File("99531D415E170D2918.jpg");
		File copy = new File("copy.jpg");
		
		// [8] ▶ 여기 숫자가 크면 클수록 더 빨라 진다.
		// 컴퓨터 입장에서는 메모리를 그 만큼 쓴다.
		// 자원을 들여서 성능을 올린다.
		// 전에는 바이트 단위로 하나하나씩 했다면
		// 이건 묶어서 하니 더 빠르다.
		// 바이트 배열 객체 이용.
		byte[] buf = new byte[8];  
		// 2, 8, 16, 32, 64, ... (컴퓨터를 생각한다면 단위 이게 좋음)
		
		try {
			// 읽기
			FileInputStream fis = new FileInputStream(origin);
			// 쓰기
			FileOutputStream fos = new FileOutputStream(copy); 
			
			while(true){
				int cnt = fis.read(buf);
				if(cnt==-1){break;}
				fos.write(buf, 0, cnt);
				// 양이 있으면 flush쓰는건 괜찮다.
				// 단, 바이트별로 하나씩 읽고 밀어내는건 좀 그럼
				// fos.flush();
			}
			
			// 다 차지 않아도 통로를 다 밀어낸다. (빨대를 끊어내진 않음)
			fos.flush();
			
			// close는 그 빨대안에 다 밀어내고, 빨대 끊어버림.
			fis.close();
			fos.close();
			System.out.println("복사끝");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
