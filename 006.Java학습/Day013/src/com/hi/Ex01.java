package com.hi;

// 추상 클래스 abstract
// 상속을 강제화해서 쓰게 한다.
// 추상 클래스는 객체 생성 불가 (new 연산자를 통해서 객체 생성 불가)
// abstract를 붙히면 new 연산자를 이용해서 객체를 만들지 못하고, 상속을 통해 자식 클래스만 만들 수 있다.
// 추상 메서드를 "0개 이상" 갖는 클래스가 추상클래스 -> 추상 메서드를 하나도 가지지 않아도 추상이 될 수 있다.

// ▶▶ 추상클래스란?
// ▶▶ 상속을 통해서만 사용가능하게 하고 싶은 클래스를 만드는 방법

abstract class Lec01{ 
	int su = 1111;
	
//	void func01(){
//		System.out.println("부모기능");
//	}
	
	// private >> 상속도 불가, 객체도 불가 ▷▷ 그래서, abstract (추상)을 쓴다. (상속을 통해서만 쓰겠다.)
//	private Lec01(){}
	
	// ▶▶ 추상메서드 abstract - 선언만하고 구현을 하지 않는 것
	abstract void func01();  // ▶▶ 오버라이딩해서 호출 가능해짐 (추상메서드를 가졌을때)
//	abstract void func02();
	void func03(){
		System.out.println("func03 run...");
	}
}

public class Ex01 extends Lec01{
	
//	public Ex01(){ // 프라이빗이라서 오류가 떨어짐
//		super(); 
//	}
	
	// 오버라이드를 하면 해결이 된다.
	// 만약 이게 없으면 위에 Lec01 -> func01 아무내용이 없어서 안되는데
	// 오버라이드가 되면서 내용이 있는 이게 실행이됨
	void func01(){
		System.out.println("오버라이드된 메서드...");
	}

	public static void main(String[] args) { // 메소드 "선언"
		
		// 중괄호 내부가 "구현"
		
		
//		// 직접객체를 사용
//		Lec01 lec = new Lec01();
//		lec.func01();

//		// 상속을 사용 >> public class Ex01 extends Lec01
//		Ex01 me = new Ex01();
//		me.func01();
		
		// ★ 추상클래스라서 객체 생성은 안되지만, 상속을 통해서 사용은 가능
		// 객체 생성이 안됨.
//		Lec01 lec = new Lec01();
//		lec.func01();
		
		
		// 추상클래스를 상속하게 되면 아무런 문제 없다.
		Ex01 me = new Ex01();
		me.func03();
		

		// 근데 추상메서드를 가지게 되면 오류가 떨어진다.
		// 구현이 없는데 뭘 실행할건데?
		me.func01();
		
		
		// 부모가 선언은 있으니 가지고는 있고, 오버라이드로 실행은 자식께 되니까  
		// 일단 호출은 가능해야하니 빈 work를 준거임 부모에
		// 추상클래스를 주면 선언통해서 존재를 한다.
		Lec01 lec01 = new Ex01();
//		Object lec01 = new Ex01(); // 받아낼수는 있는데 호출할 수 없다.
		// 실행을 할수가 없는거지
		// Object 안에는 func01 이게 없으니 Object는 수정 불가
//		lec01.func01();
//		lec01.func03();
		
		
		

	}

}
