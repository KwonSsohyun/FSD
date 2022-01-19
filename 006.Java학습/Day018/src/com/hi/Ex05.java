package com.hi;

public class Ex05 extends Thread{ // java.lang.Thread �� �ִ�.(��� �޾Ƽ� ����.)
	// java.lang >> Class Thread
	// https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
	// ������ Ŭ������ ��� �޾Ƽ� �� ��Ȳ
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		Ex05 me = new Ex05();
		// (��ӵ� Ű����) ���ο� �����带 ȣ�� �� .start(); 
		me.start(); // ���ο� �����尴ü�� ����� ����
		
//		Ex05 you = new Ex05();
//		// ���ο� �����带 ȣ�� �� .start();
//		you.start();
		
		System.out.println("main end");
	}
	
	// run�̶�� Thread �޼��� �������̵���
	public void run(){ // ���� �������� ���� �޼���
		System.out.println("thread start");
		
		
		try{
			// 5�� ��
			Thread.sleep(5000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
		System.out.println("thread end");
	}
}
