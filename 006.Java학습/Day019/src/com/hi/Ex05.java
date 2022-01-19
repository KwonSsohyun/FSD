package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// < 성능 개선 해보기 >
		
		String msg = "aaaaabbbbbbcccccc";
		
		File file = new File("test05.txt");
		
		try {
			file.createNewFile();
			// 쓰기 ▶ Output
			FileOutputStream fos = new FileOutputStream(file);
			
			byte[] buf = msg.getBytes();
			// 배열만큼 한번에 io로 밀어냄(성능이 빠름)
			// 바이트배열 받게 되있음
			fos.write(buf);
			
			// 끝!
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
