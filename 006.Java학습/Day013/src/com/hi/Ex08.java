package com.hi;

// Exception Ŭ����
class MyException extends Exception{ // Exception Ŭ���� ��ӹ���
	public MyException(){
		// �θ� ������ ȣ��
		super("1�� ���� �� ����."); // 32�� �޽��� ����
	}
}

public class Ex08 {

	static void func(int a, int b) throws MyException{ // ������
		
		// ��������
		if(b==1){
			MyException ex = new MyException();
			throw ex;
		}
		int c= a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	
	public static void main(String[] args) {
		// 1�� ������ ������ �ó�����
		// ������ü ���� ������.
		
		try {
			func(6,1);
		}catch(MyException e){ // �ް�
			e.printStackTrace();
			System.out.println(e.getMessage()); // �޼����� ���������� null
		}
		
	}

}
