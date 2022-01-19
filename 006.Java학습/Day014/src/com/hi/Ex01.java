package com.hi;

public class Ex01 {
	
	public static void func01(Object a){}

	public static void main(String[] args) {
		// 래퍼 클래스 (오토박싱 & 언박싱) - 수시로 진행
		// 연산을 취할 경우
		// 박싱 -> 객체화 하는 것
		// 언박싱 -> 기본자료형으로 하는 것
		
		/* api는 클래스에 대한 설명만 하기에
		   기본 자료형은 없고,
		   래퍼클래스만 설명되어 있다.
		*/
		
		// 기본자료형을 객체 타입으로 바꾸는 것
		// 기본자료형은 객체가 아님
		int a = 1111;
		Integer b = new Integer(2222); // 래퍼클래스
//		Double
//		Byte
//		각각의 매칭되는 클래스 타입
		System.out.println(b+1);
		
		func01(new Integer(3333)); // 자동 박싱됨 (자동으로 일어남)
		func01(3333);
//		func01(new Ex01());
	}

}
