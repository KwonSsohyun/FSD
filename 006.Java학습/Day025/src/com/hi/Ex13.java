package com.hi;
class WorkObject { 
	public synchronized void methodA() { 
		System.out.println("ThreadA의 methodA() 작업 실행"); 
		notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기상태로 만듬 
		try { 
			wait(); // ThreadA를 일시 정지 상태로 만듬 
		} catch (InterruptedException e) { 
			// ★ 트라이 캐치(try | catch (InterruptedException e)) 호출하는 것을 
			//   ▶ 해당 메서드 싱크로나이드(synchronized) 해야함
			e.printStackTrace(); 
		} 
	} 
	public synchronized void methodB() { 
		System.out.println("ThreadB의 methodB() 작업 실행"); 
		notify(); // 일시정지 상태에 있는 ThreadA를 실행 대기상태로 만듬 
		try { 
			wait(); // ThreadB를 일시 정지 상태로 만듬 
		} catch (InterruptedException e) { 
			// ★ 트라이 캐치에서 ▶ (InterruptedException e) 호출하는 것을 ▶ 메서드 싱크로나이드(synchronized) 해야함
				e.printStackTrace(); 
		} 
	}
}	
class ThreadA extends Thread{ 
		private WorkObject workObject; 
		
		public ThreadA(WorkObject workObject) { 
			this.workObject = workObject; 
			} 
		public void run() { 
			for(int i=0; i<10; i++) { 
				workObject.methodA(); // 공유객체의 methodA를 반복적으로 호출 
			} 
		}
}
class ThreadB extends Thread{ 
		private WorkObject workObject;
		
		public ThreadB(WorkObject workObject) { 
			this.workObject = workObject; 
		} 
		public void run() { 
			for(int i=0; i<10; i++) { 
				workObject.methodB(); // 공유객체의 methodA를 반복적으로 호출 
			} 
		}
}

public class Ex13 {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject(); 
		ThreadA threadA = new ThreadA(sharedObject); 
		ThreadB threadB = new ThreadB(sharedObject); 
		threadA.start(); 
		threadB.start();

	}

}
