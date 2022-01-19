package com.room802;

public class Ex01 {

	public static void main(String[] args) {
		
		// ▶ 별 3개찍기
		// ★★★
		// ★★★
		// ★★★
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print("★");	
			}
			System.out.println();
		}
		
		
		// ▶ 숫자 뽑기
		// 123
		// 456
		// 789		
		for(int i=0; i<3; i++){
			for(int j=1+3*i; j<=3+3*i; j++){
				System.out.print(j);	
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------");
		
		
		// ▶ 숫자 뽑기
		// 123
		// 234
		// 345	
		for(int i=0; i<3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(j+i);	
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------");
		
		// ▶ 숫자 뽑기
		// 123
		// 456
		// 789	
		
		int su =1;
		
		for(int i=0; i<3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(su++);	
			}
			System.out.println();
			// su-=2; // ▶ 이 코드를 넣으면 123 / 234 / 345 나옴
			// 뒤에 원래 3뒤에 4가 나오는데 다시 2로 출발해야하니까 -2를 해준다.
			// 개행뒤에 바로 말이다.(시작점 다시 돌아왔을때)
		}
	
		
		
	}

}
