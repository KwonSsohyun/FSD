package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("main start");

		Thread thr = new Thread(){
			// 익명클래스
			public  void run(){
				System.out.println("new Thread start");
				System.out.println("thread end...");
			}
		};
		thr.start();
		
		
		System.out.println("main end");

	}

}
