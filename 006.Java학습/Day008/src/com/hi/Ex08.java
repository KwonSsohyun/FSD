package com.hi;

public class Ex08 {

	
	public static void func01(int[] arr2){ // ▶▶ 매개변수로 전달한다는것이 복사 (얕은 복사)
		arr2[1] = 10; // 배열 인덱스 1번 값 변경 (그리고 전달함)(옅은 복사)
		//arr2 = new int[]{5,6,7,8,9,0}; // new int로 새로운 객체를 생성했기 때문에 복사가 아님(아무런 영향이 없음)
	}
	
	
	public static void main(String[] args) {
		
		// 얕은 복사
		int[] arr1 = {2,4,6,8}; // 지역변수
		
		func01(arr1); // 매개변수로 전달한다 >> 얕은복사
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]); // 옅은복사를 통해서 값이 바뀜 (객체는 하나였고, 객체의 주소 가르키는건 2개였다. >> arr1, arr2)
		}

	}

}
