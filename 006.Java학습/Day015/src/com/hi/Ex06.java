package com.hi;

interface Interr{
	void func02();
}

//class Lec06{
//	public static Interr func(){
//		/*
//		class Local implements Interr{ 
//			public void func02(){
//				System.out.println("����Ŭ���� ���");
//			}
//		}
//		*/
//		// ȣ���Ϸ���.
////		Local local = new Local();
////		local.func02();
//		
//		// �͸� Ŭ����
//		// = Ŭ������ �̸��� ���ֹ���
//		return;
//
//	}
//}

abstract class Lec06{
	public void func01(){}
	public abstract void func02();
}

public class Ex06 {
	
	/* ��������
	static Interr inter = (new Interr(){ 
		public void func02(){
			System.out.println("�͸�Ŭ���� ���");
		}
	});
	*/
	
	/*
	// �������̽��� ��ü�� ����
	// �������̽��� ��ü ���� ����
	// ���͸� ��ӹ޴� Ŭ���� = new ~~~
	// �ٵ� �� Ŭ������ �̸��� ���� -> �͸�Ŭ����
	Interr inter = new Interr(){ 
		public void func02(){
			System.out.println("�͸�Ŭ���� ���");
		}
	};
	*/
	

	public static void main(String[] args) {
//		Interr inter = Lec06.func();
//		inter.func02();
		
		// Lec06 inter = new ///// Lec06(){ -> Ŭ�����̸��� ������ ��ӹ޾Ѵٴ� Ű���嵵 �ƹ��͵� ����.
		// ������ Ȱ��
		Lec06 inter = new Lec06(){ 
			public void func02(){
				System.out.println("�͸�Ŭ���� ���"+this); // com.hi.Ex06$1 -> $ ����Ŭ����
			}
		};
		inter.func01();
		inter.func02(); // �������̵��� �͸�Ŭ���� ��ü // �� "�͸�Ŭ���� ���" ���
		
		/*
		Ex06 me = new Ex06();
		me.inter.func02();
		*/

	}

}