package com.room802;

public class Ex16 {

	public static void main(String[] args) {
		
		com.room802.Ex16 me;
		
		java.lang.String msg2; // java.lang. 패키지 경로가 있다. 
		// 앞에 패키지 경로가 생략되어있으면 >> 첫번째로는 패키지 경로com.room802 로 찾고 >> 기본이 java lang에서 찾는다.
		// 나머지는 경로는 기입해야한다.
		java.lang.Integer.parseInt("1234");
		java.lang.System.out.println();
		
		
		// 사용자 입력
		java.util.Scanner sc = new java.util.Scanner(System.in); // 입력받기 위한 장치 준비
		
		for(int i=0; i<3; i++){ // 입력 3번 받음
		
			System.out.print("입력 : ");
			String msg = sc.nextLine(); // 입력받는 코드 (입력받기 전까지는 대기함) : 다음코드 진행 안함
			Integer.parseInt(msg); // 문자열 숫자로 변환
			System.out.println(msg);
		}
		
	}

}
