package com.hi;

public class Ex08 extends Thread{

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " 시작");
		
		// 총 3개 쓰래드 일한다.
		// 메인 / thr1 / thr2
		Ex08 thr1 = new Ex08();
		Ex08 thr2 = new Ex08();

		thr1.start();
		thr2.start();
		
		// 이 실이 죽을 때까지 기다립니다.
		// 메인쓰래드는 맨 마지막에 실행하고 싶다면 ▶ .join()
		// Thread-0 > thr1
		// 쓰레드 1이 종료되서야 메인이 종료되는것을 볼 수 있다. ▶ thr1.join();
		// 모두 쓰래드 조인시키면 메인이 맨 마지막에 종료되는걸 볼 수 있다. ▶ thr1.join(); thr2.join();
		try {
			// 5초만 조인검 ▶▶ 5초뒤 main 종료되는걸 볼 수 있다. 
			thr1.join(5000);
			// thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " 종료");

	}
	
	@Override
	public void run() {
		// 누가 먼저 thr1 / thr2 할지는 몰라도
		// 쓰레드가 서로 교차로 일어나는것을 볼 수 있다.
		for(int i=0; i<10; i++){
			System.out.println(getName() + " 수행 : " + (i+1));
			try {
				// 1초 (1000분의 1초라서 > 1000이라 적으면 1초임)
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
