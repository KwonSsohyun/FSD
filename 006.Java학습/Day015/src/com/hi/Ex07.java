package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		
		// java.util >> Class Random
		System.out.println(Math.random());
		
		java.util.Random ran = new java.util.Random(); // ��ü ����
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextInt()); // �ϳ��� ���������� ������ ����� �� �ִ�.
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(3)); // 0 ~ ���� ������ ���� ���� �����ϰ� �̾��� // 2 -> 0,1 // 45 -> 0~44
		

	}

}
