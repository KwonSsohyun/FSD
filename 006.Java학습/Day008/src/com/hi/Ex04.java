package com.hi;


class Ex33{
	// �ʵ�
	int a = 1111;
	
	// ������ ������ (�ڵ����� ������� >> ���ڰ� ������)
	public Ex33(){    }
}

class Ex333{
	int b = 2222;
	
	// ������
	public Ex333(){
		System.out.println("������ ȣ��");
	}
}

class Ex3333{
	int c = 3333;
	
	// ������
	public Ex3333(int su){ // ���ڸ� ���� ������
		c = su;
		System.out.println(c + "r���� �Ű������� �޴� ������");
	}
}



public class Ex04 {

	public static void main(String[] args) {
		
		java.io.InputStream is = System.in;
		
		java.util.Scanner sc;
		sc = new java.util.Scanner(is);
	 // sc = new java.util.Scanner(System.in);

		// Ŭ������ �������
		// 1. �޼���
		// 2. ��������
		// 3. ������
		
		// < �������� Ư¡ >
		//   ������ default �����ڸ� �ڵ����� ���� (���ڰ� ������/�Ű������� ������)
		//   public Ŭ������([�Ű�����]){������ �ڵ�;}
	    //   ���Ϲ���� ����. void �̷��� ����  (������ ��) ex) return a; -> �̷��� ����. return�� ����(�ڵ����� ����)
		//   ��ü ���������� ȣ���� �ȴ�. �� �ѹ��� �Ͼ.
		// ��ü�� �����ϴ°� �����ڸ� ȣ���ϴ� ���̴�.
		// �ɹ��ʵ� �ʱ�ȭ 
		 
		Ex33 ex33; // ������ ����
		ex33 = null; // �ʱ�ȭ
		ex33 = new Ex33(); // �������� ȣ��
				
		Ex333 ex333 = new Ex333();
	 // Ex3333 ex3333 = new Ex3333();
		Ex3333 ex3333 = new Ex3333(1234);
	}

}
