package com.hi;

public class Ex04 {
	
	public int su = 1111;
	
	public Ex04(){
		System.out.println("1. su = " + su);
	}
	
	public Ex04(int su){
		this.su = su; // �ʱ�ȭ �� ����
		System.out.println("2. su = " + this.su); // ��ü �ڱ��ڽ��� this ��������
	}
	
	public Ex04(Ex04 me){
		System.out.println("3. su = " + me.su);
	}

	public static void main(String[] args) {
//		Ex04 me = new Ex04(); // �⺻ ������ ȣ�� 
		Ex04 me2 = new Ex04(2222); // ������ (���ڰ� ������)���� ���� ������ ȣ��
		Ex04 me3 = new Ex04(me2); 
	}

}
