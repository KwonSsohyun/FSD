package com.hi;

class Lec06 implements Runnable{ // class Lec06 extends Thread 
	// https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
	// java.lang >> Interface Runnable
	
	// 런어블Runnable 상속받아서, 쓰래드Thread 객체 생성해서 생성자로 주입한다.
	
	public void run(){
		System.out.println("new Thread start");
		System.out.println("thread end");
	}
}


public class Ex06 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		// Thread thr = new Thread();
		// thr.start();
		
		// Lec06 thr = new Lec06();
		// thr.start();
		
		Lec06 lec = new Lec06();
		// run 메서드 구현 
		// 생성자 주입
		Thread thr = new Thread(lec);
		thr.start();

		System.out.println("main end");
	}

}
