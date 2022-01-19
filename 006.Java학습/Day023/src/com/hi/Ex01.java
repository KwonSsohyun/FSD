package com.hi;

public class Ex01 extends Thread{

	public static void main(String[] args) {
		
		// ���ε� �ϳ��� ������ϱ� �̸��� �޾ƺ���
		Thread thr = Thread.currentThread();
		String name = thr.getName();
		// ���� ������ �̸��� "main"
		System.out.println(name + " ���� ������ ����");
		
		
		// ������
		// ���鶧���� �̸��� �޶����°� �� �� �ִ�.
		// 0 -> 1 �̷��� ���������� ����ȴٴ� ������ ����.
		Ex01 me = new Ex01();
		me.start();
		Ex01 you = new Ex01();
		you.start();
		
		System.out.println(name + " ���� ������ ����");
	}
	
	// �����̿ܿ� ������ �κ� (����)
	// ���������� ó��
	// �� run ġ�� �����̽���
	@Override
	public void run() {
		
		
		// Thread[Thread-0,5,main]
		// Thread[Thread-1,5,main]
		// �ֱ��� ������ (��) -> getName() -> �� �̸� ������ �޾ƺ� �� �ִ�.
		Thread thr = Thread.currentThread();
		// true
		// Ex01��ü �� �׳� > this
		System.out.println(thr.hashCode() == this.hashCode());
		
		// ������ Ŭ������ ��ӹ޾ұ⿡ ��
		// �������� �̸� �޾ƿ� �� �ִ�. �� getName()
		String name = getName();
		// String name = this.getName();
		// this. ���� ������ϱ� > �̸� �������°� ����
		
		System.out.println(name + " ���ο� ������� �ϰ����ϴ� ��");
	}
}
