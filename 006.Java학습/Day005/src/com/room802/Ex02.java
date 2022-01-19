package com.room802;

public class Ex02 {

	public static void main(String[] args) {
		
		// ▶ 숫자 뽑기
		// 123
		// 456
		// 789	
		
		for(int i=1; i<10; i++){ 
			System.out.print(i);
			if(i%3==0){ // 3의 배수일때 개행
				System.out.println();
			}
		}
		
		System.out.println("-----------------------------------------");
		
		// 1 2 3 └ 4 5 6 └ 7 8 9
		// 1 2 3 └ 2 3 4 └ 3 4 5
		
		int su=1; // 숫자를 찍기위한 변수
		for(int i=1; i<12; i++){ // 출력의 순번
			if(i%4==0){ // 4의 배수 개행
				System.out.println();
				su-=2;
			}
			else{ // 숫자 출력
				System.out.print(su++); // su값 증가
			}
		}

	}

}
