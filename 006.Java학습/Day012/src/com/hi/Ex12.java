package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		String[] msg = {"java" , "web" , "DB" , "framework"};
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("idx > ");	
		String input = sc.nextLine(); // 문자열로 입력받음
		int idx = 0;

		
		
		// 다중캐치 
		// catch >> else if 같은 느낌
		try{
			idx = Integer.parseInt(input); // 숫자형변경
			System.out.println(msg[idx]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e){ 
			System.out.println("인덱스번호는 0~3까지 입니다."); // 하고자 하는일 적는다.
		}catch(java.lang.NumberFormatException e){
			System.out.println("숫자 입력하세요.");
		}
		
		
		/*
		try{
			idx = Integer.parseInt(input); // 숫자형변경
		}catch(java.lang.NumberFormatException e){
			System.out.println("숫자 입력하세요.");
		}
		try{ // 디폴트 값을 가지고, 0으로 들어가니 java나옴
			System.out.println(msg[idx]); // 선언은 try 밖에서 선언하기!
		}catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스번호는 0~3까지 입니다.");
		}
		*/


	}

}
