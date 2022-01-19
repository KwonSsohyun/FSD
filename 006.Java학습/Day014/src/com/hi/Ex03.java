package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/
		// ******** java.lang >> Class Byte
		
		// Constructor 생성자
		Byte su1 = new Byte("127");
		// Byte(byte value) -> 기본생성자로 byte 전달만 가능
		byte su3 = 127; 
		Byte su2 = new Byte(su3);
		
		// parseByte(String s)
		// 문자열을 byte로 바꾸고 싶을때
		System.out.println("------------------------------------------------------");
		
		// ******** java.lang >> Class Short
		short su4 = 12;
		// Short(short value)  -> 기본생성자로 short 전달만 가능
		Short su5 = new Short(su4);
		Short su6 = new Short("12");
		
		System.out.println("------------------------------------------------------");
		
		// ******** java.lang >> Class Long
		long su7 = 1111L; // L안붙혀도 된다. (오토캐스팅) 기본이 int형이니
		Long su8 = new Long(1111);
		Long su9 = new Long(su7);
		Long su10 = new Long("1111");
		// 형변환 Long 으로 바꿔주면서 문자열 1111L 해주니 절대 "1111L" 금지!!!!
		

	}

}
