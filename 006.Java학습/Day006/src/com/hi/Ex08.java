package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		
		// ���� ���� �� ����(ver 0.1.0)
		
		// ������ �����մϴ�.
		// 1.���� 2.���� 3.�� > 1
		// ��� : ����, ��:����
		// �����ϴ�.

		// 1.���� 2.���� 3.�� > 2
		// ��� : ����, ��:����
		// �̰���ϴ�.
		
		// 1.���� 2.���� 3.�� > 3
		// ��� : ��, ��:��
		// �����ϴ�.
		
		// 1.���� 2.���� 3.�� 0.���� >
		// ���� 1�� 1�� 1��
		// �̿��� �ּż� �����մϴ�.
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("���� ���� �� ����(ver 0.1.0)");
		System.out.println("������ �����մϴ�.");
		
		// �ۿ� ����
		int boo = 0; // ����
		int win = 0; // �̱��
		int lose = 0; // ����
		
		for(int i=1; i<=3; i++){
			System.out.println("1.���� 2.���� 3.�� 0.���� >");
			String sn = scan.nextLine();
			int su = Integer.parseInt(sn);
			System.out.println(su);
			
		
			if(su==1){
				System.out.println("��� : ����");
			}
			else if(su==2){
				System.out.println("��� : ����");
			}
			else if(su==3){
				System.out.println("��� : ��");
			}
			else if(su==0){
				break;
			}
			else{
				System.out.println("1~3���� �ٽ� ���Է����ּ���.");
				i--;
				continue;
			}
		
		
			int ran = (int)(Math.random()*3)+1;
			if(ran==1){
				System.out.println("��ǻ�� : ����");
			}
			else if(ran==2){
				System.out.println("��ǻ�� : ����");
			}
			else{
				System.out.println("��ǻ�� : ��");
			}
		
			
			// ���
			if(su-ran==0){
				System.out.println("�����ϴ�.");
				boo++;
			}
		
			else if(su-ran==-2 || su-ran==1){
				System.out.println("�̰���ϴ�.");
				win++;
			}
		
			else{
				System.out.println("�����ϴ�.");
				lose++;
			}
			
			
		}
		System.out.println("����" + win + "��" + boo + "��" + lose + "��");
		System.out.println("�̿����ּż� �����մϴ�.");
		
		

			
		
		

		
		
		
		

	}

}
