package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
		// 랜덤
		// 0 <= ran < 1
		int ran = (int)(Math.random()*3)+1;
		System.out.println(ran);
		*/
		
		double su1 = Math.random();
		
		/////////////////////////////////////////////
		// 0 <= su1 <1;
		// 0*10 <= su*10 < 1*10
		// 0 <= su1 < 10
		// ----------------------
		// 0*3+1 <= su1*3+1 < 1*3+1
		// 1 <= su1<4; -> 1,2,3
		int su3 = (int)(su1*3)+1;
		System.out.println("su3=" + su3);
		/////
		// 0 ~ 0.1
		// 0 ~ 0.00000000000000001
		// 비교할 수 없다.
		
		/////////////////////////////////////////////
		/*
		int su2 = (int)(su1*10); // 0~9
		boolean boo = true;
		
		
		while(boo){
			if(su2<1 || su2>3){
				su1 = Math.random(); // 다시 돌리기
			}
			else{
				boo = false;
			}
		}
		**/
		
		
		
		
		
	}

}
