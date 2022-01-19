package com.hi;
class ThreadA2 extends Thread{ 
	public boolean stop = false; // 종료 플래그 
	public boolean work = true; // 작업 진행 여부 플래 
	public void run() { 
		while(!stop) { 
			if(work) { 
				System.out.println("ThreadA가 작업중입니다."); 
			}else { 
				Thread.yield(); // work false시, 다른 스레드에 양보
			} 
		} 
		System.out.println("ThreadA가 종료되었습니다."); 
	}
}
class ThreadB2 extends Thread{ 
	public boolean stop = false; // 종료 플래그 
	public boolean work = true; // 작업 진행 여부 플래 
	public void run() { 
		while(!stop) { 
			if(work) { 
				System.out.println("ThreadB가 작업중입니다."); 
			}else { 
				Thread.yield(); // work false시, 다른 스레드에 양보
			} 
		} 
		System.out.println("ThreadB가 종료되었습니다."); 
	}
}

public class Ex14 {

	public static void main(String[] args) { 
		ThreadA2 threadA = new ThreadA2(); 
		ThreadB2 threadB = new ThreadB2(); 
		threadA.start(); 
		threadB.start(); 
		threadB.work = false; // thread A만 실행
		try { 
			Thread.sleep(3000); 
		} catch (InterruptedException e) { 
			
		} 
		threadB.work = true; // thread B만 실행
		threadA.work = false; // thread B만 실행 
		try { Thread.sleep(3000); 
		} catch (InterruptedException e) { 
			
		} 
		threadA.work = true; // thread A, B 둘다 실행 
		try { Thread.sleep(3000); 
		} catch (InterruptedException e) { 
			
		} 
		threadA.stop = true; 
		threadB.stop = true; // 둘다 종료 
	}

}
