package com.hi;

public class Ex03 implements Runnable{

	public static void main(String[] args) {
		
		Ex03 me = new Ex03();
		
		// ������ ��ü ����
		Thread thr = new Thread(me, "ù��° ");
		// �̸��� �ο����� �� .setName()
		// thr.setName("ù��°");
		thr.start();

	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "run...");
		
	}

}
