package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		
		// arr1 �� ����Ű�⸸ �ϴ°��� (��ü�� �ּҸ� arr1�� �����)
		
		int[] arr1 = {1,3,5,7};  // ���� ������(�߷�Ÿ��) >> ������ new int[]{1,3,5,7} �ε� �����Ѱ� >> �տ� int[] arr1 �� Ÿ���� ���߱� ������ �߷���
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		
		arr1 = new int[]{2,4,6,8}; // 1,3,5,7 ���� �Ȱ���Ŵ // ���οü ����
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		
		arr1 = new int[]{11,22,33,44,55,66}; // 2,4,6,8 ���� �Ȱ���Ŵ // ���οü ���� // �ּҸ� ����Ű�ϱ� ũ��� ����� ����
		for(int i=0; i<arr1.length; i++){ // �׷��� ���� ���� 6�̳� �ϴ°���.
			System.out.print(arr1[i] + ","); 
		}
		System.out.println();

	}

}
