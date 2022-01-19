package com.hi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		String msg = "한글로 작성하든\r\n영문으로 작성하든\r\nABCD\r\n잘 작성됩니다.@#";
		// char[] buff = msg.toCharArray();
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// 버퍼에 담아서 바로 쓴다.
			// 캐릭터배열을 받을 필요가 없이 버퍼에 바로 담아버린다.
			bw.write("한글로 작성하든");
			bw.newLine(); // 개행
			// bw.write("\r\n");
			bw.write("영문으로 작성하든");
			bw.newLine();
			bw.write("ABCD");
			bw.newLine();
			bw.write("잘 작성됩니다.@#");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
