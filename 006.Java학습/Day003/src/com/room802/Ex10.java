package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		// if문은 else if문 else문을 갖을 수 있는데
		// else if문은 0개 이상
		// else문은 0 또는 1개
		// 1개의 조건을 만족하는 순간 실행을 하고 빠져나간다.
		
		// su = 5;
		// su가 양수이면 "양수입니다" 출력
		// su가 음수이면 "음수입니다" 출력

		int su;
		su = (int)(Math.random()*10)+1;
		System.out.println(su);
		
		if(su > 0){
			System.out.println("양수 입니다.");
		}
		
		if(!(su > 0)){
			System.out.println("음수 입니다.");
		}
		
		System.out.println("------------------------------------");
		
		
		if(su>0){
			System.out.println("0보다 큽니다.");
		}
		else{
			System.out.println("0보다 같거나 작습니다.");
		}
		
		System.out.println("------------------------------------");
		
		if(su>0){
			System.out.println("0보다 큽니다."); // su의 값이 0보다 크면 ->> 둘다 나옴 (switch case문이 적합)
		}
		// 위에 조건을 만족하지 않고 그리고, su>-1을 만족하는
		if(!(su>0) && su>-1){
			System.out.println("0 입니다.");
		}
		if(su>=0){
			System.out.println("0 입니다.");  // su의 값이 0보다 크면 ->> 둘다 나옴 (switch case문이 적합)
		}
		if(su<0){
			System.out.println("0보다 작습니다.");
		}
		
		System.out.println("------------------------------------");
		
		// 다중의 조건
		if(su>0){
			System.out.println("0보다 큽니다."); // su의 값이 0보다 크면 ->> if, else if, else 중에 적합한것만 나오고 빠져나옴
		}
		else if(su>-1){ 
			System.out.println("0 입니다."); 
		}
		else{
			System.out.println("0보다 작습니다.");
		}
	}

}
