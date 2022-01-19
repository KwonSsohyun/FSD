package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.2.0)
		// 1.입력(3번)  2.출력  0.종료  >
		// 입력은 총 3번
		// 3번의 입력이 끝나면 "입력이 끝났습니다." 라는 메시지 전달
		// 과목 : 국어, 영어, 수학
		// 출력은 표로 출력
		// 종료하고 싶을 때 종료
		// -------------------------------------
		
		System.out.println("학생성적관리프로그램 (ver 0.2.0)");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		String input;
		int sc;
		boolean boo = true;
		String[] sub = new String[]{"국어", "영어", "수학"};
		int[] stu1 = new int[3];
		int[] stu2 = new int[3];
		int[] stu3 = new int[3];
		int i = 1;
		
		
		while(true){
			System.out.println("1.입력  2.출력  0.종료  >");
			
			input = scan.nextLine(); // 문자열 "입력"
			sc = Integer.parseInt(input); // 입력받을걸 문자열 -> 숫자형 변경
			
			//입력
			switch(i){
				case 1 : 
					System.out.println(sub[0] + " 입력해주세요.");
					input = scan.nextLine();
					sc = Integer.parseInt(input);
					stu1[0] = sc;
	
					System.out.println(sub[1] + " 입력해주세요.");
					input = scan.nextLine();
					sc = Integer.parseInt(input);
					stu1[1] = sc;

					System.out.println(sub[2] + " 입력해주세요.");
					input = scan.nextLine();
					sc = Integer.parseInt(input);
					stu1[2] = sc;
					break;
			}
			
			// 출력
			if(sc==2){
				System.out.println(stu1[0]);
				System.out.println(stu1[1]);
				System.out.println(stu1[2]);
			}
			
			
		}	
		
		
		// System.out.println(stu1[1]);
		// System.out.println(stu1[2]);
		// System.out.println(stu2[0]);
		// System.out.println(stu2[1]);
		// System.out.println(stu2[2]);
		// System.out.println(stu3[0]);
		// System.out.println(stu3[1]);
		// System.out.println(stu3[2]);
		
		
	}

}
