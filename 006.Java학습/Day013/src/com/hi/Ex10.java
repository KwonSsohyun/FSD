package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// 로또
		// 1. 랜덤 (1~45)
		// 2. 6개 - 중복없음 -> 값을 집어넣을때마다 중복검사 
		// 3. 오름차순 정렬
		
//		int su = (int)(Math.random()*45)+1; // 0~44 ->> 1~45
		
		// 6개 중복값 검사 - 별찍기 문제 착안
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++){ // i는 6개를 찍는거고
			int su = (int)(Math.random()*45)+1; 
			lotto[i] = su;
			for(int j=0; j<i; j++){ // j는 i 6개를 각각 비교 
				if(lotto[i] == lotto[j]){
					i--; // 다시 받음
				}
			}
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		// 오름차순 정렬 - 별찍기 문제 착안
//		int[] lotto = {6,1,3,4,2,5};
		// 값 바꿔치려면 값 저장소가 필요함
		int temp = 0;
		
		for(int i=0; i<lotto.length; i++){
			for(int j = i+1; j<lotto.length; j++){
				if(lotto[i]>lotto[j]){
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
		
	}

}
