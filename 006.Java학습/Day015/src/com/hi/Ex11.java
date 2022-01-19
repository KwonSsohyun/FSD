package com.hi;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1 = {4,2,1,3,5};
		System.out.println(Arrays.toString(arr1));
		
		// 배열 오름차순
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("---------------------------------------------");
		
		// .binarySearch(arr1, 4)
		// 찾을 값을 넣고, 인덱스 번호를 반환해준다.
		// Arrays.sort(arr1); 이걸 먼저 해줘야한다. (정렬순서를 맞춰서 찾아줌)
		// 비트 단위로 빠르게 찾게 만들어져서 이다.
		System.out.println(Arrays.binarySearch(arr1, 4));
		
		
		System.out.println("---------------------------------------------");
		
		int[] arr2 = new int[5];
		
		// 배열 반복해서 똑같은 값 채워줌
		Arrays.fill(arr2, 1234);
		
		System.out.println(Arrays.toString(arr2));
	
	
		System.out.println("---------------------------------------------");
		
		
		
	
	
	
	
	}

}
