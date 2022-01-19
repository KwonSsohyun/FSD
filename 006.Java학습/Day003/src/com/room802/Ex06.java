package com.room802;

public class Ex06 {

	public static void main(String[] args) {
		// 논리 연산
		// and - 양측 모두 true이면 true 아니면 false
		System.out.println(true&&true); // true
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		// or - 둘중 하나라도 true이면 true 아니면 false
		//      앞에 트루 나오면 뒤에 안봄 (값 반환)
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
	}

}
