package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// < Java API (jdk 1.8 api) >
		// java.lang �� �״�� �� �� �ִ�. 
		
		// ���ڿ� (���ڵ��� ����)
		String st1 = null; // ��ü�� ����. (����Ű�°� ����.) �� null
//		str1.equals(""); // ��ü�� ���µ� �޼��带 ��� ȣ���� >> ����
		
		st1 = "java"; // ��ü�� �ִµ� ������Ʈ�� ����.
//		st1.equals("");
		st1 = new String("java"); // ��ü�� ������ null�� �ƴ�

		String st2 = "java";
		
		// ���ڿ��� (������ ��) �� equals�޼���
		System.out.println(st1.equals(st2));
		// == >> �̰� ��ü �ּҰ� ��
		
		
		char[] arr1 = st2.toCharArray(); // ���ڿ� >> ���Ϲ��ڷ� ������ ����
		String st3 = new String(arr1); // ���� !!
		System.out.println(st3);
		
		byte[] arr2 = st2.getBytes();
		String st4 = new String(arr2,1,2); // 1, 2 (�ε�����ȣ, ����)
		System.out.println(st4);

	}

}
