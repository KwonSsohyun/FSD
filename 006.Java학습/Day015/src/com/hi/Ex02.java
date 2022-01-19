package com.hi;

class Outter03{
	
	// static ����Ŭ����
	static class Inner03{
		// �ʵ� (static / non-static)
		public static int su1 = 3333;
		public int su2 = 4444; // ��ü���, ���������� ���� ���� (non-static)
		
		// ������
		public Inner03(){
			
		}
		
		// �޼��� (static / non-static)
		public static void func03(){
			//non-static ���� - ��ü���, ���������� ���� ���� (non-static)
			Outter03 outt = new Outter03();
			System.out.println(outt.su2);   																 //  �� 2222
			// static ����
			// System.out.println(Outter03.su1);
			System.out.println(su1); // (static) ���δϱ� ���� ���� - Inner03.
			// System.out.println(su2); // (non-static) ��ü�� ������ ���� �����ϴ� ���������� ���� ������	//  �� 3333
			System.out.println(Outter03.su1);																//  �� 1111
			Inner03 inn = new Inner03();
			System.out.println(inn.su2);																	//  �� 4444
		}
		public void func04(){ // non-static�̴ϱ� ��ü ������ (non-static������ ȣ�� ����)
			//non-static ���� - ��ü���, ���������� ���� ���� (non-static)
			Outter03 outt = new Outter03();
			System.out.println(outt.su2);																	//  �� 2222
			// static ����
			System.out.println(su1); // (static) ���δϱ� ���� ���� - Inner03.								//  �� 3333
			// System.out.println(su2); // (non-static) ��ü�� ������ ���� �����ϴ� ���������� ���� ������
			System.out.println(Outter03.su1);                                                               //  �� 1111
			System.out.println(su2);     // this �ڱ� �ڽ��� ����� �״ϱ�.                                  //  �� 4444
		} 
		
		
	}
	
	// ������
	public Outter03(){
		
	}
	
	// �ʵ� (static / non-static)
	public static int su1 = 1111;
	public int su2 = 2222;
	
	// �޼��� (static / non-static)
	public static void func01(){
		System.out.println(Outter03.su1); // �� Ŭ���� ���̶� ���� ���� - Outter03. //  �� 1111
		// static ����
		System.out.println(Inner03.su1); 											  //  �� 3333
		//non-static ���� - ��ü���, ���������� ���� ���� (non-static)
		Inner03 inn = new Inner03();
		System.out.println(inn.su2);												  //  �� 4444
	}
	public void func02(){
		// static ����
		System.out.println(Inner03.su1);										      //  �� 3333
		//non-static ����
		Inner03 inn = new Inner03();
		System.out.println(inn.su2);												  //  �� 4444
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		// �ٱ�Ŭ���� ����
		// static ����
		System.out.println(Outter03.su1);
		//non-static ���� - ��ü���, ���������� ���� ���� (non-static)
		Outter03 outt = new Outter03();
		System.out.println(outt.su2);
		
		
		
		// ����Ŭ���� ����
		// static ����
		System.out.println(Outter03.Inner03.su1); // .Inner03 �ȿ� ������ �տ� Outter03. �����ش�.
		//non-static ���� - ��ü���, ���������� ���� ���� (non-static)
		// Inner03 ��ü ����
		Outter03.Inner03 inn = new Outter03.Inner03();
		System.out.println(inn.su2);
	}

}
