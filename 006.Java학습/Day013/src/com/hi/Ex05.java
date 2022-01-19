package com.hi;

// 인터페이스는 클래스가 아니다. (값도 못갖고 생성자도 없고, 메소드선언만 있을뿐, 구현을 못하니 객체가 없음)
// 다중상속 때문에 나온게 인터페이스 나옴
interface Inter02{
	void func01();
}

interface Inter03 extends Inter02, Inter04{ // Inter02, Inter04 다중 상속받음 (여기서는 extends) 쓴다.
	
}

interface Inter04{}

// 다중상속의 효과 볼 수 있다.
// 인터페이스는 클래스가 아니므로 다중상속 가능 >> implements Inter02, Inter03 
public class Ex05 extends Ex01 implements Inter04 { // extends Ex01 (상속) // implements Inter02 (인터페이스타입 상속)임플러먼트스
	
//	public void func02(Ex05 me){}
//	public void func02(Object me){} // 안만들어진 파일까지도 Object 로 받을수 있다.
	public void func02(Inter04 me){} // 다형성에 따라 매개변수로 선택적으로 상속받아서 받아볼 수 있게 됬다.
	// Inter04 상속받은 것들만 받아볼 수 있게 됬다. (선택하고 제약할 수 있게 됬다.)
	
	public void func01(){System.out.println("잇힝");} 
	// abstract 붙히면 안된다. 구현이 있으니까. {} 
	// 구현이 없으면 abstract 붙힌다.(추상)

	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
		me.func01();
		me.func02(me);
		
		Inter02 you = null;
//		you.func01();
		
		Inter04 you1 = new Ex05();
		

	}

}