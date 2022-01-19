package com.room802;

public class Ex03 {

	public static void main(String[] args) {
		// ¢º ¾ËÆÄºª »Ì±â
		// ABC
		// DEF
		// GHI
		
		char ch = 'A';
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(ch++);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		char su = 0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				su++;
				System.out.print((char)(su+64));
			}
			System.out.println();
		}

	}

}
