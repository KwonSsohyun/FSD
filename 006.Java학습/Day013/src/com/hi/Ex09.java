package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		String[] arr = {"a", "ab", "abc"};
		// try, catch 예외처리
		// finally 실행보장
		try{
			int su3 = 3;
			System.out.println(arr[su3]);
			return; // 리턴은 메인매서드 종료인데, finally 수행반드시 실행 보장해준다. 
//		}catch(Exception e){
			
		}finally{ // 독립적으로 있지는 못함 - try랑 같이 써야함.
			// 실행보장 (
			System.out.println("main end");
		}

	}

}
