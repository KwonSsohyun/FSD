package com.hi;

public class Ex08 {
	
	// ���� ���� (Ŭ���� ����)
	// ������ ���� ���� ����
	public static int su1=0; // static
	
	// ��ü�� ���� (�ν��Ͻ� ����)(�ɹ��ʵ�)
	public int su2=0; // non-static
	// ��ü ������ �����ȿ� �Ұ�� ��ü�� �������� �Ǵϱ� ������ �ƴϰ� �ʱ��

	public static void main(String[] args) {
		// func01(); >> 0 1 2
		// func01(); >> 2 3 4 // ȣ���Ҷ����� ���� ����
		/*
		Ex08 me = new Ex08();
		me.func02(); >> 0 1 2 
		me.func02(); >> 2 3 4 
		*/
		
		// �ݺ���
		for(int i=0; i<3; i++){
			Ex08 me = new Ex08(); // ��ü�� 3�� ���� (�̶� ���οü���� ����� ȣ���ϴ�) �ʱ�ȭ��. // �� ��ü ������ ������ ������ �׷�
			me.func02(); // �̰͸� ������ ������
		}
		
		/*
		Ex08 me = new Ex08();
		me.func02();
		*/
	}
	
	
	public static void func01(){ // static
		System.out.println(su1);
		su1++;
		System.out.println(su1);
		su1++;
		System.out.println(su1);
	}
	
	
	public void func02(){ // non-static
		System.out.println(su2+", su1 : "+su1++); // su1++ �̰� static�̴� ���� ������ �翬�� class�����̴ϱ�
		su2++;
		System.out.println(su2+", su1 : "+su1++);
		su2++;
		System.out.println(su2+", su1 : "+su1++);
	}

}
