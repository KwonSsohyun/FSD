package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		// 1 user1 1 2 3\n
		// 2 user2 44 55 66
		// 3 user3 77 88 99
		
		// 1 user1 1 2 3\n	2 user2 44 55 66\n	3 user3 77 88 99 >> \n �߶󳽴�.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.6.0)");
		
		String data = "";
		String input = null;
		
	
		while(true){
			System.out.println("1.����  2.�Է�  3.����  4.����  0.���� > ");
			
			input = sc.nextLine();
			
			if(input.equals("0")){
				// ����
				return;
			}
			if(input.equals("1")){
				System.out.println("------------------------------------------");
				System.out.println("�й�\t���̸�\t������\t������\t������");
				System.out.println("------------------------------------------");
				System.out.println(data);
				System.out.println("------------------------------------------");
				
			}else if(input.equals("2")){
				// �Է�
				System.out.println("�й� > ");
				data+=sc.nextLine() + "\t��"; // ����
				System.out.println("�̸� > ");
				data+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				data+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				data+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				data+=sc.nextLine()+"\n"; // ����
				
			}else if(input.equals("3")){
				// ����
				System.out.println("������ �й��� �Է����ּ���.");
				input = sc.nextLine(); // ������ �й� �Է���. (���ڿ� �Է¹���)
				
				String[] arr = data.split("\n"); // ����������� �߶󳻼� ���ڿ� �迭�� ����
				// split ��ü�� �迭�� �߶� ����
				// \n ������ �������� �ڸ��� 
				// �й� ~ ���б��� arr1 ����
				// �����л��� �й� ~ ���б��� arr2�� ���� ���̴�.
				
				data = ""; // ���ڿ�
				for(int i=0; i<arr.length; i++){ // ���� �й��� ã�Ƴ��� // �ش� ������ �����ϳ� // �� ���������� ���ڿ��� �����ϱ�. \n
					if(!arr[i].startsWith(input+"\t")){ // false ����(startsWith - true/false �Ǻ�) // �Է¹����й�\t �� �ش繮�ڷ� ������ �ϴ��� Ȯ��
						data += arr[i]+"\n"; // ������ // ������ ����������� ���� ��������  // �����ϸ� ����
					}
				} // �й� �����ش� �л��� ���ԵǸ� �ڿ������� ���ڷ� ������ ���� �����Ȱ�ó�� �Ⱥ��̴°�
				
			}else if(input.equals("4")){
				// ����
				System.out.println("������ �й��� �Է����ּ���.");
				input = sc.nextLine(); // ������ �й� �Է���. (���ڿ� �Է¹���)
				
				String[] arr = data.split("\n"); // �迭�� ����
				
				data = "";
				for(int i=0; i<arr.length; i++){ // �� ���������� ���ڿ��� �����ϱ�. \n
					if(!arr[i].startsWith(input+"\t")){
						data += arr[i]+"\n"; // ������ ����������� ���� ��������
					}else{
						data+=input+"\t��"; // ���Ӱ� �Է� ���� // ����
						System.out.println("�̸� > ");
						data+=sc.nextLine()+"\t��";
						System.out.println("���� > ");
						data+=sc.nextLine()+"\t��";
						System.out.println("���� > ");
						data+=sc.nextLine()+"\t��";
						System.out.println("���� > ");
						data+=sc.nextLine()+"\n"; // ����
					}
				}
				
			}
			
		}

	}

}