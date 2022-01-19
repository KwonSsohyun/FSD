package com.hi;

public class Ex15 extends Thread{
	
	public void run(){
		System.out.println("���� ������ ����");
		try {
			// 30��
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� ������ ����");
	}

	public static void main(String[] args) {
		// ���ε� ������
		System.out.println("main start....");
		Ex15 me = new Ex15();
		
		// ���� ������ �� .setDaemon(true)
		// ����Ʈ ���ָ� false
		// ���ο� ���ӵǰ� �����
		// ������ ������ ���� ����
		// ���ӵ� ������ (����������ũ)
		// ex) 5�д����� �ӽ�����
		me.setDaemon(true);
		
		me.start();

		try {
			// ���� ���� ���װ�
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end....");
	}

}
