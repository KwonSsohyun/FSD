package com.hi;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		
		// java.util  >>  Class Date
		// ������ java.util.Date �� "Date"�� �޾ƿ´�. (����ð�)
		java.util.Date cal = new Date();
		System.out.println(cal);
		
		
//		cal.setYear(2002-1900); // ���س⵵ �ٲٴ°�
		cal.setMonth(11-1);
		cal.setDate(29);
		cal.setHours(9);
		cal.setMinutes(30);
		// �������Ŵϱ� �������� -> ������ �����̶� �׳� ����.

		
		System.out.println(cal.getYear()+1900); // ������ 1900����
		System.out.println(cal.getMonth()+1); // ���� 0���ʹϱ� +1
		System.out.println(cal.getDate());     // ��¥
		System.out.println(cal.getHours());   // ��
		System.out.println(cal.getMinutes()); // ��
		System.out.println(cal.getSeconds()); // ��
		
		// ����ð� >> .getTime()
		System.out.println(cal.getTime()); // �и�����(��Ÿ��)
		// �� �� �������� ���
		System.out.println((System.currentTimeMillis()-cal.getTime())/1000/60/60/24);
		// 10000 (�и�������)
		// 60 ��
		// 60 ��
		// 24 �ð�
		
		// ��Ÿ������ ��ȯ			>> .currentTimeMillis()
		// cal�� ��Ÿ������ ��ȯ    >> cal.getTime()
		// ������ش�.
		
		

		
		

	}

}
