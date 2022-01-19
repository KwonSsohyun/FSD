package com.hi;

public class Ex04 {
	
	// 클래스의 구성요소
	// 1. 메서드
	// 2. 변수
	public static int b=2222;
	public int c=3333;
	
	public void func01(){
		//System.out.println(a);
		System.out.println(b); // Ex04.b 앞에생략 (동일 클래스라서)
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		/*
		int a = 1111;
		System.out.println(a);
		System.out.println(b);
		*/
		
		Ex04 me;
		me=new Ex04();
		System.out.println(me.c);
		me.func01();
	

	}

}
