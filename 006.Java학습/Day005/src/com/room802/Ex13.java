package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		
		// 배열
		// 자료형[] 변수명 = new 자료형[갯수];
		// 호출 배열명[인덱스];
		// 인덱스 - 0부터 시작, +1씩 증가, max=갯수-1 (0부터시작해서)
		int[] arr = new int[5]; // 배열 만들었고
		arr[0] = 1; // 값을 대입
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		
		
		System.out.println(arr[4]); // 값을 호출
		System.out.println(arr[3]);
		System.out.println(arr[2]);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		
		
		for(int i=0; i<5; i++){
			System.out.print(arr[i]); // 값을 호출 (위랑 같은 호출방법이지만 다만 for문으로 호출)
		}
		
	
		
	}

}
