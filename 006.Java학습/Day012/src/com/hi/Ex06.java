package com.hi;


class Lec06{
	public int su = 1111; 
	public Lec06(){ // 디폴트 생성자는 자동으로 만들어준다. 있으면 있는거 쓰고, (int a)인자를 넣는 순간 디폴트 생성자 사라짐
		super(); // 오브젝트 클래스의 디폴트 생성자 호출(생략가능) Object 최상단!!!(모든클래스의 최상단)
		System.out.println("부모생성");
	}
	public void func(){
		System.out.println("부모클래스의 기능");
	}
}


public class Ex06 extends Lec06{

	public int su = 2222;
	public Ex06(){ // 부모생성자가 먼저생성되야 자식생성자가 그다음에 되기에

		// 이는 증명코드고, 생략되어있는것임.
		// 그래서 이 spuer();이 앞에 있어야 한다. 뒤에있으면 자식이 뭘 어디서 받냐?
		super(); // 부모생성자의 호출 
		// 만약 6번에 생성자에 인자전달값이 있다면 디폴트가 아니기에 오류남 
		// <생성자가 디폴트가 아닐경우!>
		// 	명시적으로 적어줘야 부모객체 생성될 수 있다!
		// 	this는 안쓰면 그만이었지만, super 써야 한다. 매개변수를 전달하기 위해서
		
		System.out.println("자식생성1");
	}
	
	public Ex06(int a){
		this(""); // 밑에 스트링이라서 // super() 없다. >> 부모객체 2번찍어버리니까.
		
		System.out.println("자식생성2");
	}
	
	public Ex06(String a){
		super(); 
		System.out.println("자식생성3");
	}
	
	public void func(){
///		func(); // 재귀함수가 되면서 내 자신을 계속부르니 무한루프돔 // 앞에 this생략됨
		
		// 부모객체의 접근 ▶▶ super 
		// (이건 생략할 수 없다. this는 위코드처럼 생략되지만 부모를 접근하고 싶으면 명시)
		super.func(); // 부모의 참조변수 ▶ 부모클래스의 생성자가 그럼 호출됨!!! (non-static에서만 가능!!!)
		//               그렇게에 static은 상속의 개념의 아님!!!!
		
		System.out.println("자식클래스의 기능" +" "+ this.su +" "+ super.su);
	}
	
	public static void main(String[] args) {
		Ex06 me = new Ex06();
//		me.func(); // 오버라이딩이 됬기에 자식 생성자 나옴 (메서드 동일이름에서만 가능)
		
		


	}

}
