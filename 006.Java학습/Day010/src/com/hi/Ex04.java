package com.hi;

public class Ex04 {
	
	public int su = 1111;
	
	public Ex04(){
		System.out.println("1. su = " + su);
	}
	
	public Ex04(int su){
		this.su = su; // 초기화 값 해줌
		System.out.println("2. su = " + this.su); // 객체 자기자신은 this 참조변수
	}
	
	public Ex04(Ex04 me){
		System.out.println("3. su = " + me.su);
	}

	public static void main(String[] args) {
//		Ex04 me = new Ex04(); // 기본 생성자 호출 
		Ex04 me2 = new Ex04(2222); // 생성자 (인자가 있으니)같은 인자 생성자 호출
		Ex04 me3 = new Ex04(me2); 
	}

}
