package com.room802;

public class Ex14 {

	public static void main(String[] args) {
		
		// �迭
		// �ڷ���[] ������ = new �ڷ���[����];
		
		int[] arr1 = new int[4]; // int[] arr1 = new int[]{0,0,0,0}; ������ (int���̱� ������ 0�� �ʱⰪ)
		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 6;
		arr1[3] = 8;
		
		int[] arr2 = new int[]{2,4,6,8};
		
		int[] arr3 = new int[]{1,3,5,7};
		/*
		�� int[] arr3 = {1,3,5,7};
		// ����� �ʱ�ȭ�� ���� �� ��Ȳ 
		// �������� // char, byte, short �ϼ��� �ֱ� ������ ���� (int��)

		�� int[] arr3; // ����
		�� arr3={1,3,5,7}; // ���� (�ڷ����� Ȯ��ġ �ʱ� ����
		*/
		
		System.out.println(arr3.length);
		System.out.println("------------------------------------");
		
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}

	}

}
