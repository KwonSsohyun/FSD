package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		// < ����ó�� >
		//   : ȸ�ǽ�ų
		
		int[] arr = {1,3,5};
		
		try{
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]); // �ͼ��� �߻� �� catch ������ �Ѿ // ���Ŀ� �ִ� �ڵ�� �پ�Ѿ����
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
		}catch(java.lang.ArrayIndexOutOfBoundsException ess){ // Ÿ�� ���� (Ÿ���� �ָܼ޼���)
			// ������ �������� ��Ȳ
			System.out.println("������ �����ϴ�.");
		}
		System.out.println("main end...");
		
		System.out.println("----------------------------------------------------------");
		
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		try{
			System.out.println(arr[3]); // �ͼ��� �߻� �� catch ������ �Ѿ // ���Ŀ� �ִ� �ڵ�� �پ�Ѿ����
		
		}catch(java.lang.ArrayIndexOutOfBoundsException ess){ // Ÿ�� ���� (Ÿ���� �ָܼ޼���)
			// ������ �������� ��Ȳ
			System.out.println("������ �����ϴ�.");
		}			
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("main end...");
		
		
		

	}

}
