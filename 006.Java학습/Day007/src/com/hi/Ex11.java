package com.hi;

public class Ex11 {
//	�л� ���� ���� ���α׷�(ver 0.2.0)
//	1. �Է�(3) 2. ��� 0.���� > 
//	�Է��� �� 3��(��)����
//	3���� �Է��� ������ "�Է��� �������ϴ�" ��� �޽��� ����x
//	���� : ����, ����, ����
//	����� ǥ�� ���
//	�����ϰ� ���� �� ����
	
	public static int[] kor = new int[3];
	public static int[] eng = new int[3];
	public static int[] math = new int[3];
	public static int count = 0;
	
	
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true) {
			System.out.println("�л� ���� ���� ���α׷�(ver 0.2.0)");
			System.out.print("1. �Է� | 2. ��� | 3. �ʱ�ȭ | 0. ���� > ");
			try {
				switch(Integer.parseInt(sc.nextLine())){
				case 0: System.out.println("����");return;
				case 1: input();break;
				case 2: output();break;
				case 3: reset();break;
				default : System.out.println("1, 2, 3, 0�� �Է����ּ���.");
				}
			} catch(Exception e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			} finally {
				System.out.println();
			}
		}
	}
	
	
	
	public static void input() {
		if(count == 3) {
			System.out.println("�Է��� �������ϴ�");
			return;
		}
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			System.out.println(count+1 + "�й��� ������ �Է��մϴ�.");
			System.out.print("���� : ");
			kor[count] = Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
			eng[count] = Integer.parseInt(sc.nextLine());
			System.out.print("���� : ");
			math[count] = Integer.parseInt(sc.nextLine());
			System.out.println("�Է� �Ϸ�");
			System.out.println(count+1 + "����" + "\t���� : " + kor[count] + "\t���� : " + eng[count] + "\t���� : " + math[count]);
			count++;
		} catch(Exception e) {
			System.out.println("���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		} finally {
			System.out.println();
		}
	}
	
	
	
	public static void output() {
		if(count == 0) {
			System.out.println("�Է����� �ʾҽ��ϴ�");
			return;
		}
		System.out.println("���� \t|���� \t|���� \t|����");
		System.out.println("=======================================");
		for(int i = 0; i < count; i++) {
			System.out.println(i+1 + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i]);
		}
		System.out.println("=======================================");
	}
	
	
	public static void reset() {
		for(int i = 0; i > 3; i++) {
			kor[i] = 0;
			eng[i] = 0;
			math[i] = 0;
		}
		count = 0;
		System.out.println("�ʱ�ȭ�� �Ϸ� �Ǿ����ϴ�.");
	}
}
