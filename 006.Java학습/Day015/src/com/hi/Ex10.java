package com.hi;

import java.lang.String;

// �̹����󿡼� Arrays�� ����ϸ� java.util ��ο��� ã�ƶ�.
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// java.util >> Class Arrays
		
		String[] arr1 = {"java", "web", "database", "framework"};
		
		// �迭�� �߰��� Ȯ���Ҷ� ��� 
		// > java.util.Arrays.toString( )
		System.out.println(java.util.Arrays.toString(arr1));
		
		// �迭�� ���� ����
//		String[] arr2 = new String[arr1.length];
//		System.arraycopy(arr1, 0, arr2 , 0, arr1.length);
		// 3���� ���ϸ� null�� ����
//		String[] arr2 = new String[3];
//		System.arraycopy(arr1, 0, arr2 , 0, 3);
		
		// �迭�� ���� ����
		// .copyOf �� ������ ���� (��, 0���� �����ϴµ� ���̴� ������µ�)
		// String[] arr2 = Arrays.copyOf(arr1, arr1.length);
//		String[] arr2 = Arrays.copyOf(arr1, 3);
		// copyOfRange �� ���ϴ� ������ŭ�� ���� (�������� �� �����, ���̵� �������)
		String[] arr2 = Arrays.copyOfRange(arr1, 1, 3);
		
		arr1[2] = "db"; // ���ٲ�
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2));
	}

}
