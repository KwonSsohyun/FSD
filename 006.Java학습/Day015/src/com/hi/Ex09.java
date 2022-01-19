package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// java.util >> Class StringTokenizer
		
		String msg = "java@web@db@@framework";
		String[] arr1 = msg.split("@");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		System.out.println("------------------------------");
		
		// StringTokenizer 
		// 의미없는건 버림 (비어있는건 인정안해줌)
		java.util.StringTokenizer token = new java.util.StringTokenizer(msg,"@"); // 골뱅이 단위로
		while(token.hasMoreElements()){ // 다음 있으면 true
			System.out.println(token.nextToken()); // 다음값을 가져옴
		}

	}

}
