package com.hi;

public class Ex06 {
	// ��ü�迭�� �� ��ȣ�Ѵ�. (���� �ٸ� �������� ���� �� �־)
	public int su;
	public String name;
	
	public Ex06(int su){
		this.su = su;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		arr1 = new int[2]; // 2�� ���� �ٲ�
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[3]; // String ��������
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------------------------------");
		
		Ex06 me1 = new Ex06(1111); // ��ü�� �����ϰ�
		Ex06 me2 = new Ex06(2222);
		Ex06 me3 = new Ex06(3333);
		
		Ex06[] arr3 = new Ex06[3]; // ��ü�ּ� 3�� ���� // �迭�� ��������
		arr3[0] = new Ex06(1111); // ��ü�ּ� ����
		arr3[1] = me2;
		arr3[2] = me3;
		
		for(int i=0; i<arr3.length; i++){
			Ex06 me = arr3[i];
			System.out.println(me.su);
		}
		
		System.out.println("-----------------------------------------------");
//		int[][][] arr6 = new int[2][3][4];  // �� ��� ����
//                             ���� / ���� / ����
		
		// ���߹迭�� 2���������� ����.
		int[][] arr4;
		arr4 = new int[3][2];  // (��)arr4�� max / (��)�� ������Ʈ�� max
		// 2�� ���� ���� int�ϱ� �ֱⰪ 0
		
//		arr4[0] = new int[]{1,2,7}; // �迭��ü�� �������� - �ּҰ��� �ٸ��ϱ� ���̰� �޶����� �������.
//		arr4[1] = new int[]{3,4};
//		arr4[2] = new int[]{5,6,8,9};
		
//		arr4[2][2] = 10; // 8�� 10���� �ٲ�
//		arr4[0][2] = 10; // 7�� 10���� �ٲ�
		
		for(int i=0; i<arr4.length; i++){ // [3] �տ��� ���
			for(int j=0; j<arr4[i].length; j++){ // []�ڿ��� ����
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
