package com.room802;

public class Ex03 {
	public static void main(String[] args){
		// �ڵ�����ȯ : ǥ�������� ���� ���� �ɷ� ��.(����� ��ȯ)
		// byte < short < char <= int < long < float < double
		// �ݴ�� ������ ��ȯ
		
		// ��Ģ����(+ - * / %)
		int a;
		int b;
		// char b;
		// double b; // �ڵ�����ȯ�� �Ǵ¹��⼺���� �˾Ƽ� �ȴ�.
		
		a = 5;
		b = 2; 
		// b = 'a'; // int �ڵ���ȯ�Ǹ� 97
		// b = 2.0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // ���� ��ȯ�� ->> ���� �ڷ����� ������ ���� �ڷ����� ��ȯ
		System.out.println(a%b); // ������ ��ȯ
		
		System.out.println(1+2+3*2-1); // ���ϱ� ���� ->> ���ʺ��� ���������� �� (��Ģ����) : 8
		System.out.println(1+(2+3)*2-1); // ��ȣ ���� ->> ���ϱ� ->> ���ʿ��� ���������� ->> 10
		// �� ��ȣ�� ���� ���� �Ͼ��.
	}
}
