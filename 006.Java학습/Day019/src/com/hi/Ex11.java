package com.hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.5.1)");
		
//		HashMap<Integer,String[]> data = new HashMap<>();
		TreeMap<Integer,String[]> data = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(true){
			System.out.println("1.보기  2.입력  0.종료  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------------");
				System.out.println("학번\t |국어\t |영어\t |수학\t ");
				System.out.println("-------------------------------------");
				// 해쉬맵으로 해서 뽑아낼수 없어서 set하고 Iterator 해서 뽑아내준다.
				// 중복나면 안들어감 set
				// 중복나면 수정됨.
				Set<Integer> set = data.keySet();
				Iterator<Integer> ite = set.iterator();
				
				while(ite.hasNext()){
					int num = ite.next();
					String[] stu = data.get(num);
					System.out.println(num + "\t" + stu[0] + "\t" + stu[1] + "\t" + stu[2] + "\t" );
				}
				
				System.out.println("-------------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("학번 > ");
				int num = Integer.parseInt(sc.nextLine());
				
				String[] stu = new String[3];
				
				System.out.println("국어 >");
				stu[0] = sc.nextLine();
				System.out.println("영어 >");
				stu[1] = sc.nextLine();
				System.out.println("수학 >");
				stu[2] = sc.nextLine();
				
				// stu → String[] (스트링배열임)
				data.put(num, stu);
			}
			
			
			
		}

	}

}
