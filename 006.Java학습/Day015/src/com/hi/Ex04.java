package com.hi;

class Outter05{
	public static int su1 = 1111;
	public int su2 = 2222;
	
	public Outter05(){}
	
	public static void func01(final int su5){ // �޼ҵ� ȣ���������� ���� ���ϴ� ȣ���ؾ߸� class��� ���� (�ش� �޼��� �ȿ�����)
		// ����Ŭ����
		class Inner05{ // ������ �ؾ߸� �÷������� �տ� static �� ����
			int su5 = 5555;                     // jdk 1.8���� final ���� ����
			// final int su5 = 5555;            // ���Ϲ����� ������ final ��������
			public final static int su3 = 3333; // final �� ����
			public int su4 = 4444;
			public Inner05(){}
			public void func03(){
				System.out.println(su4);
				System.out.println(su1);
				// ���� non-static�̸� �����ߴµ� su2�� �Ұ�
				// System.out.println(su2);
				System.out.println(su3);
				System.out.println(su5);
			}
			
		}
		
		// su5++; // ������ final�� �� �ٲ۴ٴ°Ŵϱ�
		
		// �̷��� �ؼ� ����� ���� �ִ�. (�޼ҵ� �ȿ�����)
		// Inner05�� non-static�̴ϱ� ��ü ����
		
		// final static ->> su3 ȣ��
		//System.out.println(Inner05.su3);
		
		// non-static ->> su4 ȣ��
		Inner05 inn = new Inner05(); 
		// System.out.println(inn.su4);
		inn.func03();
	}
	

}

public class Ex04 {

	public static void main(String[] args) {
		Outter05.func01(6666); // ���� 5555�� �� �� �ٲ۴ٴ°� �ƴ϶� �ش� �޼���ȿ��� ���� �� �ٲ۴ٴ� ��

	}

}
