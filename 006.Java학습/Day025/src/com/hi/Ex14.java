package com.hi;
class ThreadA2 extends Thread{ 
	public boolean stop = false; // ���� �÷��� 
	public boolean work = true; // �۾� ���� ���� �÷� 
	public void run() { 
		while(!stop) { 
			if(work) { 
				System.out.println("ThreadA�� �۾����Դϴ�."); 
			}else { 
				Thread.yield(); // work false��, �ٸ� �����忡 �纸
			} 
		} 
		System.out.println("ThreadA�� ����Ǿ����ϴ�."); 
	}
}
class ThreadB2 extends Thread{ 
	public boolean stop = false; // ���� �÷��� 
	public boolean work = true; // �۾� ���� ���� �÷� 
	public void run() { 
		while(!stop) { 
			if(work) { 
				System.out.println("ThreadB�� �۾����Դϴ�."); 
			}else { 
				Thread.yield(); // work false��, �ٸ� �����忡 �纸
			} 
		} 
		System.out.println("ThreadB�� ����Ǿ����ϴ�."); 
	}
}

public class Ex14 {

	public static void main(String[] args) { 
		ThreadA2 threadA = new ThreadA2(); 
		ThreadB2 threadB = new ThreadB2(); 
		threadA.start(); 
		threadB.start(); 
		threadB.work = false; // thread A�� ����
		try { 
			Thread.sleep(3000); 
		} catch (InterruptedException e) { 
			
		} 
		threadB.work = true; // thread B�� ����
		threadA.work = false; // thread B�� ���� 
		try { Thread.sleep(3000); 
		} catch (InterruptedException e) { 
			
		} 
		threadA.work = true; // thread A, B �Ѵ� ���� 
		try { Thread.sleep(3000); 
		} catch (InterruptedException e) { 
			
		} 
		threadA.stop = true; 
		threadB.stop = true; // �Ѵ� ���� 
	}

}
