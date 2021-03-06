package com.hi;

public class Ex06 extends Thread{

	public static void main(String[] args) {
		// 메인도 쓰래드
		Ex06 me = new Ex06();
		me.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
			// 쓰래드 클래스에는 sleep이라는 메서드있다. 
			try {
				// ▶ 1초 쉬는 것
				// 1000분의 1초
				// ▶ static키워드니까 상속받았어도, 이와 같이 적는게 맞다.
				// ▶ Thread.sleep();
				Thread.sleep(1000);
				// sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
