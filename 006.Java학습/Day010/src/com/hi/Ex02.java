package com.hi;

// non-static : 객체마다 가지고 있는 값 
// static : 유지되는 값 

public class Ex02 {

	public int su = 1111;
	
	public void func01(){
		System.out.println(su); // this.su (this 생략)
	}
	
	public void func02(){
		su++;
		func01();
	}
	
	public void func03(){
		su++; // this.su++ 
		Ex02 me = new Ex02(); // 새로운 객체 생성함
		me.func01(); // 1111 출력함 // 새로운객체의 su임 (me.su)
		// this.func01(); 이면 1112 출력함
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.func03();
	}

}
