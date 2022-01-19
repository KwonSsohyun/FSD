package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex13 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		
		try {
			FileWriter fw = new FileWriter(file);
			// 프린트는 아웃풋 스트림만 있다.
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("그냥 쓰듯이");
			pw.println("맘껏 쓰시면 됩니다.");
			pw.print("프린트로 하면 ");
			pw.print("옆으로 연결해서 작성됨");
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
