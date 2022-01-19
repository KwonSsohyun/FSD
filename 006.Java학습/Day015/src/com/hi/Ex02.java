package com.hi;

class Outter03{
	
	// static 내부클래스
	static class Inner03{
		// 필드 (static / non-static)
		public static int su1 = 3333;
		public int su2 = 4444; // 객체찍고, 참조변수로 접근 가능 (non-static)
		
		// 생성자
		public Inner03(){
			
		}
		
		// 메서드 (static / non-static)
		public static void func03(){
			//non-static 접근 - 객체찍고, 참조변수로 접근 가능 (non-static)
			Outter03 outt = new Outter03();
			System.out.println(outt.su2);   																 //  ▶ 2222
			// static 접근
			// System.out.println(Outter03.su1);
			System.out.println(su1); // (static) 내부니까 생략 가능 - Inner03.
			// System.out.println(su2); // (non-static) 객체가 찍혀야 접근 가능하니 참조변수로 접근 가능함	//  ▶ 3333
			System.out.println(Outter03.su1);																//  ▶ 1111
			Inner03 inn = new Inner03();
			System.out.println(inn.su2);																	//  ▶ 4444
		}
		public void func04(){ // non-static이니까 객체 안찍음 (non-static끼리는 호출 가능)
			//non-static 접근 - 객체찍고, 참조변수로 접근 가능 (non-static)
			Outter03 outt = new Outter03();
			System.out.println(outt.su2);																	//  ▶ 2222
			// static 접근
			System.out.println(su1); // (static) 내부니까 생략 가능 - Inner03.								//  ▶ 3333
			// System.out.println(su2); // (non-static) 객체가 찍혀야 접근 가능하니 참조변수로 접근 가능함
			System.out.println(Outter03.su1);                                                               //  ▶ 1111
			System.out.println(su2);     // this 자기 자신을 찍었을 테니까.                                  //  ▶ 4444
		} 
		
		
	}
	
	// 생성자
	public Outter03(){
		
	}
	
	// 필드 (static / non-static)
	public static int su1 = 1111;
	public int su2 = 2222;
	
	// 메서드 (static / non-static)
	public static void func01(){
		System.out.println(Outter03.su1); // 내 클래스 안이라서 생략 가능 - Outter03. //  ▶ 1111
		// static 접근
		System.out.println(Inner03.su1); 											  //  ▶ 3333
		//non-static 접근 - 객체찍고, 참조변수로 접근 가능 (non-static)
		Inner03 inn = new Inner03();
		System.out.println(inn.su2);												  //  ▶ 4444
	}
	public void func02(){
		// static 접근
		System.out.println(Inner03.su1);										      //  ▶ 3333
		//non-static 접근
		Inner03 inn = new Inner03();
		System.out.println(inn.su2);												  //  ▶ 4444
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		// 바깥클래스 접근
		// static 접근
		System.out.println(Outter03.su1);
		//non-static 접근 - 객체찍고, 참조변수로 접근 가능 (non-static)
		Outter03 outt = new Outter03();
		System.out.println(outt.su2);
		
		
		
		// 내부클래스 접근
		// static 접근
		System.out.println(Outter03.Inner03.su1); // .Inner03 안에 있으니 앞에 Outter03. 붙혀준다.
		//non-static 접근 - 객체찍고, 참조변수로 접근 가능 (non-static)
		// Inner03 객체 생성
		Outter03.Inner03 inn = new Outter03.Inner03();
		System.out.println(inn.su2);
	}

}
