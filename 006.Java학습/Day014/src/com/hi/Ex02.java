package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/
		// java.lang >> Class Integer
		// Constructor 생성자
		
		// 10진수 정수 타입
		int su1 = 1111;
		Integer su2 = new Integer(2222); 
		Integer su3 = new Integer("2222"); // 오직 부호와 숫자와 정수만 인정해준다. (문자열)
		System.out.println(su2 == su3); // su2객체 따로 su3 객체 따로니까 false
		System.out.println(su2.equals(su3)); // 객체니까 값 비교 해야 true 떨어짐
		
		System.out.println(su2+1);
		System.out.println(su3+1);
		// 대문자 -> 상수형 변수
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE ); // 인티저의 값 범위
		System.out.println(Integer.BYTES); // 메모리 사이즈 -> 4byte
		System.out.println(Integer.SIZE); // 비트 단위 -> 32bit
		System.out.println(Integer.parseInt("1234"));
		
		int su4 = Integer.parseInt("4444");
		Integer su5 = Integer.valueOf("5555");
		Integer su6 = 128; // 6666은 숫자인데 su6로 인티저 객체타입으로 받았다.
		System.out.println(su6.byteValue()); // byte로 리턴됨 // byte의 값 범위까지 됨
		
		// 참조변수.접근
		// int	>> hashCode()
		// int 타입으로 반환(리턴됨)
		
		// 클래스명.접근 (static이니까)
		// static int	>> hashCode(int value)
		// int 타입으로 반환(리턴됨)
		
		// static String 타입으로 반환함
		int su7 = 1;
		System.out.println(su7 + "의 2진수 = " + Integer.toBinaryString(su7));
		// 그래서 리턴타입이 문자열임 (숫자로 나오면 ㄹㅇ 4의 2진수 = 100 으로 오해하니까(4니까)
		System.out.println(su7 + "의 8진수 = " + Integer.toOctalString(su7));
		System.out.println(su7 + "의 16진수 = " + Integer.toHexString(su7));
		
		// static int  >>  reverse(int i)
		// int 타입으로 반환(리턴됨)
		// 비트 단위로 뒤집는다. 0 -> 1 / 1 -> 0 
		System.out.println(Integer.reverse(su7)); 
		
		// 인자 두개
		// static int	>>  compare(int x, int y)
		
		// 인자 하나
		// int	>>  compareTo(Integer anotherInteger)
		
		System.out.println(Integer.compare(0, 2));
		// 같으면 0
		// 앞에게 크면 1 
		// 뒤에게 크면 -1
		System.out.println("-------------------------");
		Integer a = new Integer(2);
		System.out.println(a.compareTo(2));
		
		
		
	}

}
