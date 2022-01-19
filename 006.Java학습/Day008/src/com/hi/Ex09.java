package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		
		// arr1 은 가르키기만 하는것임 (객체의 주소를 arr1에 담아줌)
		
		int[] arr1 = {1,3,5,7};  // 생략 가능함(추론타입) >> 원래는 new int[]{1,3,5,7} 인데 생략한게 >> 앞에 int[] arr1 로 타입을 정했기 때문에 추론함
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		
		arr1 = new int[]{2,4,6,8}; // 1,3,5,7 이제 안가르킴 // 새로운객체 찍음
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		
		arr1 = new int[]{11,22,33,44,55,66}; // 2,4,6,8 이제 안가르킴 // 새로운객체 찍음 // 주소를 가르키니까 크기는 상관이 없음
		for(int i=0; i<arr1.length; i++){ // 그래서 위를 보고 6이네 하는거임.
			System.out.print(arr1[i] + ","); 
		}
		System.out.println();

	}

}
