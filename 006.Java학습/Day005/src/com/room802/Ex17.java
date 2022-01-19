package com.room802;

public class Ex17 {

	public static void main(String[] args) {
		// 학생 성적관리 프로그램(ver 0.1.0)
		// 총 3명
		// -----------------------------------
		// 학생 성적관리 프로그램(ver 0.1.0)
		// 
		// 	1학번  국어 > 90
		//  1학번  영어 > 80
		//  1학번  수학 > 70
		
		// 	2학번  국어 > 91
		//  2학번  영어 > 81
		//  2학번  수학 > 71
		
		// 	3학번  국어 > 92
		//  3학번  영어 > 82
		//  3학번  수학 > 72
		
		// 1. 입력  2. 리스트  > 2
		// --------------------------------------------
		// 학번	 | 국어		| 영어  	| 수학
		// 1       90         80          70
		// 2       91         81          71
		// 3       92         82          72
		// --------------------------------------------		
		
		System.out.println("학생 성적관리 프로그램(ver 0.1.0)");
		String[] k1 = new String[]{"국어", "영어", "수학"};
		String[] stu1 = new String[9];

		java.util.Scanner scan = new java.util.Scanner(System.in); // 입력받기 위한 장치
		
		for(int i=0; i<9; i++){
				
			System.out.println("0학번 "  + " >");
			stu1[i] = scan.nextLine(); // 입력 받는 코드
			// Integer.parseInt(stu1[i]); // 문자열 숫자로 변환
			
		}
		
		for(int i=0; i<9; i++){
			System.out.println(stu1[i]);
		}
		
		
		
		
		

	}

}
