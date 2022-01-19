package com.room802;

public class Ex08 {

	public static void main(String[] args) {
		
		// 	   ★
		// 	 ★ ★
		// ★ ★ ★
		// (빈칸출력)
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j<2-i){ // 줄이 바뀔때마다니까 i // j는 계속 돌때까지는 값이 변하니까 i는 값이 안변하니까
					System.out.print(' ');
				}
				else{System.out.print('★');}
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------");
		
		
		//   3
		//  23
		// 123
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j<2-i){ // 줄이 바뀔때마다니까 i // j는 계속 돌때까지는 값이 변하니까 i는 값이 안변하니까
					System.out.print(' ');
				}
				else{System.out.print(j+1);}
			}
			System.out.println();
		}

	}

}
