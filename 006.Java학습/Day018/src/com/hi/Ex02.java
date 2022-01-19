package com.hi;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver 0.3.5)");
		
		String data = "";
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		while(true){
			System.out.println("1.보기  2.입력  3.삭제  0.종료  >");
			input = sc.nextLine();
			
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				System.out.println("----------------------------------");
				System.out.println("학번\t |국어\t |영어\t |수학\t");
				System.out.println("----------------------------------");
				// 입력 아무것도 안햇으면 오류가 아니라 반복문 최초로 돌아가게 함.
				// indexOf ▶ -1이면 없는 것임
				if(data.indexOf("@") == -1){continue;}
				
				String[] students = data.split("@");  // "@" 기준으로 자르고
				for(int i=0; i<students.length; i++){
					String stu = students[i];
					String[] msg = stu.split(",");    // "," 기준으로 자르고
					System.out.println(msg[0]+"\t"+msg[1]+"\t"+msg[2]+"\t"+msg[3]+"\t");
				}
				System.out.println("----------------------------------");
				
				
			}else if(input.equals("2")){
				System.out.println("학번 >");
				input = sc.nextLine() + ",";  // + "," ▶ 구분하려고함
				System.out.println("국어 > ");
				input+=sc.nextLine() + ",";
				System.out.println("영어 > ");
				input+=sc.nextLine() + ",";
				System.out.println("수학 > ");
				input+=sc.nextLine() + "@";  // + "@" ▶ 구분하려고함
				
				data += input;
				// System.out.println(data);  // 잘나오나 확인해봄
				
			}else if(input.equals("3")){
				System.out.println("삭제할 학번 >");
				input = sc.nextLine();
				
				String[] students = data.split("@");   // "@" 기준으로 자르고
				data = "";
				
				for(int i=0; i<students.length; i++){
					if(students[i].startsWith(input+",")){
						// ▶▶ 여기서 continue 는 57인 for로 감
						continue;
					}
					// 아닐경우만 데이터 누적
					data+=students[i]+"@";
				}
				
				
				
			}else{
				System.out.println("메뉴를 다시 확인하시고 입력바랍니다.");
			}
		}

	}

}
