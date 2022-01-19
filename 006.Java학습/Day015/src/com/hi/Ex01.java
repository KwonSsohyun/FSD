package com.hi;

public class Ex01 {
	
	
	static class Lec01{
		// 1. static 내부클래스 (정적 내부클래스)
		
	}
	class Lec02{
		// 2. non-static 내부클래스 (인스턴스 [내부]클래스)
		
	}
	
	void func02(){
		class Lec03{ // func02()메서드 안에서만 쓰는 로컬(지역) 클래스
			// 3. 로컬클래스 (지역 클래스)
			
		}
	}
	

	public static void main(String[] args) {
		// 내부클래스 
		// 클래스 안에 클래스가 있는 것.
		
		// 내부클래스 종류
		// 4. 익명클래스

	}
	
	/*
	class Ex02{ // Ex01$Ex02.class   >>  이렇게 컴파일명이 만들어진다. (내부클래스는 $로 표시됨)
		
	}
	*/

}
