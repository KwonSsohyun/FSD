package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// �ֹι�ȣ �˻��
		
		int age = 2021;
		char gender = '��';
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�ֹι�ȣ �˻��");
		System.out.print(">>>");
		String msg = sc.nextLine(); // "950501-2031800";   // 
		///// �������̼� üũ (�� üũ)
//		if(){
//			return;
//		}
		///////////////////////////////
		char[] arr = msg.toCharArray();
		
		// ���ǿ� ���� 2000���� ������ . 1900�� ������
		int year = 2000+(arr[0] - '0')*10+(arr[1] - '0'); // 0�� 48 
		// *10�� 10�� �ڸ� 
		
		if(arr[7] =='1' || arr[7]=='2'){
			year -= 100; // 1900�� ���ϴ� �Ͱ� ����.
		}
		
		age = age - year + 1; // age -= year-1;
		
		if(arr[7] == '1' || arr[7] =='3'){
			gender = '��';
		}
		
		System.out.println(" ����� " + age + "�� " + gender + "���Դϴ�.");

	}

}
