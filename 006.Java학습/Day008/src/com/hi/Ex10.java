package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		// ���� ����
		int[] arr1 = {1,3,5,7};
		int[] arr2; 
		arr2 = new int[arr1.length]; // ������ �����ϰ� �����. (�����ϰ� ����� ������)
		// arr2 = new int[2];
		
		/*
		for(int i=0; i<arr2.length; i++){
			arr2[i] = arr1[i];
		}
		
		arr1[1] = 10; // arr1�� 1�� �ε����� �� �ٲ㵵 ���� ���� �ȹ�ħ >> arr2�� ���̴�. 
	               	  // ���� ���簡 �ƴϱ� ���� > �������ο� ��ü
		*/
		
		// �迭�� ���� ���� ��� ����
		System.arraycopy(arr1, 0, arr2, 0, arr2.length); // (arr1, 1, arr2, 1, 2); >> 0,3,5,7 ��µ�
		// System.arraycopy(������������, ��������index, ����ɴ����������, ������index, �ε����)
		// systemŬ������ �ü���� �ٷ�
		
		arr1[1]=10;
		
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i] + ",");
		}

	}

}
