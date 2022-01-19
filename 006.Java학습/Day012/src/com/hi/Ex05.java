package com.hi;

class Machine{
	public void on(){
		System.out.println("켜다.");
	}
	public void off(){
		System.out.println("끄다.");
	}
	public void work(){
		// 하는 일마다 다르니 삭제
		System.out.println("안녕"); // 이건 출력안됨 >> 각각 아래서 해당하는 것의 메서드 오버라이드딩됨 work메서드명 동일히 썻기 때문
	}
}

class Tv extends Machine{ // extends Machine >> 상속받음
	/* 부모한테 있는거니까 주석
	public void on(){
		System.out.println("켜다.");
	}
	public void off(){
		System.out.println("끄다.");
	}
	*/
	
	// 하는일만 다르니 오버라이드 
	// 추가되는 것들만 정의한다. (이게 오버라이드를 잘 활용하는 것임)
	// (Machine 클래스안에 메서드명 중 work 동일이름 메서드니까 오버라이딩됨 == 동일이름 메서드만 덮어씀)
	public void work(){
		System.out.println("영상을 보여준다.");
	}
}

class Radio extends Machine{ // extends Machine >> 상속받음
	/*
	public void on(){
		System.out.println("켜다.");
	}
	public void off(){
		System.out.println("끄다.");
	}
	*/
	
	// 하는일만 다르니 오버라이드
	public void work(){
		System.out.println("주파수를 잡아서 소리를 들려준다.");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("음악을 들려준다.");
	}
}

public class Ex05 {

	public static void main(String[] args) {
//		Tv tv = new Tv();
//		tv.on();
//		tv.work();
//		tv.off();
		
//		Radio ra = new Radio();
//		ra.on();
//		ra.work();
//		ra.off();
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("1.tv리모콘  2.radio리모콘  3.audio리모콘  > ");
		String input = sc.nextLine();
		
		
		// 다형성!!!
//		Object remote; // 밖에서 선언 // 상위타입으로 하면 모두 해결
		Machine remote = null;
		
		// 다형성과 오버라이드를 이용한 객체지향의 설계방식 
		if(input.equals("1")){
			remote = new Tv(); // 안에서 대입
		}else if(input.equals("2")){
			remote = new Radio();
		}else if(input.equals("3")){
			remote = new Audio();
		}
		
		remote.on();
		remote.work();
		remote.off();
		
		

	}

}
