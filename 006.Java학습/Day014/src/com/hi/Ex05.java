package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		
		// ******** java.lang >> Class Boolean
		
		boolean boo1 = true;
		Boolean boo2 = new Boolean(true);
		Boolean boo3 = new Boolean(Boolean.TRUE); // 상수형변수로 기본값 준것임
		Boolean boo4 = new Boolean("true"); // true 대소문자 구분안함
		Boolean boo5 = new Boolean("TRUE");
		Boolean boo6 = new Boolean("True");
		Boolean boo7 = new Boolean(""); // 아무것도 안적으면 false
		System.out.println(boo7);
		

	}

}
