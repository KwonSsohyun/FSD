package com.room802;

public class Ex03 {

	public static void main(String[] args) {
		// Q1. 1~10까지 짝수들을 출력하시오.
		for(int i = 1; i <= 10; i++){
			if(i%2==0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------------");
		
		// Q2. A~Z까지 출력하시오.
		for(char i = 'A'; i <= 'Z'; i++){
			System.out.print(i);
			
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------------");
		
		// Q3. 1,3,5,7,9 를 출력하시오.
		for(int i = 0; i <= 10; i++){
			if(i%2==1){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------------");
		
		
		// Q4. 1+3+5+7+9의 합계를 출력하시오.
		int sum = 0;
		
		for(int i = 0; i <= 10; i++){
			if(i%2==1){
				sum += i; // sum = sum+i; 
			}
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------------------------------");
		
		// Q5. 1~50 중 4의 배수를 출력하시오.
		for(int i = 1; i <= 50; i++){
			if(i%4 == 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------------");
	}

}
