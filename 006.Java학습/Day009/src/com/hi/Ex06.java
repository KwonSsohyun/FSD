package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// 주민번호 검사기
		
		int age = 2021;
		char gender = '여';
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("주민번호 검사기");
		System.out.print(">>>");
		String msg = sc.nextLine(); // "950501-2031800";   // 
		///// 벨리데이션 체크 (값 체크)
//		if(){
//			return;
//		}
		///////////////////////////////
		char[] arr = msg.toCharArray();
		
		// 조건에 따라서 2000년을 더할지 . 1900을 더할지
		int year = 2000+(arr[0] - '0')*10+(arr[1] - '0'); // 0은 48 
		// *10은 10의 자리 
		
		if(arr[7] =='1' || arr[7]=='2'){
			year -= 100; // 1900을 더하는 것과 같다.
		}
		
		age = age - year + 1; // age -= year-1;
		
		if(arr[7] == '1' || arr[7] =='3'){
			gender = '남';
		}
		
		System.out.println(" 당신은 " + age + "세 " + gender + "성입니다.");

	}

}
