package com.hi;

public class Ex03 extends java.lang.Object { // 기본 상속 받음 (Object클래스를 상속받고 있다)
	// 부모가 상속받고 있을테니까. (어쨌든 최상위는 Object상속 받음)
	// 모든 클래스의 최상단은 "Object" 단일상속

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		System.out.println(me); // toString() 정의가 되어잇는것
		
		// 나한테 없는데 쓸 수 있다.
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		
	}

	// 오버라이드
	public String toString(){
		return "재정의"; // 오버라이드를 통해서 재정의해서 쓸수도 있다.
	}
}
