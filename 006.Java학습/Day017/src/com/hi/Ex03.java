package com.hi;

class Lec03{
	// ���ָ� �߷� Ÿ��
	public static <T> T func(T obj){ // ��ü������ �Ű������� ���޹�������
		
		// Object obj = new Object();
		// System.out.println(obj.toString());
		System.out.println(obj.getClass()); // Ŭ���� ��������
		return obj;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// ��ü������ �ƴҶ� ���׸� �Ẹ��!

		// ������ Object Ÿ���̴ϱ� ��� Ÿ�� �� ��
		// int obj = 123;
		
		// �ٵ� �������� ���׸� ����.
		String obj = "java"; // -> ����  <Integer>�� �����߱� ����.
		//int obj = 123;
		//Lec03.<Integer>func(obj);
		String msg = Lec03.func(obj);
		// �������ָ�, �Ʒ��� �߷��ؼ� Ÿ���� �����ȴ�. �� Lec03. "<Integer>" func(obj);
		// �׷��� Ȯ���غ��� ������Ʈ�� �ƴ϶� �� class java.lang.String
		// String Ÿ���� �����°� �� �� �ִ�.
	}

}
