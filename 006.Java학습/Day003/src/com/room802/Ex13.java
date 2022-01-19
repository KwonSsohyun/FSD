package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램 (ver 0.0.1)
		// kor=96, eng=69, math=73;
		// 합계 평균 학점
		// 학점 평균 90이상 -> A학점
		//           80이상 -> B학점
		//           70이상 -> C학점
		//           60이상 -> D학점
		//           60미만 -> F학점 (재수강 하세요.)
		// -------------------------------------------------
		// 국어 : 96	| 영어 : 69		| 수학:73
		// -------------------------------------------------
		// 합계 : 0000
		// 평균 : 00.00 ( 소수둘째자리까지 출력)
		// -------------------------------------------------
		// 학점 : F 
		//        재수강 하세요.
		// -------------------------------------------------
		
		int kor = 96;
		int eng = 69;
		int math = 73;
		
		double sum = kor+eng+math;
		
		System.out.println("--------------------------------------");
		System.out.println("국어 : "+ kor + "  | 영어 : "+ eng + "  | 수학 : "+ math);
		System.out.println("--------------------------------------");
		System.out.println("합계 : " + (int)sum);
		
		if(true){
			sum /=3; 
			System.out.println("평균: "+ sum);
		}

		System.out.println("--------------------------------------");		
		
		
		switch((int)sum){
			case 100:
			case 90:
				System.out.println("A학점");
				break;
			case 80:
				System.out.println("B학점");
				break;
			case 79:
				System.out.println("C학점");
				break;
			case 60:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F");
		}
	}

}
