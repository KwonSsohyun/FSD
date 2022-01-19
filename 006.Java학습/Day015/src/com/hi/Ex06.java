package com.hi;

interface Interr{
	void func02();
}

//class Lec06{
//	public static Interr func(){
//		/*
//		class Local implements Interr{ 
//			public void func02(){
//				System.out.println("로컬클래스 기능");
//			}
//		}
//		*/
//		// 호출하려고.
////		Local local = new Local();
////		local.func02();
//		
//		// 익명 클래스
//		// = 클래스의 이름을 없애버림
//		return;
//
//	}
//}

abstract class Lec06{
	public void func01(){}
	public abstract void func02();
}

public class Ex06 {
	
	/* 전역변수
	static Interr inter = (new Interr(){ 
		public void func02(){
			System.out.println("익명클래스 기능");
		}
	});
	*/
	
	/*
	// 인터페이스로 객체를 생성
	// 인터페이스는 객체 생성 못함
	// 인터를 상속받는 클래스 = new ~~~
	// 근데 그 클래스가 이름이 없네 -> 익명클래스
	Interr inter = new Interr(){ 
		public void func02(){
			System.out.println("익명클래스 기능");
		}
	};
	*/
	

	public static void main(String[] args) {
//		Interr inter = Lec06.func();
//		inter.func02();
		
		// Lec06 inter = new ///// Lec06(){ -> 클래스이름이 없으니 상속받앗다는 키워드도 아무것도 없다.
		// 다형성 활용
		Lec06 inter = new Lec06(){ 
			public void func02(){
				System.out.println("익명클래스 기능"+this); // com.hi.Ex06$1 -> $ 내부클래스
			}
		};
		inter.func01();
		inter.func02(); // 오버라이딩된 익명클래스 객체 // ▶ "익명클래스 기능" 출력
		
		/*
		Ex06 me = new Ex06();
		me.inter.func02();
		*/

	}

}