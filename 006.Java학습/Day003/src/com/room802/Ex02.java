package com.room802;

public class Ex02 {

	public static void main(String[] args) {
		
		// 변수 선언 (자료형)
		byte a; // 1byte
		short b; // 2byte
		int c; // 4byte
		long d; // 8byte
		
		float e; // 4byte (플롯이 롱은 담을 수 있다)(표현범위가 더 크기 때문)
		double f; // 8byte
		char g;
		boolean boo;
		
		// 변수 초기화
		a = 1;
		b = 2;
		c = 3;
		d = 4L;
		e = 3.14f;
		f = 3.14;
		g = '한';
		boo = true;
		
		d = c; // 자동형변환
		c = b; // 자동형변환
		c = (int)d;
		e = (float)f;
		e = d;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(boo);


	}

}
