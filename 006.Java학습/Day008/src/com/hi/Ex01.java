package com.hi;


public class Ex01 {	
	// ��������
	public static int[] kor = new int[3];
	public static int[] eng = new int[3];
	public static int[] math = new int[3];
	public static int count = 0; 
	
	
	public static void main(String[] args) {
		// �л������������α׷� (ver 0.2.0)
		// 1.�Է�(3��)  2.���  0.����  >
		// �Է��� �� 3��
		// 3���� �Է��� ������ "�Է��� �������ϴ�." ��� �޽��� ����
		// ���� : ����, ����, ����
		// ����� ǥ�� ���
		// �����ϰ� ���� �� ����
		// -------------------------------------

		
		System.out.println("�л������������α׷� (ver 0.3.0)");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Ex01 in = new Ex01();
		
		while(true){
			System.out.println("1.�Է�  2.���  0.����  >");
			int sc = Integer.parseInt(scan.nextLine()); // scan.nextLine �� ���ڿ� �Է� / Integer.parseInt() �� ���ڿ� > ������ ����

			switch(sc){
				case 1 : // �Է� 
					in.input();
					break;
				case 2 : // ���
					in.print();
					break;
				case 0 : // ����
					in.end();
					return;
				default : System.out.println("0, 1, 2 ���ڸ� �Է��ϼ���."); 
			}
		}
	}
	
	
	public void input(){ // �Է�
		if(count<=3){
			java.util.Scanner scan = new java.util.Scanner(System.in);
			System.out.println("���� �Է����ּ���.");
			kor[count] = Integer.parseInt(scan.nextLine());
		
			System.out.println("���� �Է����ּ���.");
			eng[count] = Integer.parseInt(scan.nextLine());
		
			System.out.println("���� �Է����ּ���.");
			math[count] = Integer.parseInt(scan.nextLine());
		
			count++;
		}
		else if(count>3){
			System.out.println("�Է�Ƚ�� �ʰ�����ϴ�.");
			return;
		}
	}
	
	
	public void print(){ // ���
		System.out.println("���� \t| ���� \t| ����"); 
		System.out.println("-----------------------------------------");
		System.out.println(kor[0] + "\t" + eng[0] + "\t" + math[0]);
		System.out.println(kor[1] + "\t" + eng[1] + "\t" + math[1]);
		System.out.println(kor[2] + "\t" + eng[2] + "\t" + math[2]);
		System.out.println("-----------------------------------------");
	}
	
	public void end(){ // ����
		System.out.println("���α׷��� �����ϰڽ��ϴ�.");
	}
	
	
}
