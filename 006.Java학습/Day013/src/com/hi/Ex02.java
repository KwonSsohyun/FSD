package com.hi;

// 강제화를 시키는 문법 => 추상 abstract

// ▶▶  상속을 통해서 쓰도록 강제화 한다. abstract (추상클래스)
abstract class Machine{ // 부모 클래스
	void on(){
		System.out.println("켜다");
	}
	void off(){
		System.out.println("끄다");
	}
//	void work(){}
	
	// ▶▶ 강제화를 한다. abstract (추상메서드로)
	//    오버라이딩해서 구현 하도록 강제화 하는 것임
	abstract void work();
}

class Tv extends Machine{ // 머신 클래스 상속(자식) >> 오버라이딩해서 work() 쓸거임
	void work(){
		System.out.println("방송을 보여주다.");
	}
}

class Radio extends Machine{ // 머신 클래스 상속(자식) >> 오버라이딩해서 work() 쓸거임
	void work(){
		System.out.println("방송을 들려준다.");
	}
}

class Audio extends Machine{ // 머신 클래스 상속(자식) >> 오버라이딩해서 work() 쓸거임
	// 강제성이 없다보니 없어도 출력된다....
	void work(){
		System.out.println("음악을 들려준다.");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// null이라고 준건 초기화 에러때문에 (초기화 안될까봐)(else가 없어서)
		Machine remote = null;
//		Machine remote = new Radio();
		// 이것과 같은 뜻
		
		while(true){
			System.out.println("1.tv  2.radio  3.audio  0.종료  >");
			String input = sc.nextLine();
			
			if(input.equals("1")){
				remote = new Tv(); // 해당 Tv 객체생성해서 오버라이딩해서 work수행
			}else if(input.equals("2")){
				remote = new Radio();
			}else if(input.equals("3")){
				remote = new Audio();
//				remote = new Machine(); // 이렇게 맘대로 객체 생성못하고 상속을 통해서만 객체 생성가능
			}else if(input.equals("0")){
				break;
			}
			
			remote.on();
			remote.work();
			remote.off();
			
		}
		
	}

}
