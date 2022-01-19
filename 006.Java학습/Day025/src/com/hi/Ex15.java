package com.hi;

public class Ex15 extends Thread{
	
	public void run(){
		System.out.println("데몬 스레드 시작");
		try {
			// 30초
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("데몬 스레드 종료");
	}

	public static void main(String[] args) {
		// 메인도 쓰레드
		System.out.println("main start....");
		Ex15 me = new Ex15();
		
		// 데몬 쓰래드 ▶ .setDaemon(true)
		// 디폴트 안주면 false
		// 메인에 종속되게 만들기
		// 메인이 죽으면 같이 죽음
		// 종속된 쓰레드 (라이프사이크)
		// ex) 5분단위로 임시저장
		me.setDaemon(true);
		
		me.start();

		try {
			// 메인 먼저 안죽게
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end....");
	}

}
