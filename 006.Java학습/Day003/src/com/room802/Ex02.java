package com.room802;

public class Ex02 {

	public static void main(String[] args) {
		
		// ���� ���� (�ڷ���)
		byte a; // 1byte
		short b; // 2byte
		int c; // 4byte
		long d; // 8byte
		
		float e; // 4byte (�÷��� ���� ���� �� �ִ�)(ǥ�������� �� ũ�� ����)
		double f; // 8byte
		char g;
		boolean boo;
		
		// ���� �ʱ�ȭ
		a = 1;
		b = 2;
		c = 3;
		d = 4L;
		e = 3.14f;
		f = 3.14;
		g = '��';
		boo = true;
		
		d = c; // �ڵ�����ȯ
		c = b; // �ڵ�����ȯ
		c = (int)d;
		e = (float)f;
		e = d;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(boo);


	}

}
