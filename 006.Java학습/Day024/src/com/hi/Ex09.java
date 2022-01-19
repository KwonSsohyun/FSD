package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		try {
			// 인풋 스트림 (대칭) ▶ FileReader
			FileReader fr = new FileReader(file);
			
			// 읽고싶은 갯수만큼 읽어오면 된다.
			char[] buff = new char[3]; // 3글자씩 읽어온다.
			
			// 버퍼가 캐릭터 배열 -> 2바이트 체계니까
			while(true){
				// 읽어드린 갯수 -> su
				int su = fr.read(buff);
				if(su == -1){break;}
				System.out.println(new String(buff, 0 ,su)); 
				// (buff, 0 ,su) 있으므로써 2바이트니까 한글도 문제 없게 나옴
			}
			// fr.read(buff);
			
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
