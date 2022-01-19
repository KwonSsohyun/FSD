package com.hi;

class Lec04{
	public int su1 = 1111;
	public void func01(){
		System.out.println("부모클래스의 기능1");
	}
	public void func03(){
		System.out.println("부모클래스의 기능3");
	}
}

public class Ex04 extends Lec04 { // 상속
	
	public int su1 = 2222;
	public int su2 = 3333;
	
	public void func01(){
		System.out.println("자식클래스의 기능1");
	}
	
	public void func02(){
		System.out.println("자식클래스의 기능2");
	}

	public static void main(String[] args) {
		// 다형성
		Lec04 var1 = new Lec04();
		System.out.println(var1.su1);
		var1.func01();
		var1.func03();
		
		Ex04 var2 = new Ex04();
		System.out.println(var2.su1);
//		System.out.println(var2.su2);
		var2.func01();
		var2.func02();
		var2.func03();
		
		System.out.println("--------------------------------------------------");
		
		/*
		Lec04 var3 = new Ex04(); // 객체를 생성했는데 받는 변수의 타입은 부모의 타입 // 자식객체 생성해서 받을수도 있다.
		// 자식타입으로 받을 수는 없다. >> 부모는 내건 안가지고 있으니까 안된다.
		// Ex04 me = new Lec04();
		var3 = new Ex04();
		*/
		
		Lec04 var3;
		var3 = new Lec04();
		var3 = new Ex04();
		System.out.println(var3.su1); // 타입이 Lec04니까 (부모의 값 출력) (필드는 부모것)

		
		var3.func01(); // 주입된 객체가 Ex04니까 자식에서 덮어쓴 값으로 나온다. // 오버라이드(덮어쓴 효과) // 메소드는 자식에서 오버로드됨
//		var3.func02(); // Lec04에서는 01과 03은 가지고 있지만 02는 없어서 오류
		var3.func03();
		
		
	}

}
