package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		
		for(int j=1; j<10; j++){
			for(int i=2; i<10; i++){
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=1; i<=9; i++){
			for(int j=2; j<=9; j++){
				System.out.print(j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
	}

}
