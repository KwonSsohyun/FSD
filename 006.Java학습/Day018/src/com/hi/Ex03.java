package com.hi;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver 0.3.6)");
		Scanner sc = new Scanner(System.in);
		
		// StringBuffer나 스트링빌더 ▶ 자기자신이 바뀜
		StringBuffer data = new StringBuffer();
		String input = null;
		
		while(true){
			System.out.println("1.보기  2.입력  3.삭제  0.종료  >");
			input = sc.nextLine();
			
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				System.out.println("-----------------------------------");
				System.out.println("학번\t |국어\t |영어\t |수학\t");
				System.out.println("-----------------------------------");
				System.out.println(data);
				System.out.println("-----------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("학번 >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.println("국어 >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.println("영어 >");
				data.append(sc.nextLine());
				data.append("\t");
				System.out.println("수학 >");
				data.append(sc.nextLine());
				data.append("\n");
				
			}else if(input.equals("3")){
				System.out.println("삭제할 학번 > "); // 2
				input = sc.nextLine();
				
				int start = data.indexOf("\n" + input + "\t")+1;
				// data = 1\t11\t22\t33\n2\t11\t22\t33\n3\t11\t22\t33
				// ▶▶ 2라고 입력했으면
				// ▶▶ 앞에 있는 t22를 찾아올 수 있으니
				// ▶▶ "\n" + input + "\t" ▶▶ \n2\t 찾아오는데 ▶▶ 인덱스 번호는 맨앞인 \n 얘의 인덱스를 가져온다.
				// ▶▶ +1해서 ▶▶ 2
				
				int end = data.indexOf("\n", start);
				// start 안에서 \n 을 찾아라
				// 2\t11\t22\t33\n3\t11\t22\t33
				//               ▲
				//        해당 인덱스 찾음
				
				data.delete(start ,end+1);
				// 2번에서 ~~~ +1을 했으니 3번인덱스 번호에서 자름
				
			}else{
				System.out.println("메뉴를 확인하시고 다시 입력바랍니다.");
			}
			
		}

	}

}
