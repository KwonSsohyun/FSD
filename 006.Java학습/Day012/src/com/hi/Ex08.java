package com.hi;

class Lec08{ // final class  ����� �ź� >> final class Lec08
	public final void func2(){ // �޼ҵ� final // �������̵��� �ź� (����°�)(�� �ٲٴ°� �ź�) - 24������
		
	}
}

public class Ex08 extends Lec08{ // ���
	
//	public final static int su1 = 1111; // static ����� ���� // ����� �ʱ�ȭ�� ���ÿ� �ؾ��Ѵ�!
	public final int su2; // non-static ����� ���� // 
	
	
	public Ex08(int su){ // ������ - �ʵ尪 �ʱ�ȭ
		su2 = su;
	}
	
	public static void func(final int a){ // �Ű����� ��ȣ �ȿ��� �����ѰͰ� ����
//		a++; // ���⼭ ���� �ٲٴ°� �ȵ�
		System.out.println(a);
	}
	
//	public void func2(){}

	public static void main(String[] args) {
		
		Lec08 you = new Lec08();
		you.func2();
		Ex08 me = new Ex08(1111);
		me.func2();
		
		// final
		final int a;   // ����� ����
		a = 1111;
//		a = 2222; -> �� �ٲٸ� ����
		
		Ex08 me1 = new Ex08(1111);
		System.out.println(me1.su2);
		
		Ex08 me2 = new Ex08(2222); // ��ü�� ������� ��ÿ��� �ٸ� ������� ����� ������, final ��ü�� ��������� �������� �� �� �ٲ�
		System.out.println(me2.su2); 
		
		int c = 3333;		
		func(c);
		func(2222);
	}

}
