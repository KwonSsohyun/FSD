package com.hi;


class Lec02{
	public int su1 = 1111;
	public Lec02(){
		System.out.println("부모객체 생성");
	}
	public void func01(){
		su1++; // 부모객체의 수 ++ 한것임
		System.out.println("부모"+su1);
	}
}



public class Ex02 extends Lec02 { // 상속받음
	// 내가 객체를 생성하는 순간, 부모객체도 만들어진다는것
	
	/*
	// 하필 상속받은 내용이 나한테도 이미 있다면?
	// 지역이 전역보다 지역이 우선인것처럼 내가 가지고 있는 값이 우선
	public int su1 = 2222;
	public void func01(){
		System.out.println("자식");
	}
	*/
	
	public int su1 = 2222;
	public Ex02(){
//      su1++; // 내가 만약 su1이 없었다고 가정하면 당연히 부모먼저 있어야 되니까 상식!
		System.out.println("자식객체 생성");
	}
	public void func02(){
		System.out.println("자식");
		func01();
	}
	
	// *** 메서드 오버라이드 -> 같은 이름이 있다면 부모것이 아닌 자식꺼로 실행됨
	public void func01(){
		System.out.println("자식");
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02(); // 부모객체 & 자식객체 둘다 생성된것. (둘다 생성자 호출) 
		// 쉽게 생각해서 부모 객체 하나 // 자식객체 하나 
		// 이렇게 두개가 만들어져서
		// 아래 코드를 보게되면 다른 각자의 필드 값을 내뱉게 된다.
		// 부모객체를 먼저 찍는다.
		// 그래야 자식이 태어나니까.
		
		System.out.println(me.su1); // 2222
		me.func01(); // 부모1112 // 이거 확인하고 싶으면 ▶ "메서드 오버라이드" 주석할것
		System.out.println(me.su1); // su1이 상속안됬다는것. -> su1에 똑같은 명을 쓰고 있기 때문에 자기것 쓰니까.

		
		// !상식!
		// 오버로드   : 메소드 명이 같을때 (인자의 유무, 타입, 순서) 메소드, 생성자
		// 오버라이드 : 상속에서 부모클래스의 기능을 자식클래스에서 재정의 했을때 , 메소드에서만 가능 (필드는 불가)
		//              동일이름(인자타입도 다 같아야함) ->> 메서드만 덮어쓴다. 
	} 

}
