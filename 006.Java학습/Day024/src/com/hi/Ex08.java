package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// 문자열 스트림 읽어오기
		// 2byte체계
		
		File file = new File("test01.txt");
		
		// 읽어들일때는 리더!
		try {
			FileReader fr = new FileReader(file);
			
//			// System.out.println(fr.read()); // ▶ 65
//			System.out.println((char)fr.read()); // 형변환하면 그대로 읽어볼 수 있다. // ▶ 66
//			System.out.println(fr.read()); // ▶ 67
//			System.out.println(fr.read()); // 1byte 255까지 // ▶ 54620
//			System.out.println(fr.read()); // 한글 2byte    // ▶ 44544
//			System.out.println(fr.read()); // 읽을게 없으면 -1나옴 // ▶ -1			
			
			
			while(true){
				int su = fr.read(); // 65 | 66 | 67 | 54620 | 44544 | -1 |
				if(su == -1){break;}
				System.out.println((char)su);
			}
			
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
