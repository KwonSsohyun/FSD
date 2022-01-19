package com.hi;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Ex08 {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(ps);
		BufferedWriter bw = new BufferedWriter(osw);
		
		// System.out.println();
		ps.print(true);
		ps.println("dsfd");
		
		try {
			bw.write("문자열스트림으로 전환");
			bw.newLine(); // 개행
			bw.write("전환됨");
			
			
			bw.close();
			osw.close();
			ps.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
