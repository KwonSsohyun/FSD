package com.hi;

public class Ex03 extends java.lang.Object { // �⺻ ��� ���� (ObjectŬ������ ��ӹް� �ִ�)
	// �θ� ��ӹް� �����״ϱ�. (��·�� �ֻ����� Object��� ����)
	// ��� Ŭ������ �ֻ���� "Object" ���ϻ��

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		System.out.println(me); // toString() ���ǰ� �Ǿ��մ°�
		
		// ������ ���µ� �� �� �ִ�.
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		
	}

	// �������̵�
	public String toString(){
		return "������"; // �������̵带 ���ؼ� �������ؼ� ������ �ִ�.
	}
}
