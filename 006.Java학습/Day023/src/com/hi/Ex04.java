package com.hi;

public class Ex04 extends Thread{
	
	// �����ڸ� ����� �θ� ����
	public Ex04(String name){	
		super(name); // �����带 �̾߱���
		// Thread Ŭ������ �����ڸ� ȣ����
	}

	public static void main(String[] args) {
		// ����� ������
		// ������ ���ؼ� �ϱ�
		Ex04 thr1 = new Ex04("ù��°");
		// thr1.setName("ù��°");
		thr1.start();
	}

	@Override
	public void run() {
		System.out.println(getName() + "run...");
	}
}
