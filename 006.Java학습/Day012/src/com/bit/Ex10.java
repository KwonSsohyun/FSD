package com.bit; // ��Ű���� �ٸ��ϱ� ���� ������ ����


//�ѹ������� �ϳ��� public Ŭ������ ���� �� �ִ�.

// ���������� 
// public > protected >= default > private

// 256p
// Ŭ�������� public / default
// ������ / �ʵ� / �޼ҵ�  >> 4���� ��� �� �� �ִ�.

// ������ : protected : ����� ���ؼ��� ���ڴ�.
//        : private : ����Ʈ ������ �� ���� (��ü ������ �ȵ�) ���������� ���� �ʿ䰡 ���� static


public class Ex10 { // Ŭ������ Public�̳ĵ� �߿� ���� �켱������ Ŭ���� ���� // Ŭ���������� private �Ұ�
	
	public static int su1 = 1000;  // public ������ - ��� ���� ���
	static int su2 = 2000;		   // default ������ - ������Ű�� ���ο����� �������
	private static int su3 = 3000; // private ������ - �ش�Ŭ���� ���ο����� ���	
	protected int su4 = 4000;	   // protected ������ - default �� ���� >> ��! ����� ���ؼ��� ���� ���
	
	// ������
	public Ex10(){
		
	}
	
	public static void func(){
		System.out.println(su3);
	}

}
