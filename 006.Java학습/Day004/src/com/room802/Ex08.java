package com.room802;

public class Ex08 {

	public static void main(String[] args) {
		
		// Q5. 1~50 중 4의 배수를 출력하시오.
		for(int i = 1; i*4 <50; i++){
			System.out.print(i*4 + " ");
		}
		
		System.out.println("\n--------------------------------------------------------");
		
		for(int i =4; i <=50; i+=4){
			System.out.print(i+ " ");
		}
		
		System.out.println("\n--------------------------------------------------------");
		
		for(int i = 1; i<= 50; i++){
			if(i%4 == 0){
				System.out.print(i + " ");
			}
		}
	}

}
