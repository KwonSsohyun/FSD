package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// java.util >> Class StringTokenizer
		
		String msg = "java@web@db@@framework";
		String[] arr1 = msg.split("@");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		System.out.println("------------------------------");
		
		// StringTokenizer 
		// �ǹ̾��°� ���� (����ִ°� ����������)
		java.util.StringTokenizer token = new java.util.StringTokenizer(msg,"@"); // ����� ������
		while(token.hasMoreElements()){ // ���� ������ true
			System.out.println(token.nextToken()); // �������� ������
		}

	}

}
