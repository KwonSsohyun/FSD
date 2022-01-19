package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		
		// 배열 - 배열변수는 참조변수(메모리 주소를 기억할 사이즈) - 배열이라는 객체
		int[] arr1 = null;    // 주소를 가르키는게 없으면 null       // [배열]변수의 선언 & 초기화   // 공간을 얼마만큼 확보할거냐
		arr1 = new int[3];    // [배열]변수의 초기화 (new 배열객체 생성)
		System.out.println(arr1);
		
		Ex06 me = new Ex06();
		System.out.println(me);
		
		arr1[0] = 2;              // 디폴트값 바꿈
		arr1[1] = 4; 
		arr1[2] = 6;
		
		int[] arr2;               // [배열]변수의 선언
		arr2 = new int[]{2,4,6};  // [배열]해당값을 초기화
		
		int[] arr3;
		arr3 = new int[3];		  // 디폴트값 자동 초기화됨
		
		
		for(int i=0; i<arr1.length; i++){  // 객체의 맴버필드(클래스가 갖는 변수)
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		
		
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i] + ",");
		}
		
	}

}
