package com.hi;

public class Ex05 {

	// ��������
	// static �̵� , non-static�̵� ���ָ� ���� �ʴ´�.
	// Ŭ���� ����, ��������
	public static int b=2222;

	// �ɹ��ʵ�, �ν��Ͻ�
	// non-static�̴ϱ� ���� non-static�̸� ����� ���µ�, 
	// static�� ��쿡�� new�����ڽἭ ��ü�� �����Ѵ�.
	// �� �ּҰ��� �������ٰ� �ּҰ��� �����Ѵ�. �� Ex05 ccc = new Ex05();
	public int c=3333;
	
	public static void main(String[] args) {
		// ��������
		int a = 1111;
		System.out.println(a);
		System.out.println(b);
		
		Ex05 cc = new Ex05();
		System.out.println(cc.c);
	}
	
	public static void mm(){
		Ex05 ccc = new Ex05();
		System.out.println(ccc.c);
		System.out.println(b);
	}
	
	public void ccc(){
		System.out.println(b);
		System.out.println(c);
	}
	


}
	