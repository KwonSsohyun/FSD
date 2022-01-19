package com.hi;

class Lec08{ // final class  상속의 거부 >> final class Lec08
	public final void func2(){ // 메소드 final // 오버라이드의 거부 (덮어쓰는것)(값 바꾸는것 거부) - 24번라인
		
	}
}

public class Ex08 extends Lec08{ // 상속
	
//	public final static int su1 = 1111; // static 상수형 변수 // 선언과 초기화를 동시에 해야한다!
	public final int su2; // non-static 상수형 변수 // 
	
	
	public Ex08(int su){ // 생성자 - 필드값 초기화
		su2 = su;
	}
	
	public static void func(final int a){ // 매개변수 괄호 안에서 선언한것과 동일
//		a++; // 여기서 값을 바꾸는게 안됨
		System.out.println(a);
	}
	
//	public void func2(){}

	public static void main(String[] args) {
		
		Lec08 you = new Lec08();
		you.func2();
		Ex08 me = new Ex08(1111);
		me.func2();
		
		// final
		final int a;   // 상수형 변수
		a = 1111;
//		a = 2222; -> 값 바꾸면 오류
		
		Ex08 me1 = new Ex08(1111);
		System.out.println(me1.su2);
		
		Ex08 me2 = new Ex08(2222); // 객체로 만들어질 당시에는 다른 상수값을 만들수 있지만, final 객체가 만들어지고 나서부터 값 못 바꿈
		System.out.println(me2.su2); 
		
		int c = 3333;		
		func(c);
		func(2222);
	}

}
