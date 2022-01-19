package com.hi;

public class Ex11 extends Thread{
	
	public void run(){
		System.out.println(getName() + "start...");
		
		try {
			// 30�� ���� (���ŷ) �ɷȴµ�
			Thread.sleep(30000);
			System.out.println("30�� �����ٿ�"); // ��� �ȳ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + "end...");
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();
		me.start();
		// ������ ���δ�� ����� (���ε� �ϳ��� ������ϱ�)
		try {
			// 5�� ��
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// �ͼ��� �߻��ϰ� �ϴ� �ڵ�
		// ������ ���·� ���� 
		// 10������ ���������� try �������ͼ� catch�� ��
		// 15�� ���� "end..." �ֿܼ� ��µ�.
		me.interrupt();

	}

}
