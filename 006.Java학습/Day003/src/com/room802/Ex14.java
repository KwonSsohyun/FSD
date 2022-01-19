package com.room802;

public class Ex14 {

	public static void main(String[] args) {
		
		int kor, eng, math, sum;
		kor = 96;
		eng = 69;
		math = 73;
		sum = kor+eng+math;
		double avg = sum*100/3/100.0; // 소수 2째자리까지 표현
		
		System.out.println("---------------------------------");
		System.out.println("국어 : "+ kor + "  | 영어 : "+ eng + "  | 수학 : "+ math);
		System.out.println("---------------------------------");
		System.out.println("합계: "+ sum);
		System.out.println("평균:" + avg);
		System.out.println("---------------------------------");
		System.out.print("학점 :");
		
		switch((int)avg/10){
			// 300 ~ 270 A : 10 ~ 9
			// 269 ~ 240 B : 8 ~ 8
			// 239 ~ 210 C : 7 ~ 7
		    //           D : 6 ~ 6
		
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
			case 7 :
				System.out.println("C");
			case 6 :
				System.out.println("D");
			default :
				System.out.println("F");
		}
		
//		if(avg >= 90){
//			System.out.println("A");
//		}
//		else if(avg >= 80){
//			System.out.println("B");
//		}
//		// if(avg < 90 && avg >=80){ System.out.println("B"); }
//		if(avg<80 && avg >= 70){
//			System.out.println("C");
//		}
//		if(avg<70 && avg>= 60){
//			System.out.println("D");
//		}
//		if(avg<60){
//			System.out.println("F");
//		}

	}

}
