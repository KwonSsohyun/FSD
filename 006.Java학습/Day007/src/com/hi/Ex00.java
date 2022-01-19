package com.hi;

public class Ex00 {
	
	public static void func01(){
		
	}
	
	public void func02(){}

	public static void main(String[] args) {
	
		Ex00.func01();
		Ex00 me = new Ex00();
		me.func02();
		// me.func01(); // 안되는건 아니고 문법오류 // static이기 때문
	}
	
	
}
