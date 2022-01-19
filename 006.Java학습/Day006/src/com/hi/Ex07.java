package com.hi;

public class Ex07 {
	
	public static void func(double a){ // int가 double로 자동형 변환되니까
		System.out.println("자동형 변환");
	}
	
	public static void func(int a){ // 컴퓨터가 능동적으로 가장 맞는것을 출력함
		System.out.println(" int 자동형 변환");
	}

	public static void main(String[] args) {
		
		func(3);

	}

}
