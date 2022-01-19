package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		
		String msg1 = "abcd";
		String msg2 = "abcabcd";
		String msg3 = "";
		String msg4 = "AaBbCcDd";
		String msg5 = "        java web framwork     db      ";
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".contains() >> 원하는 문자열이 있는지 없는지 확인");
		
		// ▶▶ .contains()
		// 포함됬는지 확인
		// 원하는 문자열이 있는지 없는지 확인 (.indexOf 비슷 : 다만 없으면 -1로 반환)
		// true, false로 반환
		System.out.println(msg1.contains("bc"));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".startsWith() >> 해당문자로 시작하는지 확인");
		
		// ▶▶ .startsWith()
		// 해당문자로 시작을 하는지 확인
		// 문자열 검사할때 사용
		// true, false로 반환
		System.out.println(msg1.startsWith("bc"));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".endsWith() >> 해당문자로 끝나는지 확인");
		// ▶▶ .endsWith()
		// 해당문자로 끝나는지 확인
		// true, false로 반환
		System.out.println(msg2.endsWith("cd"));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".isEmpty() >> 빈문자 있는지 확인");
		
		// ▶▶ .isEmpty() 
		// 빈문자 있는지 확인
		System.out.println(msg3.length()==0); // 일반적으로 씀 (문자길이를 반환해준다.) msg1 -> 4 / msg2 -> 5
		 								      // msg3의 길이가 0개면 아무것도 없다는것
		System.out.println(msg3.isEmpty()); 
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".lastIndexOf() >> 맨마지막에서부터 해당 글자번호 인덱스 출력");
		System.out.println(" \t\t ('a',3) -> 0~3번까지 인덱스범위 안에서 맨마지막에서부터 a를 찾아서 해당 인덱스 출력");
		
		// ▶▶ .lastIndexOf()
		// 하나의 인자 ▶▶ 맨마지막에 있는 해당 글자번호 인덱스 출력
		// 두개의 인자 ▶▶ ("a",3) -> 0~3번까지 범위의 인덱스 안에서 맨 마지막 a를 찾아라
		msg2 = "abfdcafbcd";
		System.out.println(msg2.lastIndexOf('d')); // 없으면 -1
		System.out.println(msg2.lastIndexOf('f', 6)); // 0부터 시작해서 2까지의 수색범위 - 맨마지막에서부터 시작해서 f의 인덱스를 찾아라
		System.out.println(msg2.lastIndexOf("abcd", 6));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".toUpperCase() >> 모두 대문자 바꿔준다. ");
		System.out.println(".toLowerCase() >> 모두 소문자 바꿔준다.");
		
		// ▶▶ .toUpperCase() >> 모두 대문자 바꿔준다. 
		// ▶▶ .toLowerCase() >> 모두 소문자 바꿔준다.
		System.out.println(msg4.toUpperCase());
		System.out.println(msg4.toLowerCase());
		
		System.out.println("----------------------------------------------------");	
		
		// ▶▶ .trim()
		// 앞뒤의 공백을 날려준다.
		// 내용상의 띄어쓰기는 내용상의 분간으로 본다. 그래서 없애지 않음
		System.out.println(">>>" + msg5 + "<<<");
		System.out.println(msg5.trim());
		
		System.out.println("----------------------------------------------------");	
		
	}

}
