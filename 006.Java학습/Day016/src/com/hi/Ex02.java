package com.hi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02 {

	public static void main(String[] args) {
		
		// GregorianCalendar �� Calendar ��ӹ���
		// �ٷ� set�� ���ش�.
//		java.util.GregorianCalendar cal = new GregorianCalendar(2002,4,1); // 2002�� 5�� 1��
		// �������� ���� �̰� ���� (�θ� ���ǵ� ��ɸ� ��)
		java.util.Calendar cal = new GregorianCalendar(2002,4,1); // 2002�� 5�� 1��
		
		System.out.println(cal.get(GregorianCalendar.YEAR));
		System.out.println(cal.get(GregorianCalendar.MONTH)+1);
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH));
		
		/*
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		*/
	}

}
