package com.hi;


public class Ex01 {	
	// 전역변수
	public static int[] kor = new int[3];
	public static int[] eng = new int[3];
	public static int[] math = new int[3];
	public static int count = 0; 
	
	
	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.2.0)
		// 1.입력(3번)  2.출력  0.종료  >
		// 입력은 총 3번
		// 3번의 입력이 끝나면 "입력이 끝났습니다." 라는 메시지 전달
		// 과목 : 국어, 영어, 수학
		// 출력은 표로 출력
		// 종료하고 싶을 때 종료
		// -------------------------------------

		
		System.out.println("학생성적관리프로그램 (ver 0.3.0)");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Ex01 in = new Ex01();
		
		while(true){
			System.out.println("1.입력  2.출력  0.종료  >");
			int sc = Integer.parseInt(scan.nextLine()); // scan.nextLine ▶ 문자열 입력 / Integer.parseInt() ▶ 문자열 > 숫자형 변경

			switch(sc){
				case 1 : // 입력 
					in.input();
					break;
				case 2 : // 출력
					in.print();
					break;
				case 0 : // 종료
					in.end();
					return;
				default : System.out.println("0, 1, 2 숫자만 입력하세요."); 
			}
		}
	}
	
	
	public void input(){ // 입력
		if(count<=3){
			java.util.Scanner scan = new java.util.Scanner(System.in);
			System.out.println("국어 입력해주세요.");
			kor[count] = Integer.parseInt(scan.nextLine());
		
			System.out.println("영어 입력해주세요.");
			eng[count] = Integer.parseInt(scan.nextLine());
		
			System.out.println("수학 입력해주세요.");
			math[count] = Integer.parseInt(scan.nextLine());
		
			count++;
		}
		else if(count>3){
			System.out.println("입력횟수 초과됬습니다.");
			return;
		}
	}
	
	
	public void print(){ // 출력
		System.out.println("국어 \t| 영어 \t| 수학"); 
		System.out.println("-----------------------------------------");
		System.out.println(kor[0] + "\t" + eng[0] + "\t" + math[0]);
		System.out.println(kor[1] + "\t" + eng[1] + "\t" + math[1]);
		System.out.println(kor[2] + "\t" + eng[2] + "\t" + math[2]);
		System.out.println("-----------------------------------------");
	}
	
	public void end(){ // 종료
		System.out.println("프로그램을 종료하겠습니다.");
	}
	
	
}
