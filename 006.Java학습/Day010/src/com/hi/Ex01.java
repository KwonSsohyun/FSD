package com.hi;

// this
// �������� �ڱ��ڽ��� ����
// �ڱ��ڽ��� ��Ī�� ��� ��������(�����ϰ������� �ڵ�����)
// ���� non-static������ ��밡��

public class Ex01 {
	
	// �ʵ�
	public static int su1 = 1111; // static ������ this��� �Ұ� >> 47������ >> Ex01.su1 ����
	public int su2 = 2222; // non-static ������ this ��� >> 44������ >> this.su2 ����
	
	public Ex01(){
		
	}
	
	public static void func01(){ 
		com.hi.Ex01 me = new com.hi.Ex01(); // ��ü ����
		me.func03(); // ���������� ���� ����
		// static������ this�� ��� �Ұ�
	}
	
	
	public void func02(com.hi.Ex01 me){ // ��ü�� ���� �ʰ�, �Ű������� ���� �޴´�.
		//***************** ������ ��ü���� ���� ***************** 
//		com.hi.Ex01 me = new com.hi.Ex01();
		me.func03();
		this.func03(); // ���� non-static������ �����������̵� ȣ�� ���� (�տ� this�� �����Ǿ��ֱ� ����)
		// this��� Ű����� ���� non-static ������ ����� ��! (�������� ������ �ϴϱ�)
		System.out.println(me == this); // true
		
		//***************** ���ο� ��ü���� ���� *****************
		Ex01 you = new Ex01();
		you.func03();
	}
	
	
	public void func03(){
		// ���������� ���������� ���� �����(�̸��� ���� ���) >> �켱���� ����!!!
		int su1 = 4444;
		int su2 = 3333;
		System.out.println(su2);     // 3333 (��������)
		System.out.println(this.su2); // 2222 (��������)

		System.out.println(su1); // 4444 (��������)
		System.out.println(Ex01.su1); // 1111 (��������)
	}

	public static void main(String[] args) {
		com.hi.Ex01.func01(); // func01(); ���ᵵ �Ǵµ� ��������
		com.hi.Ex01 me = new com.hi.Ex01();
		me.func02(me);
	}

}
