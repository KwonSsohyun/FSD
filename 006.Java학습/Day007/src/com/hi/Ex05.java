package com.hi;

public class Ex05 {

	// 전역변수
	// static 이든 , non-static이든 구애를 받지 않는다.
	// 클래스 변수, 전역변수
	public static int b=2222;

	// 맴버필드, 인스턴스
	// non-static이니까 같은 non-static이면 상관이 없는데, 
	// static일 경우에는 new연산자써서 객체를 생성한다.
	// 이 주소값을 변수에다가 주소값을 복사한다. ▶ Ex05 ccc = new Ex05();
	public int c=3333;
	
	public static void main(String[] args) {
		// 지역변수
		int a = 1111;
		System.out.println(a);
		System.out.println(b);
		
		Ex05 cc = new Ex05();
		System.out.println(cc.c);
	}
	
	public static void mm(){
		Ex05 ccc = new Ex05();
		System.out.println(ccc.c);
		System.out.println(b);
	}
	
	public void ccc(){
		System.out.println(b);
		System.out.println(c);
	}
	


}
	