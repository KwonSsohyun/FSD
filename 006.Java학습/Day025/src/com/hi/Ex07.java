package com.hi;

import java.io.*;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 바이트 스트림.
		// 이걸 문자열스트림으로 변환하면?
		// 스캐너 생성자안에 (System.in) -> Scanner scan = new Scanner(System.in);
		InputStream inn = System.in; // 사용자가 쓴걸 읽어들이는것. 
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		isr = new InputStreamReader(inn);
		br = new BufferedReader(isr);
		
		try {
			// 스캐너 썼을때
			// scan.nextLine() -> 문자열 받을 수 있는게 readLine();
			System.out.println(br.readLine()); // 입력받자 마자 출력
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			br.close();
			isr.close();
			inn.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
