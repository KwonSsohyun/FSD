package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		
		// �迭 - �迭������ ��������(�޸� �ּҸ� ����� ������) - �迭�̶�� ��ü
		int[] arr1 = null;    // �ּҸ� ����Ű�°� ������ null       // [�迭]������ ���� & �ʱ�ȭ   // ������ �󸶸�ŭ Ȯ���Ұų�
		arr1 = new int[3];    // [�迭]������ �ʱ�ȭ (new �迭��ü ����)
		System.out.println(arr1);
		
		Ex06 me = new Ex06();
		System.out.println(me);
		
		arr1[0] = 2;              // ����Ʈ�� �ٲ�
		arr1[1] = 4; 
		arr1[2] = 6;
		
		int[] arr2;               // [�迭]������ ����
		arr2 = new int[]{2,4,6};  // [�迭]�ش簪�� �ʱ�ȭ
		
		int[] arr3;
		arr3 = new int[3];		  // ����Ʈ�� �ڵ� �ʱ�ȭ��
		
		
		for(int i=0; i<arr1.length; i++){  // ��ü�� �ɹ��ʵ�(Ŭ������ ���� ����)
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		
		
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i] + ",");
		}
		
	}

}
