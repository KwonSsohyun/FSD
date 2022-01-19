package com.hi;

public class Ex08 {
	
	// public  : 접근제한자
	// static  : 객체 생성여부
	// void    : 리턴값 없을때
	// main    : 메인 메서드
	// (String[] args) : cmd에서 전달할 배열 (띄어쓰기로 구분)

	public static void main(String[] args) { // (String[] args) 구분단위 띄어쓰기
		// 각각을 스트링으로 하고, 스트링 배열로 담는다.
		// 옵션이 여러개를 줄수 잇기 때문 (기준은 띄어쓰기)
		// 실행할때 다른 문자열을 붙혀서 보낼 수 도 있는거니까.
		// cmd창에서 java Ex08 -version 이런거  -> 그럼 1개 전달하는구나 이런거
		
		// java.util >> Class Scanner
		
		// 스캐너중에 io -> input을 쉽게 해주는 유틸
		java.util.Scanner sc= null;
//		sc = new java.util.Scanner("abcd\n한글\n1234");
		sc = new java.util.Scanner("ab,cd\tcd\n한글\n1234");

		// 오직 개행단위로 읽어줌 \n >> .nextLine()
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());

		// \t \r \n 구분 단위로 읽어줌
		// \r\n -> 윈도우 개행
		System.out.println(sc.next());  // ab,cd
		System.out.println(sc.hasNext());  // true, false 판별 (뒤에 더 있냐)
		System.out.println(sc.next());  // cd
		sc.nextLine();						// next처럼 작동
//		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine()); //한글
		System.out.println(sc.nextInt()); //1234
		System.out.println(sc.hasNext()); /// false
		
		while(sc.hasNext()){ // 있는 만큼 읽어들이기.
			System.out.println(sc.nextLine());
		}

	}

}
