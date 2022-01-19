package com.hi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("test01.bin"); // 파일을 만든것임
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		// 바이트 체계는 1byte -> 한글쓰면 2바이트중 1바이트만 씀
		String msg = "야옹이교습소";
		try{
			// ▶ 쓰기 ▶▶ Output
			FileOutputStream out = new java.io.FileOutputStream(file);
			
			// 바이트 체제니까 이걸 쓰면 안됨.
			// char[] arr = msg.toCharArray();
			
			// 바이트 타입으로 하면 잘 작성되는 것을 볼 수 있다.
			byte[] arr = msg.getBytes();
			
			for(int i=0; i<arr.length; i++){
				out.write(arr[i]);
			}
			
			// out.write(65);
			// 오토캐스팅 활용
			// out.write('a');
            // out.write('b');
			// out.write('c');
			// 클로즈 해서 닫아줘야한다. (빨대를 뽑아줘야한다. 그전까지는 계속 보낸다.)
			out.close();
			System.out.println("작성완료");
			
		}catch(java.io.FileNotFoundException e){
			e.printStackTrace();
			// new java.io.FileOutputStream(file);
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
