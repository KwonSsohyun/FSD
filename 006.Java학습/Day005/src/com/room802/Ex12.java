package com.room802;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		 	1
		 	for(2선언초기화; 3조건; 4증감){5실행};
		 	1235 435 435 435
		 	
		 	초기화;
		 	while(조건){
		 		실행문;
		 		증감식;
		 	}
		 */
		
		// While문을 이용한 구구단 찍기
		/*
		int su=1;
		while(su<=5){
			System.out.println(su);
			su++;
		}
		*/


		/*
		for(int i=1; i<10; i++){
			for(int j=2; j<10; j++){
				System.out.print(j+"x"+i+"\t");
			}
			System.out.println();
		}
		*/
		
		/********************************************
		int i =1; // su
		int j =0; // dan
		
		while(i<10){
			j=2;
			while(j<10){
				System.out.print(j+"x"+i+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
		*******************************************/
		
		int dan = 2;
		int su = 1;
		
		while(su<=9){
			dan=2;
			while(dan<=9){
				System.out.print(dan + "x" + su + "=" + (dan*su) + "\t");				
				dan++;
			}
			System.out.println();
			su++;
			
		}
	
		
		/*
		while(dan<=9){
			
			while(su<=9){
				System.out.print(dan + "x" + su + "=" + (dan*su)+"\t");
				su++;
			}
			dan++;
			su=1;
			System.out.println();
		}
		*/
	

	}

}
