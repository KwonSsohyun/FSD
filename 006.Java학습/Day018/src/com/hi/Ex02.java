package com.hi;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷� (ver 0.3.5)");
		
		String data = "";
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  0.����  >");
			input = sc.nextLine();
			
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				System.out.println("----------------------------------");
				System.out.println("�й�\t |����\t |����\t |����\t");
				System.out.println("----------------------------------");
				// �Է� �ƹ��͵� �������� ������ �ƴ϶� �ݺ��� ���ʷ� ���ư��� ��.
				// indexOf �� -1�̸� ���� ����
				if(data.indexOf("@") == -1){continue;}
				
				String[] students = data.split("@");  // "@" �������� �ڸ���
				for(int i=0; i<students.length; i++){
					String stu = students[i];
					String[] msg = stu.split(",");    // "," �������� �ڸ���
					System.out.println(msg[0]+"\t"+msg[1]+"\t"+msg[2]+"\t"+msg[3]+"\t");
				}
				System.out.println("----------------------------------");
				
				
			}else if(input.equals("2")){
				System.out.println("�й� >");
				input = sc.nextLine() + ",";  // + "," �� �����Ϸ�����
				System.out.println("���� > ");
				input+=sc.nextLine() + ",";
				System.out.println("���� > ");
				input+=sc.nextLine() + ",";
				System.out.println("���� > ");
				input+=sc.nextLine() + "@";  // + "@" �� �����Ϸ�����
				
				data += input;
				// System.out.println(data);  // �߳����� Ȯ���غ�
				
			}else if(input.equals("3")){
				System.out.println("������ �й� >");
				input = sc.nextLine();
				
				String[] students = data.split("@");   // "@" �������� �ڸ���
				data = "";
				
				for(int i=0; i<students.length; i++){
					if(students[i].startsWith(input+",")){
						// ���� ���⼭ continue �� 57�� for�� ��
						continue;
					}
					// �ƴҰ�츸 ������ ����
					data+=students[i]+"@";
				}
				
				
				
			}else{
				System.out.println("�޴��� �ٽ� Ȯ���Ͻð� �Է¹ٶ��ϴ�.");
			}
		}

	}

}
