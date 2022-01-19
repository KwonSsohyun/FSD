package com.hi;

public class Ex11 extends Thread{
	
	public void run(){
		System.out.println(getName() + "start...");
		
		try {
			// 30초 슬립 (블록킹) 걸렸는데
			Thread.sleep(30000);
			System.out.println("30초 쉬었다옴"); // 얘는 안나옴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + "end...");
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();
		me.start();
		// 메인은 메인대로 진행됨 (메인도 하나의 쓰레드니까)
		try {
			// 5초 쉼
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 익셉션 발생하게 하는 코드
		// 웨이팅 상태로 빠짐 
		// 10번라인 빠져나가서 try 빠져나와서 catch로 감
		// 15번 라인 "end..." 콘솔에 출력됨.
		me.interrupt();

	}

}
