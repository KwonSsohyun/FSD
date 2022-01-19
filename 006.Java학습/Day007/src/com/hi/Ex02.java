package com.hi;
/*
 * call method, var (호출)   <타 클래스>                                               <동일 클래스>
 * static -> static			 클래스명.메서드명(); > 동일클래스라 클래스명 생략한것임 > 메서드명();
 * static -> non-static		 참조변수.메서드명();									 > 참조변수.메서드명(); 
 * non-static -> non-static	 this.메서드명();	  > this 생략					     > 메서드명();	
 * non-static -> static		 클래스명.메서드명();								     > 메서드명();	
 
 */
public class Ex02 {
	
	public static void func01(){
		System.out.println("static method func01...");
		Ex02 me = new Ex02();
		me.func02();
	}
	
	public void func02(){
		System.out.println("non-static method func02...");
		this.func03();
		func01();
		return;
	}
	
	public void func03(){ // (int a) -> 오버로드(같은이름) 기준 ->  (매개변수) -> 타입, 갯수, 순서
		System.out.println("non-static method func03...");
		//return 0; // 리턴을 가지면 void자리 자료형 대체
	}

	public static void main(String[] args) {
		func01();
		
		Ex02 me;         // 변수의 선언 
		me = new Ex02();  // 참조변수 -> 객체 생성(값을 초기화해주는데 new생성된 객체의 주소값을 던져줌)
		me.func02();           // 참조변수.메서드명() 호출
		
	
		Ex02 me2 = new Ex02(); // 참조변수 
		me2.func03();          // 참조변수.메서드명() 호출
		me2.func02();

	}

}
