package com.hi;

public class Ex08 {

	
	public static void func01(int[] arr2){ // ���� �Ű������� �����Ѵٴ°��� ���� (���� ����)
		arr2[1] = 10; // �迭 �ε��� 1�� �� ���� (�׸��� ������)(���� ����)
		//arr2 = new int[]{5,6,7,8,9,0}; // new int�� ���ο� ��ü�� �����߱� ������ ���簡 �ƴ�(�ƹ��� ������ ����)
	}
	
	
	public static void main(String[] args) {
		
		// ���� ����
		int[] arr1 = {2,4,6,8}; // ��������
		
		func01(arr1); // �Ű������� �����Ѵ� >> ��������
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]); // �������縦 ���ؼ� ���� �ٲ� (��ü�� �ϳ�����, ��ü�� �ּ� ����Ű�°� 2������. >> arr1, arr2)
		}

	}

}
