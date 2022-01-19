package com.hi;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int num;
	int kor,eng,math;
	String name;
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷� (ver 0.5.0)");
		Scanner sc = new Scanner(System.in);
		String input = null;
		int su = 0;
		
		// ��üŸ�� ������ ���׸� �ٲ� �� <Student>
		// �װ� ���� �ֳ��ϸ� �������� Ÿ������ ���� �� �ִ�. �� ��üŸ��!
		// �ڷ����� ����ִ�. �پ��� Ÿ���� ���� �� �ִ�.
		ArrayList<Student> list = new ArrayList<>();
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  4.����  0.����  >");
			input = sc.nextLine();
			
			// ���ڸ� �Է����� �ʾ��� ��� ���� ó��
			try{
				su = Integer.parseInt(input);
			}catch(NumberFormatException e){
				System.out.println("�޴��� ������ ���ڸ� �̿�ٶ��ϴ�.");
				continue;
			}
			
			if(su==0){break;}
			if(su==1){
				System.out.println("-------------------------------------");
				System.out.println("�й�\t |�̸�\t |����\t |����\t |����\t");
				System.out.println("-------------------------------------");
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i); // get ���� ������
					System.out.println(stu.num + "\t" +stu.name + "\t" +stu.kor + "\t" +stu.eng + "\t" +stu.math);
				}
				System.out.println("-------------------------------------");
				
				
			}else if(su==2){
				Student stu = new Student();
				
				System.out.println("�й� > ");
				input = sc.nextLine();
				stu.num = Integer.parseInt(input);
				
				System.out.println("�̸� > ");
				input = sc.nextLine();
				stu.name = input;
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stu.kor = Integer.parseInt(input);
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stu.eng = Integer.parseInt(input);
				
				System.out.println("���� > ");
				input = sc.nextLine();
				stu.math = Integer.parseInt(input);
				
				list.add(stu);
				
				
				
			}else if(su==3){
				System.out.println("������ �й� > ");
				input = sc.nextLine();
				int num = Integer.parseInt(input);
				
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					if(stu.num == num){
						System.out.println("���� > ");
						stu.kor = Integer.parseInt(sc.nextLine());
						System.out.println("���� > ");
						stu.eng = Integer.parseInt(sc.nextLine());
						System.out.println("���� > ");
						stu.math = Integer.parseInt(sc.nextLine());
						
						list.set(i, stu);
					}
				}
				
			}else if(su==4){
				System.out.println("������ �й� > ");
				input = sc.nextLine();
				int num = Integer.parseInt(input);
				
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					if(stu.num == num){
						list.remove(i);
					}
				}
				
			}else{
				// ���ڴ� �Է��ߴµ� 0~4�� �ƴѰ� �Է�������
				System.out.println("�޴��� �ٽ� Ȯ���Ͻð� �Է� �ٶ��ϴ�.");
			}
			
		}

	}

}
