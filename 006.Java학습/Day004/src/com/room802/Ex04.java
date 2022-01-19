package com.room802;

public class Ex04 {

	public static void main(String[] args) {
		
		// Q1. 1~10까지 짝수들을 출력하시오.
		for(int su = 2; su <= 10; su+=2){
			System.out.println(su);
		}
		System.out.println("---------------------------------------------");
		
		for(int su=1; su*2<=10; su++){
			System.out.println(su*2);
		}
		
		System.out.println("---------------------------------------------");
		
		for(int i =1; i<=10; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}

	}

}
