package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		
		// 구구단
		for(int su = 1; su <= 9; su++){
			for(int dan = 2; dan <= 9; dan++){
				System.out.print(dan + "X" + su + "=" + (dan*su) + "\t");
			}
		System.out.println();
		}
		
		
		System.out.println("------------------------------------------");
		
		// 별 3단 찍기
		for(int i = 1; i <=3; i++){
			for(int j = 1; j <=3; j++){
				System.out.print("★");
			}
		System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		// 숫자 3단 찍기
		for(int i = 1; i <= 9; i++){
			for(int j = 3; j<= 5; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
