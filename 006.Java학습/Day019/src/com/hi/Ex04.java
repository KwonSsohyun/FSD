package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		
		// < 파일 복사해보기! >
		
		// 한글 데이터 아님
		// 1) 파일에 바이너리 데이터를 읽어서
		File file = new File("F:\\JavaWork\\Day019\\src\\com\\hi\\Ex01.java");
		File copy = new File("F:\\JavaWork\\Day019\\src\\com\\hi\\Ex05.java");
		// File copy = new File("copy.jpg");
		
		
		
		try{
			
			// 파일복사 .createNewFile()
			copy.createNewFile();
			
			// 2) 똑같이 쓴것.
			// ▶ 읽기 ▶▶ Input
			FileInputStream is = new FileInputStream(file);
			// ▶ 작성할거니까 ▶▶ Output
			FileOutputStream os = new FileOutputStream(copy);
			
			while(true){
				// 3) 1바이트씩 읽어서 그대로 쓰고 있다.
				int su = is.read();
				if(su==-1){break;}
				os.write(su);
			}
			// 다 쓰고 나면 io 종료
			is.close();
			os.close();
			System.out.println("복사 완료...");
			
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
