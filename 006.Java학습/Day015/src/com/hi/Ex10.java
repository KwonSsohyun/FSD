package com.hi;

import java.lang.String;

// 이문서상에서 Arrays를 얘기하면 java.util 경로에서 찾아라.
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// java.util >> Class Arrays
		
		String[] arr1 = {"java", "web", "database", "framework"};
		
		// 배열의 중간값 확인할때 사용 
		// > java.util.Arrays.toString( )
		System.out.println(java.util.Arrays.toString(arr1));
		
		// 배열의 깊은 복사
//		String[] arr2 = new String[arr1.length];
//		System.arraycopy(arr1, 0, arr2 , 0, arr1.length);
		// 3개만 안하면 null로 나옴
//		String[] arr2 = new String[3];
//		System.arraycopy(arr1, 0, arr2 , 0, 3);
		
		// 배열의 깊은 복사
		// .copyOf ▶ 통으로 복사 (단, 0부터 시작하는데 길이는 상관없는데)
		// String[] arr2 = Arrays.copyOf(arr1, arr1.length);
//		String[] arr2 = Arrays.copyOf(arr1, 3);
		// copyOfRange ▶ 원하는 범위만큼의 복사 (시작점도 내 맘대로, 길이도 내맘대로)
		String[] arr2 = Arrays.copyOfRange(arr1, 1, 3);
		
		arr1[2] = "db"; // 값바꿈
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2));
	}

}
