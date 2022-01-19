package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		// < 예외처리 >
		//   : 회피스킬
		
		int[] arr = {1,3,5};
		
		try{
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]); // 익셉션 발생 ▶ catch 블럭으로 넘어감 // 이후에 있는 코드는 뛰어넘어가버림
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
		}catch(java.lang.ArrayIndexOutOfBoundsException ess){ // 타입 변수 (타입은 콘솔메세지)
			// 오류가 났을때의 상황
			System.out.println("오류가 났습니다.");
		}
		System.out.println("main end...");
		
		System.out.println("----------------------------------------------------------");
		
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		try{
			System.out.println(arr[3]); // 익셉션 발생 ▶ catch 블럭으로 넘어감 // 이후에 있는 코드는 뛰어넘어가버림
		
		}catch(java.lang.ArrayIndexOutOfBoundsException ess){ // 타입 변수 (타입은 콘솔메세지)
			// 오류가 났을때의 상황
			System.out.println("오류가 났습니다.");
		}			
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("main end...");
		
		
		

	}

}
