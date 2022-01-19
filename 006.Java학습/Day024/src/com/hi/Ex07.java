package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		// << 문자열 스트림 >>
		// 문자열은 늘 가변적
		// 자바는 2바이트라서 -> 어쩔때는 1바이트 / 어쩔때는 2바이트
		// 자바는 문자제어 제공
		
		// 무조건 문자니까 txt
		File file = new File("test01.txt");
		
		if(!file.exists()){
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 문자열스트림 연결
		// 쓸거니까 Writer
		// 파일에 쓸거니까 FileWriter
		try {
			FileWriter fw = new FileWriter(file);
			
			// 문자열 스트림이니 >> 문자를 써야함
			// 오직 문자열을 이용할때만 써야함.
			// 이미지,파일 이런건 안됨.
			char ch = 'A';
			fw.write(ch);
			fw.write('B');
			fw.write('C');
			fw.write('한');
			fw.write('글');
			
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
