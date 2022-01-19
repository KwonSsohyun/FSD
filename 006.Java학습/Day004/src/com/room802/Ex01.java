package com.room802;

public class Ex01 {

	public static void main(String[] args) {
		// 제어문(반복문, 3가지 - for문)
		// ①    
			/* for(②초기화;③조건문;④증감식){
				 		⑤반복수행할 명령;
			
				}
				⑥ 
			 */
	    // 수행순서 -> ① -> ② -> ③true -> ④ -> ⑤ -> ③true -> ④ -> ⑤ -> ③true -> ④ ... ⑤ -> ③false -> ⑥
		
		int i = 1000;

		for(i = 0; i < 5 ; i++){
			System.out.println("반복"+i);
		}
		
		// i = 1000;
		
		System.out.println(i); // i는 5가됨 (22번라인 없다고 생각)(for문을 돌고 값이 변함)
		// ▶ i 는 안쪽에서만 사용가능 (for문 안에서 선언했을시)
		
	}

}
