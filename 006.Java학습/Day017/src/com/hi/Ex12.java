package com.hi;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램 (ver 0.5.0)
		// 1.보기  2.입력  3.수정  4.삭제  0.종료  >
		Scanner sc = new Scanner(System.in);
		String input;
		int scanInt;
		System.out.println("학생성적관리 프로그램 (ver 0.5.0)");
		ArrayList<String[]> stu = new ArrayList<String[]>();

		
		while(true){
			
			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
			input = sc.nextLine();
			
			if(input.equals("1")){
				System.out.println("--------------------------------------------");
				System.out.println("학번 \t| 이름 \t| 국어 \t| 수학 \t| 영어");
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
				
				System.out.println("학번 > ");
				input = sc.nextLine();
				stt[0] = input;
				
				System.out.println("이름 > ");
				input = sc.nextLine();
				stt[1] = input;
				
				System.out.println("국어 > ");
				input = sc.nextLine();
				stt[2] = input;
				
				System.out.println("수학 > ");
				input = sc.nextLine();
				stt[3] = input;
				
				System.out.println("영어 > ");
				input = sc.nextLine();
				stt[4] = input;
				
				
				stu.add(stt);
	
				
			}else if(input.equals("3")){
				System.out.println("수정하실 학번을 입력해주세요. > ");
				scanInt = Integer.parseInt(sc.nextLine());
				String[] stt = new String[5];
				
				System.out.println("학번 > ");
				input = sc.nextLine();
				stt[0] = input;
				
				System.out.println("이름 > ");
				input = sc.nextLine();
				stt[1] = input;
				
				System.out.println("국어 > ");
				input = sc.nextLine();
				stt[2] = input;
				
				System.out.println("수학 > ");
				input = sc.nextLine();
				stt[3] = input;
				
				System.out.println("영어 > ");
				input = sc.nextLine();
				stt[4] = input;
				
				stu.set(scanInt, stt);
				
				
			}else if(input.equals("4")){
				System.out.println("삭제하실 학번을 입력해주세요. > ");
				input = sc.nextLine();
				scanInt = Integer.parseInt(input);
				stu.remove(scanInt);
				
				
			}else if(input.equals("0")){
				System.out.println("시스템을 종료합니다.");
				return;
			}

		}

	}

}
