package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		String[] msg = {"java" , "web" , "DB" , "framework"};
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("idx > ");	
		String input = sc.nextLine(); // ���ڿ��� �Է¹���
		int idx = 0;

		
		
		// ����ĳġ 
		// catch >> else if ���� ����
		try{
			idx = Integer.parseInt(input); // ����������
			System.out.println(msg[idx]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e){ 
			System.out.println("�ε�����ȣ�� 0~3���� �Դϴ�."); // �ϰ��� �ϴ��� ���´�.
		}catch(java.lang.NumberFormatException e){
			System.out.println("���� �Է��ϼ���.");
		}
		
		
		/*
		try{
			idx = Integer.parseInt(input); // ����������
		}catch(java.lang.NumberFormatException e){
			System.out.println("���� �Է��ϼ���.");
		}
		try{ // ����Ʈ ���� ������, 0���� ���� java����
			System.out.println(msg[idx]); // ������ try �ۿ��� �����ϱ�!
		}catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("�ε�����ȣ�� 0~3���� �Դϴ�.");
		}
		*/


	}

}
