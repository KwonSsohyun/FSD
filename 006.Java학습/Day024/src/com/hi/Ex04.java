package com.hi;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// 자료형 그대로 쓰고, 자료형 그대로 받아보기 (데이터 스트림)
		File file = new File("test04.bin");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 필터담
			DataOutputStream dos = new DataOutputStream(fos);
			
			// 이렇게 써도 되지만
			// dos.write(65);
			
			// 자료형에 맞게 쓰면 된다.!
			// 쓸때 어떻게 썼느냐에 따라 이 순서에 맞춰서 써줘야 한다
			// 쓴대로 읽어야함 (단 자료형을 그대로 살릴 수있다)
			// ▶ write자료형();
			int su1= 97;
			dos.writeInt(su1);
			
			double su2 = 3.14;
			dos.writeDouble(su2);
			
			char su3 = '#';
			dos.writeChar(su3);
			
			boolean boo = true;
			dos.writeBoolean(boo);
			
			// 문자열은 UTF
			String msg = "문자열";
			dos.writeUTF(msg);
			
			dos.close();
			fos.close();
			
			System.out.println("작성끝");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
