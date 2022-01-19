package com.hi;

class Outter04{
	// �ʵ� (static / non-static)
	public static int su1 = 1111;
	public int su2 = 2222;
	
	// ������
	public Outter04(){
		
	}
	
	// �޼��� (static / non-static)
	public static void func01(){
		// static ���� non-static ����
		// �� �ڽ� ���� ��ü ���
		Outter04 outt = new Outter04();
		
		Inner04 inn; 				
		inn = outt.new Inner04();   
		
		System.out.println(inn.su2);     //  �� 4444
	}
	public void func02(){
		// non-static ���� �� �ٷ� ���� ����
		// non-static ���� - ��ü���, ���������� ���� ���� (non-static)
		Inner04 inn = new Inner04();
		System.out.println(inn.su2);    //  �� 4444
	}
	
	// non - static ����Ŭ����
	class Inner04{ // final�� static ���
		// �ʵ� (static / non-static)
		// static ��� �Ұ�
//		public static int su3 = 3333; // class Inner04 >> class��ü�� non - static �̴ϱ� �÷����� �ʴµ� static�� �ɸ� ����.
		public final static int su3 = 3333; // ����� ���� (���� ������� ���ΰ� ����ŰŰ�� �ϸ� �ȴ�.)(���� �Ҵ� ����) // ������ ���
		public int su2 = 4444;
		
		// ������
		public Inner04(){
			
		}
		
		// �޼��� (static / non-static)
		// static ��� �Ұ�
//		public static void func03(){}
		public void func04(){
//			System.out.println(Outter04.su1);
			System.out.println(su1);															//  �� 1111
			// �̳�Ŭ���� ��ü�� non-static�̴ϱ� �̹� ��ü�� ������ ���¿����� ���� ���� 
			// ��ġ ����� ������ ��� super() ���� ������. �θ�� �� �� �ִ°� (�ٱ� �ƿ���)
			System.out.println(su2);															//  �� 4444
//			Outter04 outt = new Outter04(); // ��ü�� �������� �ٸ� ��ü�� ������ �Ǵ°�
//			System.out.println(outt.su2);
			
			// su2�� non-static�̴ϱ� ����ü ���� >> �ϰ� �Ǹ� ����ü��....
			// ����̾����� super.su2
			// ��ӿ����� �޼��常 �������̵�
			// ���� ����Ŭ���������� �ʵ�� �޼��尡 �������̵��Ǵ� ȿ��. (����������)
			//    �ٱ��� �ʵ尪 �� >> �׷��� ���� �ۿ� ��
			//    �ݸ� �̸��� �ٸ��� �������
			System.out.println(this.su2);														//  �� 4444
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// ����Ŭ���� ȣ���ϱ�
		// ���� Outter04�� static�̵� non-static�̵� �������
		//    Inner04 �� non-static�̱� ������ ��ü �����ϴ� ����
		Outter04 outt = new Outter04();
		Outter04.Inner04 inn = outt.new Inner04();
		System.out.println(inn.su2);

	}

}
