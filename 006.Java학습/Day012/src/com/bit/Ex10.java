package com.bit; // 패키지가 다르니까 동일 폴더명 가능


//한문서에서 하나만 public 클래스를 가질 수 있다.

// 접근제한자 
// public > protected >= default > private

// 256p
// 클래스에는 public / default
// 생성자 / 필드 / 메소드  >> 4가지 모두 쓸 수 있다.

// 생성자 : protected : 상속을 통해서만 쓰겠다.
//        : private : 디폴트 생성자 못 만듬 (객체 생성이 안됨) 참조변수를 만들어낼 필요가 없는 static


public class Ex10 { // 클래스이 Public이냐도 중요 ▶▶ 우선사항은 클래스 부터 // 클래스에서는 private 불가
	
	public static int su1 = 1000;  // public 접근자 - 모두 접근 허용
	static int su2 = 2000;		   // default 접근자 - 동일패키지 내부에서만 접근허용
	private static int su3 = 3000; // private 접근자 - 해당클래스 내부에서만 사용	
	protected int su4 = 4000;	   // protected 접근자 - default 와 동일 >> 단! 상속을 통해서는 접근 허용
	
	// 생성자
	public Ex10(){
		
	}
	
	public static void func(){
		System.out.println(su3);
	}

}
