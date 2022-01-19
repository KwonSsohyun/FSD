package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 프린트스트림은 아웃풋스트림만 있다.
			PrintStream ps = new PrintStream(fos);
			// ps.write(1111);
			
			// test02.bin >> 작성된것을 볼 수 있다.
			// 문자열로 전달하는것
			////// 13.14true문자열1 
			////// 문자열2
			// -> 문자열 1을 쓴거고 문자열 3.14를 쓴거다. 다 문자열
			ps.print(1); // 65를 써다고 A가 나오는게 아니라 65가 나오는것은 문자열이라는것
			ps.print(3.14);
			ps.print(true);
			ps.println("문자열1");
			ps.println("문자열2");
			
			ps.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
