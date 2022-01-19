package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		
		// java.util >> Class Random
		System.out.println(Math.random());
		
		java.util.Random ran = new java.util.Random(); // 객체 생성
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextInt()); // 하나의 참조변수를 만들어내서 사용할 수 있다.
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(3)); // 0 ~ 적은 수보다 작은 값을 랜덤하게 뽑아줌 // 2 -> 0,1 // 45 -> 0~44
		

	}

}
