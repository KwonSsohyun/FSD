package com.hi;
//�� Day011 > Ex07
public class Ex06 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		// 1 user1 1 2 3\n
		// 2 user2 44 55 66
		// 3 user3 77 88 99
		
		// 1 user1 1 2 3\n	2 user2 44 55 66\n	3 user3 77 88 99 >> \n �߶󳽴�.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.6.0)");
		
		// ����ٰ� �����ϸ� ���� �����ؼ� �� �� �ִ�.
		// ��� �ȿ��� ���� �ʱ�ȭ �Ǵϱ�.
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
				input = sc.nextLine(); // ������ �й� �Է���
				
				String[] st = data.split("\n"); // \n�������� �迭�� �ڸ� // �Է��� ������ ���� �������.
				
				data = "";
				for(int i=0; i<st.length; i++){
					if(!st[i].startsWith(input+"\t")){
						data = data + st[i] + "\n";
//						data+=st[i] + "\n";
					}
				}
				
				
			}else if(input.equals("4")){
				// ����
				System.out.println("������ �й��� �Է����ּ���.");
				input = sc.nextLine(); // ������ �й� �Է���
				
				String[] st = data.split("\n"); // \n�������� �迭�� �ڸ� // �Է��� ������ ���� �������.
				
				data=""; // ������ �����ʹ� ����ڴ�.
				for(int i=0; i<st.length; i++){
					if(!st[i].startsWith(input+"\t")){
						data = data + st[i] + "\n";
					}else{
						data = data + input +"\t��";
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