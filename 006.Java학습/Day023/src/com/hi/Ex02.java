package com.hi;

public class Ex02 implements Runnable{ // �������̽� Runnable ���

	public static void main(String[] args) {
		
		Ex02 work = new Ex02();
		// ������ ���� ��ü ����
		// start�� ȣ���ؼ� �����ڿ� ����!
		Thread thr = new Thread(work);
		thr.start();

	}
	
	// �ϰ����ϴ� ���� �������̵��ؼ� ������ش�.
	@Override
	public void run() {
		// �������̽� Runnable ��� �޾Ƽ� ����.
		// getName()�� ������Ŭ������ ������ �ֱ� ����.
		// String name = getName();
		
		// �̶��� ������ �̸� ��� �޾ƺ� ���̳�
		Thread me = Thread.currentThread();
		String name = me.getName();
		// String name = this.getName();
		// this�ȵ� > ��ӹ޾ұ� ������. > Ex02�̱� ������
		
		System.out.println(name + "������� �ϰ����ϴ� ��");
	}

}
