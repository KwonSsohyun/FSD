package com.room802;

public class Ex06 {

	public static void main(String[] args) {
		// 1
		// 2 3
		// 4 5 6
		int temp = 1;
		for(int y=0; y<3; y++){
			temp = temp+y; // 1+0 (처음에 1로 시작(i)
			for(int i=temp; i<=temp+y; i++){
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");	
		System.out.println(1);
		System.out.println(23);
		System.out.println(456);
		System.out.println("----------------------------------------");
		
		/*
		
		for(int i=1; i<=1; i++){ // +0
			System.out.print(i);
		}
		System.out.println();
		
		// for(int i=1+1; i<=1+1+1; i++){
		for(int i=2(=1+1); i<=3(=1+1+1); i++){ // +1
			System.out.print(i);
		}
		System.out.println();
		
		// for(int i=1+1+2; i<=1+1+2+2; i++){
		for(int i=4(=1+1+2); i<=6(=1+1+2+2); i++){
			System.out.print(i);
		}
		System.out.println();
		
		// for(int i=1+1+2+3; i<=1+1+2+2+3+3; i++){
		for(int i=7(=1+1+2+3); i<=10(=1+1+2+3+3); i++){
			System.out.print(i);
		}
		*/
		
		System.out.println("----------------------------------------");	
		
		int su = 1;
		
		for(int i=1; i<4; i++){
			for(int j=0; j<i; j++){
				System.out.print(su++);
			}
			System.out.println();
		}
		
		
		
		
	}

}
