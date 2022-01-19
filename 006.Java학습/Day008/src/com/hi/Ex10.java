package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		// 깊은 복사
		int[] arr1 = {1,3,5,7};
		int[] arr2; 
		arr2 = new int[arr1.length]; // 사이즈 동일하게 만든다. (동일하게 만들고 싶으면)
		// arr2 = new int[2];
		
		/*
		for(int i=0; i<arr2.length; i++){
			arr2[i] = arr1[i];
		}
		
		arr1[1] = 10; // arr1의 1번 인덱스의 값 바꿔도 전혀 영향 안미침 >> arr2에 말이다. 
	               	  // 얕은 복사가 아니기 때문 > ㄹㅇ새로운 객체
		*/
		
		// 배열의 깊은 복사 기능 제공
		System.arraycopy(arr1, 0, arr2, 0, arr2.length); // (arr1, 1, arr2, 1, 2); >> 0,3,5,7 출력됨
		// System.arraycopy(원본참조변수, 원본시작index, 복사될대상참조변수, 대상시작index, 인덱스몇개)
		// system클래스는 운영체제를 다룸
		
		arr1[1]=10;
		
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i] + ",");
		}

	}

}
