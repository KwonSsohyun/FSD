package com.hi;

public class Ex05 extends Thread{ // java.lang.Thread 가 있다.(상속 받아서 쓴다.)
	// java.lang >> Class Thread
	// https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
	// 쓰래드 클래스를 상속 받아서 쓴 상황
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		Ex05 me = new Ex05();
		// (약속된 키워드) 새로운 쓰래드를 호출 ▶ .start(); 
		me.start(); // 새로운 스레드객체를 만들고 실행
		
//		Ex05 you = new Ex05();
//		// 새로운 쓰래드를 호출 ▶ .start();
//		you.start();
		
		System.out.println("main end");
	}
	
	// run이라는 Thread 메서드 오버라이딩함
	public void run(){ // ▶▶ 쓰래드의 메인 메서드
		System.out.println("thread start");
		
		
		try{
			// 5초 쉼
			Thread.sleep(5000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
		System.out.println("thread end");
	}
}
