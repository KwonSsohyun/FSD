package com.hi;

public class Ex04 {
	
	
	// 메서드
	// 의의 : 코드의 재사용
	// public static void(=리턴의 자료형) 메서드명([매개변수들...(올수도 있고 안올수도 있고)]){구현코드;}
	
	// 메서드명 - 영문자소문자 시작 ~~~ (나머지 규칙 동일)
	// 호출을 받아야지 실행 (해당 메서드로가서 일을 하고 main메서드로 돌아온다.)
	// 호출한 측의 매개변수와 받는 측의 변수선언이 일치 (유무, 갯수, 타입, 순서)
	// 메서드명();
	public static int func01(int a, int b){ // 문자열+숫자 -> String // (매개변수) = 지역변수
		System.out.println("새롭게 만든 func01");
		int c=a+b;
		return c;
	}
	
	// 변수의 라이프사이클{선언된변수 중괄호} 찾고, 거기까지만 유효한것임
	//                                              범위 밖에서는 안된다.
	

	public static void main(String[] args) { // 메인이 끝나면 프로그램이 끝나는 것 //args 변수명이니까 이것만 바꿀수는 있다.
		
		System.out.println("기존 main");
		
		int c = func01(1, 2); // 새롭게 c라는 공간 확보 // Ex04.func01(1, 2); -> 같은 파일이라 앞에 "Ex04"생략됨
		// 호출해준곳에서 값 전달해줌 -> 14번 라인(괄호안)
		System.out.println("c="+c);
		
		func02("문자열", 12); // 매개변수 전달 // 자료형이 서로 일치해야한다. (호출하는 측 / 받는 측)

	}
	
	public static void func02(String st1, int su1){ // 매개변수 변수 선언
		System.out.println("새롭게 만든 func : " + (st1+su1));
	}
}






























