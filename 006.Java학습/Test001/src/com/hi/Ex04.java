package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.5.0)
		// ���߹迭 >>  [tot]�ѿ�  |  [0]�й� [1]�̸� [2]���� [3]���� [4]����
		System.out.println("�л������������α׷�(ver 0.5.0)");
		System.out.print("�ѿ� > ");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine(); // ���ڿ� �Է� �ޱ�
		int su = Integer.parseInt(sc);// �ѿ� >> ���ڿ� -> ���������� ����
		
		String[][] data = new String[su][];
		int count = 0;
		String empty = null; // String����Ʈ�� null (�� �ȵ�����)
		
		while(true){
			System.out.println("1.�Է�  2.����  0.���� > ");
			sc = scan.nextLine();

			if(sc.equals("1") && su!=count){ // ���ڿ��� ��
				// �Է�
				String[] stu = new String[5]; // 1�����迭 5�������� �迭 stu���� �־��� �� data 2�����迭�� [] �ް�ȣ�� �ش��ϴ� ������ ������
				System.out.println("�й� > ");
				sc = scan.nextLine(); 
				stu[0] = sc; // stu 5���� ������ �迭�� ���� ���� �Է��� �� [0]
				System.out.println("�̸� > ");
				sc = scan.nextLine();
				stu[1] = sc; // stu 5���� ������ �迭�� ���� ���� �Է��� �� [1]
				System.out.println("���� > ");
				sc = scan.nextLine();
				stu[2] = sc; // stu 5���� ������ �迭�� ���� ���� �Է��� �� [2]
				System.out.println("���� > ");
				sc = scan.nextLine();
				stu[3] = sc; // stu 5���� ������ �迭�� ���� ���� �Է��� �� [3]
				System.out.println("���� > ");
				sc = scan.nextLine();
				stu[4] = sc; // stu 5���� ������ �迭�� ���� ���� �Է��� �� [4]
				
				data[count++] = stu; // count++ �� ���������� ���ڿö�  
				// stu �� 24�� ~ 36������ �� �Է��Ѱ��� data[0][//] ���� ������ģ �κп� �ش簪���� �� 
				continue;
			}else if(sc.equals("2")){
				System.out.println("-------------------------------------------");
				System.out.println("�й�\t| �̸�\t| ����\t| ����\t| ���� ");
				System.out.println("-------------------------------------------");
				for(int i=0; i<data.length; i++){
					String[] stu = data[i]; // ��������
					if(stu!=null){
						System.out.println(stu[0] +"\t"+ stu[1] +"\t"+ stu[2] +"\t"+ stu[3] +"\t"+ stu[4]);
					}
				}
				System.out.println("-------------------------------------------");
			}else if(sc.equals("0")){
				System.out.println("���α׷��� �����մϴ�.");
				return; // main�޼ҵ� ���� (���α׷� ����)
			}else if(su==count){
				System.out.println("�Է�Ƚ���� �ʰ��߽��ϴ�.");
			}
			
			
			
		}
		

	}

}
