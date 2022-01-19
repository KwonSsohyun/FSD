package com.room802;

public class Ex07 {

	public static void main(String[] args) {
		// 대입 연산자
		// = (대입)
		// == (비교)

		int a;
		a = 2;
		// a+=1; // a = a+1; 
		// a++
		
		a+=2; // a=a+2;
		a-=2; // a=a-2;
		a*=2; // a=a*2;
		a/=2; // a=a/2;
		a%=2; // a=a%2;
		
		a+=3*2+1; // a = a+(3*2+1); ->> 대입연산자의 우선순위가 가장 낮기 때문
		
		System.out.println(a);
	}

}
