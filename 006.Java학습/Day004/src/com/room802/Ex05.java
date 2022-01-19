package com.room802;

public class Ex05 {

	public static void main(String[] args) {
		
		// Q2. A~Z까지 출력하시오.
		for(int i=65; i<=90; i++){
			System.out.print((char)i);
		}
		System.out.println("---------------------------------------------");
		
		for(int i='A'; i<='Z'; i++){
			System.out.print((char)i);
		}
		
		System.out.println("\n ------------------------------------------");
		
		// 좋지 않은 코드
		for(char i ='A'; i <='Z'; i++){
			System.out.print(i);
		}
		
		System.out.println("\n ------------------------------------------");
		
		
		int cnt = 'Z'-'A'+1; // 26;
		for(int i = 0; i <cnt; i++){
			System.out.print((char)(i+'A'));
		}
		// 'A' = 'A' + 0;
		// 'B' = 'A' + 1;
		// 'C' = 'A' + 2;
		//  ...
	}

}
