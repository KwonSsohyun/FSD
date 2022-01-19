package com.hi;

public class Ex11 {
//	학생 성적 관리 프로그램(ver 0.2.0)
//	1. 입력(3) 2. 출력 0.종료 > 
//	입력은 총 3번(명)까지
//	3번의 입력이 끝나면 "입력이 끝났습니다" 라는 메시지 전달x
//	과목 : 국어, 영어, 수학
//	출력은 표로 출력
//	종료하고 싶을 때 종료
	
	public static int[] kor = new int[3];
	public static int[] eng = new int[3];
	public static int[] math = new int[3];
	public static int count = 0;
	
	
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true) {
			System.out.println("학생 성적 관리 프로그램(ver 0.2.0)");
			System.out.print("1. 입력 | 2. 출력 | 3. 초기화 | 0. 종료 > ");
			try {
				switch(Integer.parseInt(sc.nextLine())){
				case 0: System.out.println("종료");return;
				case 1: input();break;
				case 2: output();break;
				case 3: reset();break;
				default : System.out.println("1, 2, 3, 0만 입력해주세요.");
				}
			} catch(Exception e) {
				System.out.println("숫자만 입력하세요.");
			} finally {
				System.out.println();
			}
		}
	}
	
	
	
	public static void input() {
		if(count == 3) {
			System.out.println("입력이 끝났습니다");
			return;
		}
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			System.out.println(count+1 + "학번의 점수를 입력합니다.");
			System.out.print("국어 : ");
			kor[count] = Integer.parseInt(sc.nextLine());
			System.out.print("영어 : ");
			eng[count] = Integer.parseInt(sc.nextLine());
			System.out.print("수학 : ");
			math[count] = Integer.parseInt(sc.nextLine());
			System.out.println("입력 완료");
			System.out.println(count+1 + "학점" + "\t국어 : " + kor[count] + "\t영어 : " + eng[count] + "\t수학 : " + math[count]);
			count++;
		} catch(Exception e) {
			System.out.println("문자를 입력하셨습니다. 다시 입력해주세요.");
		} finally {
			System.out.println();
		}
	}
	
	
	
	public static void output() {
		if(count == 0) {
			System.out.println("입력하지 않았습니다");
			return;
		}
		System.out.println("학점 \t|국어 \t|영어 \t|수학");
		System.out.println("=======================================");
		for(int i = 0; i < count; i++) {
			System.out.println(i+1 + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i]);
		}
		System.out.println("=======================================");
	}
	
	
	public static void reset() {
		for(int i = 0; i > 3; i++) {
			kor[i] = 0;
			eng[i] = 0;
			math[i] = 0;
		}
		count = 0;
		System.out.println("초기화가 완료 되었습니다.");
	}
}
