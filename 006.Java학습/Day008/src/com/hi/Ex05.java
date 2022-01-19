package com.hi;

public class Ex05 {
	
	// 전역 (메서드 밖에 있으면 다 전역임)

	// ********** 맴버필드 (객체의 변수)(인스턴스 변수) - "non static" -> 객체생성 new 해야함
	public final int su; // 상수형 변수 선언 > 이건 예외인게, 아래 Ex05 me = new Ex05(1234); 객체 생성할때 생성자를 호출하므로, 생성자안에 있는 필드 값 초기화됨
	// └ 생성자를 통해서 초기화 되니까. 
	// public static final int su; ->> 이건 안됨 >> 왜냐하면 이미 미리 상수에 값이 디폴트로 올라가기 때문
	public int su3; 
//	public int su3 = 4321; // 변수 선언과 값 초기화
	
	//********* 클래스 변수 - "static" -> 객체생성 new 안해도됨
	public static final int su5 = 5555; // final 이라 값 못 바꿈
//	public static final int su6; // 디폴트 값을 갖고 있어서 > 근데 뭐하러 상수형변수를 만드냐해서 의미가 없어서 "오류"
	
	
	// 생성자 ▶ 객체 생성 시점에 하고자 하는일 함 >> 필드값 초기화
	public Ex05(int su2){
		su3 = 3333;
		su = su2; // 필드 값의 초기화 (값을 바꾸는것이 아님)
//	    su3 = su2; // 값 바꾸는거라 오류
	}
	
	
	public static void main(String[] args) {
		
		final int su4; // final 키워드는 상수형 변수 > su4는 변수 > 공간할당 
		// final 키워드 >> 상수형 값에 의미를 부여 >> 변수명에 의미가 있음. (값을 못 바꿈!!!)
		su4 = 4444; // 초기화 -> 상수 
		// su4 = 5555;
		System.out.println(su4);
		
		Ex05 me = new Ex05(1234); // 객체생성하면서 값 전달
		System.out.println(me.su);
		System.out.println(me.su3);
		
		// me.su3 = 54321;
	}

}
