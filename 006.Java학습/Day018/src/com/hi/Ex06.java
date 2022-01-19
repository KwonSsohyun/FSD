package com.hi;

class Lec06 implements Runnable{ // class Lec06 extends Thread 
	// https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html
	// java.lang >> Interface Runnable
	
	// �����Runnable ��ӹ޾Ƽ�, ������Thread ��ü �����ؼ� �����ڷ� �����Ѵ�.
	
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
		// run �޼��� ���� 
		// ������ ����
		Thread thr = new Thread(lec);
		thr.start();

		System.out.println("main end");
	}

}
