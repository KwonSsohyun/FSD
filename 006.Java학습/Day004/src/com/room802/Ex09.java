package com.room802;

public class Ex09 {

	public static void main(String[] args) {
		
		
		int kor,eng,math,sum;
		kor = 96;
		eng = 69;
		math = 73;
		
		sum = kor + eng + math;
		System.out.println("------------------------------------------");
		System.out.println("국어 : " + kor + "   | 영어 : " + eng + "   | 수학 : " + math);
		
		System.out.println("------------------------------------------");
		
		System.out.println("합계 : " + sum);
		
		// 평균 (소수두째자리 표현)
		double avg = (int)sum*100/3/100.0;
		System.out.println("평균 : " + avg);
		
		System.out.println("------------------------------------------");
		
		// 학점 구하기
		System.out.print("학점 : ");
		switch((int)avg/10){ 
			case 10 :
			case 9 : System.out.println("A 학점");
					 break;
			
			case 7 : System.out.println("C 학점");
					 break;
					 
			default : System.out.println("F 학점 : 재수강하세요.");
		}

	}

}
