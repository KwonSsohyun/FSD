package com.hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷�(ver 0.5.1)");
		
//		HashMap<Integer,String[]> data = new HashMap<>();
		TreeMap<Integer,String[]> data = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(true){
			System.out.println("1.����  2.�Է�  0.����  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("�й�\t |����\t |����\t |����\t ");
				System.out.println("-------------------------------------");
				// �ؽ������� �ؼ� �̾Ƴ��� ��� set�ϰ� Iterator �ؼ� �̾Ƴ��ش�.
				// �ߺ����� �ȵ� set
				// �ߺ����� ������.
				Set<Integer> set = data.keySet();
				Iterator<Integer> ite = set.iterator();
				
				while(ite.hasNext()){
					int num = ite.next();
					String[] stu = data.get(num);
					System.out.println(num + "\t" + stu[0] + "\t" + stu[1] + "\t" + stu[2] + "\t" );
				}
				
				System.out.println("-------------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("�й� > ");
				int num = Integer.parseInt(sc.nextLine());
				
				String[] stu = new String[3];
				
				System.out.println("���� >");
				stu[0] = sc.nextLine();
				System.out.println("���� >");
				stu[1] = sc.nextLine();
				System.out.println("���� >");
				stu[2] = sc.nextLine();
				
				// stu �� String[] (��Ʈ���迭��)
				data.put(num, stu);
			}
			
			
			
		}

	}

}
