package com.hi;

public class Ex01 {
	
	public static void func01(Object a){}

	public static void main(String[] args) {
		// ���� Ŭ���� (����ڽ� & ��ڽ�) - ���÷� ����
		// ������ ���� ���
		// �ڽ� -> ��üȭ �ϴ� ��
		// ��ڽ� -> �⺻�ڷ������� �ϴ� ��
		
		/* api�� Ŭ������ ���� ���� �ϱ⿡
		   �⺻ �ڷ����� ����,
		   ����Ŭ������ ����Ǿ� �ִ�.
		*/
		
		// �⺻�ڷ����� ��ü Ÿ������ �ٲٴ� ��
		// �⺻�ڷ����� ��ü�� �ƴ�
		int a = 1111;
		Integer b = new Integer(2222); // ����Ŭ����
//		Double
//		Byte
//		������ ��Ī�Ǵ� Ŭ���� Ÿ��
		System.out.println(b+1);
		
		func01(new Integer(3333)); // �ڵ� �ڽ̵� (�ڵ����� �Ͼ)
		func01(3333);
//		func01(new Ex01());
	}

}
