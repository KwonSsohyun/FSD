package com.room802;

public class Ex14 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		// 1(1+0)/(1+3*0)	 2(2+0)(2+3*0) 	 3(3+0)(3+3*0)
		// 4(1+3)/(1+3*1)    5(2+3)(2+3*1)	 6(3+3)(3+3*1)
		// 7(1+6)/(1+3*2)	 8(2+6)(2+3*2)   9(3+6)(3+3*2)
		for(int i=0; i <3 ; i++){
			for(int j=1; j<4; j++){
				System.out.print(j+3*i);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		int su=1;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(su++);
			}
			System.out.println();
		}
		
		
		
	}

}
