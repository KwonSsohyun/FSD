package com.hi;

// �߻�޼��常 ������ �ִ°� �������̽�
// interface Inter01 >> ��ø� ���ϸ� default >> �ش� com.hi �ȿ����� �� �� ����

// �������̽� 
// ����   ���� public final static (�ش� Ű����� ���� ���� - �̵鸸 �� �� �־)
// �޼��� ���� public abstract     (�ش� Ű����� ���� ���� - �̵鸸 �� �� �־)

interface Inter01{ // >> �������̽� �������̽���(ù���ڴ빮��) 
	
	int su1 = 1111;
	// ���� public final static  �� �����Ȱ��� (���� �� �ٲ�)
	static int su2 = 2222;
	// �̰� �ʵ尡 �ƴ�, static�� �ö��ִ� ����
	public static int su3 = 3333;
	public final static int su4 = 4444;
	
	
	// ��ü�� ������ �ʵ嵵 ����, �����ڵ� ����.
	// public Inter01(){}
	
	// �������̵��ؼ� ���ٴ� ���ǰ� �ִ�.
	public abstract void func01(); // ������ ������ ���°Ŵ�
	public void func02(); // abstract �߻�Ű���� ���� ���� 
	// ���� �߻�޼��常 �����Ƿ� ���� ����
	// �ٸ�, �߻�Ŭ���������� �߻�޼��常 ������ ���� �ƴ� �Ϲݸ޼��嵵 ���� �� �ֱ⿡ abstract �߻�Ű���� ������ �Ұ���

	void func03(); // ����Ʈ�� public ���������ڵ� ���� ���� (������ public�̱� ������)
	// �� public abstract �����Ȱ���
}

public class Ex04 {

	
	
	public static void main(String[] args) {
		System.out.println(Inter01.su4);
//		System.out.println(Inter01.su4++); 

	}

}
