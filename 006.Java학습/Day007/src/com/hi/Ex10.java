package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); // ����Ʈ ��ĳ�� ���ž� ������ ��Ƽ�
		
		boolean boo = true;
		String temp;
		int input = 1;
		int cnt = 0;
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		
		while(boo){
			System.out.println("1.�Է�  2.���  0.����  >");
			temp = sc.nextLine(); // �Է¹޴� �ڵ�(�Է¹޴� ������ ���ڿ��� �ްڴ�.) .~�� // ��Ʈ���� �������� (���ڷ� ��ȯ�Ϸ���)
			input = Integer.parseInt(temp); // ���ڿ����� temp�� ���������� �ٲ۴�. intŸ���� input������ ��´�.
			
			// �Է�
			if(input==1){
				cnt++; // 1 , 2 , 3
				if(cnt<4){
					System.out.println("���� > ");
					temp = sc.nextLine(); // �Է��� �ް�
					kor[cnt-1] = Integer.parseInt(temp); // ���������� �ٲ۴�.
					System.out.println("���� > ");
					temp = sc.nextLine(); // �Է��� �ް�
					eng[cnt-1] = Integer.parseInt(temp); // ���������� �ٲ۴�.
					System.out.println("���� > "); 
					temp = sc.nextLine(); // �Է��� �ް�
					math[cnt-1] = Integer.parseInt(temp); // ���������� �ٲ۴�.
				}
				else{
					System.out.println("�Է��� �������ϴ�.");
					break;
				}
			}
			// ���
			else if(input==2){
				System.out.println("-----------------------------------------");
				System.out.println("����   | ����    | ����   ");
				System.out.println("-----------------------------------------");
				for(int i=0; i<3; i++){
					System.out.println(kor[i] + "   |" + eng[i] + "   |" + math[i]);
				}
				System.out.println("-----------------------------------------");
			}
			// ����
			else if(input==0){
				boo = false;
			}
		}

	}

}
