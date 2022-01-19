package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// 제어문 - 반복문 - 2. while문
		/*
			while(조건-boolean타입){
				실행문;
			}
		*/
		// 제어문 - 반복문 - 3. do~while문
		//                      : 일단 한번 실행하고 조건을 만족하면 반복 - 한번의 실행은 보장
		/*
		 	do{
		 		실행문;
		 	}
		 	while(조건-boolean);
		*/

		
		int su=1;
		while(su<5){
			System.out.println("반복"+su);
			su++;
		}
		
		do{
			System.out.println("두와일"+su);
			su++;
		}while(su<5);

	}

}
