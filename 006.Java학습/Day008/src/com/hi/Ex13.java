package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		
		char[] arr1 = {'a' , 'b' , 'c' , 'd'};
		String msg1 = new String(arr1); // 단일문자 문자열로 만든다.
		System.out.println(msg1);
		
		char[] arr3 = msg1.toCharArray(); // 문자열을 가지고 단일문자 배열로 분해 String의 메서드(참조변수)(배열이 참조변수) 
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		byte[] arr2 = {65, 66, 67, 68}; // 아스키코드 A,B,C,D
		String msg2 = new String(arr2); // byte를 String으로 변환
		System.out.println(msg2);
		
		byte[] arr4 = msg2.getBytes(); // 문자열을 byte 배열로 분해
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}

	}

}
