package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		String[] msg = {"0", "1", "둘", "3"};
		
		try{
		for(int i=0; i<msg.length; i++){
			int su = Integer.parseInt(msg[i]); // 문자열 숫자형으로 바꿈
			System.out.println(su);
		}
		}catch(java.lang.NumberFormatException e){
			System.out.println("에러발생");
		}

	}

}
