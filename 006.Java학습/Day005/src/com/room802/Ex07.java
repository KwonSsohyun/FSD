package com.room802;

public class Ex07 {

	public static void main(String[] args) {
		// ¡Ú¡Ú¡Ú
		// ¡Ú¡Ú
		// ¡Ú
		
		for(int i=3; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3-i; j++){
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------");
		
		// 123
		// 12
		// 1
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3-i; j++){
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		// 123
		// 45
		// 6
		
		int su=1;
		int cnt = 6; // °¡·ÎÄ­ Á¶Àý 
		
		for(int i=0; i<cnt; i++){
			for(int j=0; j<cnt-i; j++){
				// System.out.print(su++);
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		

	}

}
