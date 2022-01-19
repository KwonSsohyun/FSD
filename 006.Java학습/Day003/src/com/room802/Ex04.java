package com.room802;

public class Ex04 {

	public static void main(String[] args) {
		// 증감 연산자(++, --)
		int a;
		a = 2;
		
		// ++a;
		// a++; // a = a+1; // a += 1
		
		// a--;
		// a = a-1;
		
		// System.out.println(a++); // 2
		// System.out.println(++a); // 3
		// System.out.println((a++)+(++a)); // 2+4 = 6
		
		// System.out.println(a--); // 2
		// System.out.println(--a); // 1

		
		byte b;
		b = 127;
		b++; // b = b+1 (이건 안됨 왜냐하면 +1이니까 int인데 다시 byte에 담으니까)
		System.out.println(b); // 넘어가니까 -128
		
		byte c,d,e;
		c = 1;
		d = 2;
		// e = c+d; // int를 기본 연산하기 때문에 오류남 
		
		// ▶ 정수 연수를 할거면 int
		// ▶ 실수 연수를 할거면 double
		
		double su1, su2, su3; // 실수의 연산은 되도록 피하는것이 좋다.
		su1 = 1.00000000000000001;
		su2 = 2.00000000000000001;
		su3 = su1 + su2;
		System.out.println(su3); // 근사값을 표현하기 때문에 오차범위 발생
		
		
		
	}

}
