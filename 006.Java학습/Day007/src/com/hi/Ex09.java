package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// �л������������α׷� (ver 0.2.0)
		// 1.�Է�(3��)  2.���  0.����  >
		// �Է��� �� 3��
		// 3���� �Է��� ������ "�Է��� �������ϴ�." ��� �޽��� ����
		// ���� : ����, ����, ����
		// ����� ǥ�� ���
		// �����ϰ� ���� �� ����
		// -------------------------------------
		
		System.out.println("�л������������α׷� (ver 0.2.0)");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		String input;
		int sc;
		boolean boo = true;
		String[] sub = new String[]{"����", "����", "����"};
		int[] stu1 = new int[3];
		int[] stu2 = new int[3];
		int[] stu3 = new int[3];
		int i = 1;
		
		
		while(true){
			System.out.println("1.�Է�  2.���  0.����  >");
			
			input = scan.nextLine(); // ���ڿ� "�Է�"
			sc = Integer.parseInt(input); // �Է¹����� ���ڿ� -> ������ ����
			
			//�Է�
			switch(i){
				case 1 : 
					System.out.println(sub[0] + " �Է����ּ���.");
					input = scan.nextLine();
					sc = Integer.parseInt(input);
					stu1[0] = sc;
	
					System.out.println(sub[1] + " �Է����ּ���.");
					input = scan.nextLine();
					sc = Integer.parseInt(input);
					stu1[1] = sc;

					System.out.println(sub[2] + " �Է����ּ���.");
					input = scan.nextLine();
					sc = Integer.parseInt(input);
					stu1[2] = sc;
					break;
			}
			
			// ���
			if(sc==2){
				System.out.println(stu1[0]);
				System.out.println(stu1[1]);
				System.out.println(stu1[2]);
			}
			
			
		}	
		
		
		// System.out.println(stu1[1]);
		// System.out.println(stu1[2]);
		// System.out.println(stu2[0]);
		// System.out.println(stu2[1]);
		// System.out.println(stu2[2]);
		// System.out.println(stu3[0]);
		// System.out.println(stu3[1]);
		// System.out.println(stu3[2]);
		
		
	}

}
