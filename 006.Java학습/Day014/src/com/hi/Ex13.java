package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		// crud
		
//		StringBuilder �� StringBuffer �� ����.
//		StringBuilder msg = new StringBuilder("abcd");
		StringBuffer msg = new StringBuffer("abcd");
		
		System.out.println(msg.append("efg"));
		
		// �߰��� ���� ���� .insert(�����ε�����ȣ, ��������);
		System.out.println(msg.insert(3, "ABC"));

		// ����
		// �տ��� 0���� ����.
		// �ڿ��� 1���� ����.
		System.out.println(msg.replace(3, 6, "123"));
		
		// �����
		// �տ��� 0���� ����.
		// �ڿ��� 1���� ����.
		System.out.println(msg.delete(3, 6));
	}

}
