package com.hi;

public class Ex12 extends Thread{

	public void run(){
		System.out.println(getName() + "start...");
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + "end...");
	}
	
	
	// 사용시 참조 (오류코드 사유)
	// https://onecellboy.tistory.com/102
	public static void main(String[] args) {
		Ex12 me = new Ex12();
		Ex12 you = new Ex12();
		
		me.start();
		you.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		me.notifyAll();
	}

}
