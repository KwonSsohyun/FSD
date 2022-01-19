package com.hi;

public class Ex06 {
	
	public static void func01(){
		System.out.println("매개변수가 없는 func01 실행");
	}
	
	public static void func01(int a){
		System.out.println("매개변수가 없는 또 다른 메서드");
	}
	
	/******************* 이건 오버로드 아님 - 리턴값은 아님 ******************
	public static int func01(int a){ // 매개변수만 오버로드 기능이 됨
		System.out.println("매개변수가 없는 또 다른 메서드");
		return 0;
	}
	**************************************************************************/

	public static void main(String[] args) {
		
		// 메서드 오버로드 (메서드명의 중복) (매개변수의 유무, 갯수, 타입,순서 각각 달리하면서 메소드명을 동일)
		// 메서드명 중복
		// func01(1); // 어떤것을 실행해야 하는지 모호하기 때문에 메서드 이름 중복 안됨.
		// 인자가 있다면 구분해낼 수 있다. (메소드 명이 같아도 말이다.) 명확해 지기 때문
		
		
		// println() 메소드 : 인자를 아예 안주기도 하고 주기도 하고 (매개변수)
		// 어떤 타입을 위한 매개변수에 따라서 맞춰서 메소드를 선택해야 하는데 그것을 오버로드덕분에 그냥 씀
		// 그럼 메소드명도 달라져야하고 외워야하는데 쉽게 쓸수 있다. (사용자 편리성)
		// System.out.print(); 매개변수 없는건 안되서 (무조건 하나는 받아야함) 
		System.out.println(); // 인자가 없어도 가능함 
		System.out.println(1); // 출력을 하고 개행을 한다.
		System.out.println(3.14);
		System.out.println(true);
		System.out.println("문자열");
	}

}
