package com.room802;

public class Ex14 {

	public static void main(String[] args) {
		
		// 배열
		// 자료형[] 변수명 = new 자료형[갯수];
		
		int[] arr1 = new int[4]; // int[] arr1 = new int[]{0,0,0,0}; 같은것 (int형이기 때문에 0이 초기값)
		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 6;
		arr1[3] = 8;
		
		int[] arr2 = new int[]{2,4,6,8};
		
		int[] arr3 = new int[]{1,3,5,7};
		/*
		▶ int[] arr3 = {1,3,5,7};
		// 선언과 초기화를 같이 한 상황 
		// 쓰지말것 // char, byte, short 일수도 있기 때문에 오류 (int형)

		▶ int[] arr3; // 선언
		▶ arr3={1,3,5,7}; // 오류 (자료형이 확실치 않기 때문
		*/
		
		System.out.println(arr3.length);
		System.out.println("------------------------------------");
		
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}

	}

}
