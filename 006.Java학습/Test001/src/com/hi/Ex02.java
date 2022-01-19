package com.hi;
// ▶ Day010 > Ex08
public class Ex02 {

	public static void main(String[] args) {
		// 문자열 찾기
		System.out.println("한글로 숫자 입력해주세요. > ");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine();
		char[] ch = sc.toCharArray(); // String(문자열) -> char(단일문자) 배열로 일일히 분해
		
		char[] ko = new char[]{'영', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
		char[] su = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<ko.length; j++){ 
				if(ch[i] == ko[j]){ // 비교 찾는코드
					ch[i] = su[j]; // 바꿔치기
				}
			}
		}
		
		System.out.println(ch);
		
		

	}

}
