package com.hi;

// ��ü������ �������� ����� ���ؼ��� ����� ������ ������ �ʵ� ���� (�������̵�)

abstract class Lec03{ // �⺻ ���������� defalt �׷��� �����ڰ� public�� �⺻�̾, com.hi�ȿ����� ����Ѵ�. (���� ������)
	public Lec03(int a){ // �����ڰ� ���ڰ� ������ ��ӹ޴°��� ����Ʈ ������ ������ְ� ���ް� ��� �Ѵ�.
		super();
	}
	
}

public class Ex03 extends Lec03{ // ���
	
	// ����Ʈ ������ �ڵ� ����
	// �⺻ public -> ����Ʈ �������� ���������ڴ� public
	// ��������� ����Ʈ �����ڸ� ����� ó������� ó�� ����
	public Ex03(){
		super(1111); // ��������� ȣ��ǰ�, �״��� �� ��
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
