package com.hi;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷� (ver 0.3.6)");
		Scanner sc = new Scanner(System.in);
		
		// StringBuffer�� ��Ʈ������ �� �ڱ��ڽ��� �ٲ�
		StringBuffer data = new StringBuffer();
		String input = null;
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  0.����  >");
			input = sc.nextLine();
			
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				System.out.println("-----------------------------------");
				System.out.println("�й�\t |����\t |����\t |����\t");
				System.out.println("-----------------------------------");
				System.out.println(data);
				System.out.println("-----------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("�й� >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.println("���� >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.println("���� >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.println("���� >");
				data.append(sc.nextLine());
				data.append("\n");
				
			}else if(input.equals("3")){
				System.out.println("������ �й� > "); // 2
				input = sc.nextLine();
				
				int start = data.indexOf("\n" + input + "\t")+1;
				// data = 1\t11\t22\t33\n2\t11\t22\t33\n3\t11\t22\t33
				// ���� 2��� �Է�������
				// ���� �տ� �ִ� t22�� ã�ƿ� �� ������
				// ���� "\n" + input + "\t" ���� \n2\t ã�ƿ��µ� ���� �ε��� ��ȣ�� �Ǿ��� \n ���� �ε����� �����´�.
				// ���� +1�ؼ� ���� 2
				
				int end = data.indexOf("\n", start);
				// start �ȿ��� \n �� ã�ƶ�
				// 2\t11\t22\t33\n3\t11\t22\t33
				//               ��
				//        �ش� �ε��� ã��
				
				data.delete(start ,end+1);
				// 2������ ~~~ +1�� ������ 3���ε��� ��ȣ���� �ڸ�
				
			}else{
				System.out.println("�޴��� Ȯ���Ͻð� �ٽ� �Է¹ٶ��ϴ�.");
			}
			
		}

	}

}
