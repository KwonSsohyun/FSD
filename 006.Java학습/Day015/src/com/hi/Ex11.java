package com.hi;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1 = {4,2,1,3,5};
		System.out.println(Arrays.toString(arr1));
		
		// �迭 ��������
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("---------------------------------------------");
		
		// .binarySearch(arr1, 4)
		// ã�� ���� �ְ�, �ε��� ��ȣ�� ��ȯ���ش�.
		// Arrays.sort(arr1); �̰� ���� ������Ѵ�. (���ļ����� ���缭 ã����)
		// ��Ʈ ������ ������ ã�� ��������� �̴�.
		System.out.println(Arrays.binarySearch(arr1, 4));
		
		
		System.out.println("---------------------------------------------");
		
		int[] arr2 = new int[5];
		
		// �迭 �ݺ��ؼ� �Ȱ��� �� ä����
		Arrays.fill(arr2, 1234);
		
		System.out.println(Arrays.toString(arr2));
	
	
		System.out.println("---------------------------------------------");
		
		
		
	
	
	
	
	}

}
