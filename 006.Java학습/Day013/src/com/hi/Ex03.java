package com.hi;

// 객체생성은 못하지만 상속을 통해서는 만들수 있으니 생성자 필드 있음 (오버라이딩)

abstract class Lec03{ // 기본 접근제한자 defalt 그래서 생성자가 public이 기본이어도, com.hi안에서만 써야한다. (위를 따르니)
	public Lec03(int a){ // 생성자가 인자가 있을때 상속받는곳에 디폴트 생성자 만들어주고 전달값 줘야 한다.
		super();
	}
	
}

public class Ex03 extends Lec03{ // 상속
	
	// 디폴트 생성자 자동 생김
	// 기본 public -> 디폴트 생성자의 접근제한자는 public
	// 명시적으로 디폴트 생성자를 살려서 처리해줘야 처리 가능
	public Ex03(){
		super(1111); // 보모생성자 호출되고, 그다음 내 순
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
