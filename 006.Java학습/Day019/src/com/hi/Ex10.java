package com.hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex10 {
	
	static Scanner sc;

	public static void main(String[] args) {
		// �л��������α׷�
		// �ڷᱸ�� ���뼺
		System.out.println("�л������������α׷�(ver 0.5.1)");
		
		ArrayList<HashMap<String,String>> data = new ArrayList<>();
		
		sc = new Scanner(System.in);
		String input = null;
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  4.����  0.����  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("�й�\t |����\t |����\t |����\t ");
				System.out.println("-------------------------------------");
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> stu = data.get(i);
					System.out.println(stu.get("num") + "\t" + stu.get("kor") + "\t" + stu.get("eng") + "\t" + stu.get("math") + "\t");
				}
				System.out.println("-------------------------------------");
			}else if(input.equals("2")){
				// HashMap<String,String> stu = new HashMap<String,String>();
				
				// System.out.println("�й� > ");
				// stu.put("num", sc.nextLine());
			
				// System.out.println("���� > ");
				// stu.put("kor", sc.nextLine());
				
				// System.out.println("���� > ");
				// stu.put("eng", sc.nextLine());
			
				// System.out.println("���� > ");
				// stu.put("math", sc.nextLine());
				
				HashMap<String,String> stu = getStu();
				data.add(stu);
				
			}else if(input.equals("3")){
				System.out.println("������ �й� > ");
				HashMap<String,String> stu = getStu();
				
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> ele = data.get(i);
					if(ele.get("num").equals(stu.get("num"))){
						data.set(i, stu);
					}
				}
				
				
			}else if(input.equals("4")){
				System.out.println("������ �й� > ");
				input = sc.nextLine();
				
				for(int i=0; i<data.size(); i++){
					HashMap<String,String> ele = data.get(i);
					if(ele.get("num").equals(input)){
						data.remove(i);
					}
				}
			}
			
			
		}

	}
	
	
	public static HashMap<String,String> getStu(){
		
		HashMap<String,String> stu = new HashMap<String,String>();
		
		System.out.println("�й� > ");
		stu.put("num", sc.nextLine());
		
		System.out.println("���� > ");
		stu.put("kor", sc.nextLine());
		
		System.out.println("���� > ");
		stu.put("eng", sc.nextLine());
		
		System.out.println("���� > ");
		stu.put("math", sc.nextLine());
		
		return stu;
	}
	

}
