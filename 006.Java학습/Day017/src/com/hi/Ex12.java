package com.hi;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		// �л��������� ���α׷� (ver 0.5.0)
		// 1.����  2.�Է�  3.����  4.����  0.����  >
		Scanner sc = new Scanner(System.in);
		String input;
		int scanInt;
		System.out.println("�л��������� ���α׷� (ver 0.5.0)");
		ArrayList<String[]> stu = new ArrayList<String[]>();

		
		while(true){
			
			System.out.println("1.����  2.�Է�  3.����  4.����  0.����  >");
			input = sc.nextLine();
			
			if(input.equals("1")){
				System.out.println("--------------------------------------------");
				System.out.println("�й� \t| �̸� \t| ���� \t| ���� \t| ����");
				System.out.println("--------------------------------------------");
				for(int i=0; i<stu.size(); i++){
					for(int j=0; j<stu.get(i).length; j++){
						System.out.print(stu.get(i)[j]+"\t");
					} 
					System.out.println();
				}
				System.out.println("--------------------------------------------");
			}else if(input.equals("2")){
				String[] stt = new String[5];
				
				System.out.println("�й� > ");
				input = sc.nextLine();
				stt[0] = input;
				
				System.out.println("�̸� > ");
				input = sc.nextLine();
				stt[1] = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stt[2] = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stt[3] = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stt[4] = input;
				
				
				stu.add(stt);
	
				
			}else if(input.equals("3")){
				System.out.println("�����Ͻ� �й��� �Է����ּ���. > ");
				scanInt = Integer.parseInt(sc.nextLine());
				String[] stt = new String[5];
				
				System.out.println("�й� > ");
				input = sc.nextLine();
				stt[0] = input;
				
				System.out.println("�̸� > ");
				input = sc.nextLine();
				stt[1] = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stt[2] = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stt[3] = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stt[4] = input;
				
				stu.set(scanInt, stt);
				
				
			}else if(input.equals("4")){
				System.out.println("�����Ͻ� �й��� �Է����ּ���. > ");
				input = sc.nextLine();
				scanInt = Integer.parseInt(input);
				stu.remove(scanInt);
				
				
			}else if(input.equals("0")){
				System.out.println("�ý����� �����մϴ�.");
				return;
			}

		}

	}

}
