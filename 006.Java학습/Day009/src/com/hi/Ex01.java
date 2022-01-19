package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.4.1)
		// 총원 : 3
		// 1.입력  2.보기  0.종료  > 
		
		// 1.입력  2.보기  0.종료  >  a
		// 메뉴를 보시고 다시 선택해주세요. 
		// ▷ (문자열을 입력했을때 제어하기)
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine();
		
		char tmp;
		boolean boo = true;
		
		for(int i=0; i<sc.length(); i++){
			tmp = sc.charAt(i);
			
			if(tmp >= '0' && tmp <= '2'){
				boo = false;
			}
		}
		System.out.println();
		
		

	}

}
