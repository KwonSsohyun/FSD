package com.room802;

public class Ex03 {
	public static void main(String[] args){
		// 자동형변환 : 표현범위가 가장 넓은 걸로 됨.(결과값 반환)
		// byte < short < char <= int < long < float < double
		// 반대는 강제형 변환
		
		// 사칙연산(+ - * / %)
		int a;
		int b;
		// char b;
		// double b; // 자동형변환이 되는방향성으로 알아서 된다.
		
		a = 5;
		b = 2; 
		// b = 'a'; // int 자동변환되면 97
		// b = 2.0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫이 반환됨 ->> 동일 자료형의 연산은 동일 자료형을 반환
		System.out.println(a%b); // 나머지 반환
		
		System.out.println(1+2+3*2-1); // 곱하기 먼저 ->> 왼쪽부터 오른쪽으로 감 (사칙연산) : 8
		System.out.println(1+(2+3)*2-1); // 괄호 먼저 ->> 곱하기 ->> 왼쪽에서 오른쪽으로 ->> 10
		// ▶ 괄호가 가장 먼저 일어난다.
	}
}
