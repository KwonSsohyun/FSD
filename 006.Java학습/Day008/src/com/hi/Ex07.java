package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		
		// 배열의 복사
		int[] arr1 = new int[]{1,3,5,7,9};
		int[] arr2 = new int[]{1,3,5,7,9}; 
		System.out.println(arr1 == arr2); // 2개의 객체 주소값 비교 > false
		
		
		
		// 1. 배열의 "얕은" 복사 ▶ 같은 곳을 가르켜서 값을 수정하면 "같이 바꿔짐" (arr1 과 arr3) (주소값의 복사)
		int[] arr3 = arr1; // 주소값 복사 (같은 곳을 가르킴)
		System.out.println(arr1 == arr3); // true
		
		
		
		// 2. 배열의 "깊은" 복사 ▶ 똑같이 생긴 다른 객체
		int[] arr4 = new int[arr1.length]; // 동일한 사이즈의 배열을 만들고 (새로운 객체 생성)
		for(int i=0; i<arr1.length; i++){
			arr4[i] = arr1[i]; // 값 복사
		}
		//출력
		for(int i=0; i<arr4.length; i++){
			System.out.print(arr4[i] + ",\n");
		}
		
		System.out.println(arr1 == arr4);
	}

}
