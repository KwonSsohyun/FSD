package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		
		char[] arr1 = {'a' , 'b' , 'c' , 'd'};
		String msg1 = new String(arr1); // ���Ϲ��� ���ڿ��� �����.
		System.out.println(msg1);
		
		char[] arr3 = msg1.toCharArray(); // ���ڿ��� ������ ���Ϲ��� �迭�� ���� String�� �޼���(��������)(�迭�� ��������) 
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		byte[] arr2 = {65, 66, 67, 68}; // �ƽ�Ű�ڵ� A,B,C,D
		String msg2 = new String(arr2); // byte�� String���� ��ȯ
		System.out.println(msg2);
		
		byte[] arr4 = msg2.getBytes(); // ���ڿ��� byte �迭�� ����
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}

	}

}
