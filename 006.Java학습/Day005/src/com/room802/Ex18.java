package com.room802;

public class Ex18 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); // 입력받기 위한 장치
		String title = "학생성적관리프로그램(ver0.1.0)";
		System.out.println(title);
		
		// 과목별로 하는게 낫다. (바뀌지 않는 고정을 배열로 해주는게 낫다.)
		// 학생별로 하면, 학생늘어나면, 배열을 새로 생성해줘야하니 복잡성이 따른다.
		String[] kor = new String[3];
		String[] eng = new String[3];
		String[] math = new String[3];
		
		for(int i=0; i<3; i++){
			System.out.print(i+1+"학번 국어 > ");
			kor[i] = sc.nextLine();  // 입력받는 코드
			System.out.print(i+1+"학번 영어 > ");
			eng[i] = sc.nextLine();  // 입력받는 코드
			System.out.print(i+1+"학번 수학 > ");
			math[i] = sc.nextLine();  // 입력받는 코드
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println("학번 | 국어  | 영어  | 수학      ");
		System.out.println("-------------------------------------------------------");
		System.out.println(" 1\t" + kor[0] + "\t" + eng[0] + "\t" + math[0]);
		System.out.println(" 2\t" + kor[1] + "\t" + eng[1] + "\t" + math[1]);
		System.out.println(" 3\t" + kor[2] + "\t" + eng[2] + "\t" + math[2]);
		System.out.println("-------------------------------------------------------");
		
		/*
		// String kor1,eng1,math1,kor2,eng2,math2,kor3,eng3,math3;
		System.out.print(0+1+"학번 국어 > ");
		kor[0] = sc.nextLine();  // 입력받는 코드
		System.out.print(0+1+"학번 영어 > ");
		eng[0] = sc.nextLine();  // 입력받는 코드
		System.out.print(0+1+"학번 수학 > ");
		math[0] = sc.nextLine();  // 입력받는 코드
		
		System.out.print(1+1+"학번 국어 > ");
		kor[1] = sc.nextLine();  // 입력받는 코드
		System.out.print(1+1+"학번 영어 > ");
		eng[1] = sc.nextLine();  // 입력받는 코드
		System.out.print(1+1+"학번 수학 > ");
		math[1] = sc.nextLine();  // 입력받는 코드
		
		System.out.print(2+1+"학번 국어 > ");
		kor[2] = sc.nextLine();  // 입력받는 코드
		System.out.print(2+1+"학번 영어 > ");
		eng[2] = sc.nextLine();  // 입력받는 코드
		System.out.print(2+1+"학번 수학 > ");
		math[2] = sc.nextLine();  // 입력받는 코드
		*/
		

		
		
		
		
		
	}

}
