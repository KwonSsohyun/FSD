package com.room802;

public class Ex17 {

	public static void main(String[] args) {
		// �л� �������� ���α׷�(ver 0.1.0)
		// �� 3��
		// -----------------------------------
		// �л� �������� ���α׷�(ver 0.1.0)
		// 
		// 	1�й�  ���� > 90
		//  1�й�  ���� > 80
		//  1�й�  ���� > 70
		
		// 	2�й�  ���� > 91
		//  2�й�  ���� > 81
		//  2�й�  ���� > 71
		
		// 	3�й�  ���� > 92
		//  3�й�  ���� > 82
		//  3�й�  ���� > 72
		
		// 1. �Է�  2. ����Ʈ  > 2
		// --------------------------------------------
		// �й�	 | ����		| ����  	| ����
		// 1       90         80          70
		// 2       91         81          71
		// 3       92         82          72
		// --------------------------------------------		
		
		System.out.println("�л� �������� ���α׷�(ver 0.1.0)");
		String[] k1 = new String[]{"����", "����", "����"};
		String[] stu1 = new String[9];

		java.util.Scanner scan = new java.util.Scanner(System.in); // �Է¹ޱ� ���� ��ġ
		
		for(int i=0; i<9; i++){
				
			System.out.println("0�й� "  + " >");
			stu1[i] = scan.nextLine(); // �Է� �޴� �ڵ�
			// Integer.parseInt(stu1[i]); // ���ڿ� ���ڷ� ��ȯ
			
		}
		
		for(int i=0; i<9; i++){
			System.out.println(stu1[i]);
		}
		
		
		
		
		

	}

}
