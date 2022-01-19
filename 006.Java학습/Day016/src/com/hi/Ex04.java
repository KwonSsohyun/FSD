package com.hi;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {
		// java.text >> Class DateFormat
		
		// ��¥ format ��ȯ �غ���!
		// ������ java.util.Date �� "Date"�� �޾ƿ´�. (����ð�)
		Date cal = new Date();
		System.out.println(cal);
		
		// ������ ����
		java.text.DateFormat df = DateFormat.getDateInstance(DateFormat.FULL , Locale.US ); // ������� �����������
		
		/*
			�� SHORT 	: is completely numeric, such as 12.13.52 or 3:30pm
			�� MEDIUM 	: is longer, such as Jan 12, 1952
			�� LONG 		: is longer, such as January 12, 1952 or 3:30:32pm
			�� FULL 		: is pretty completely specified, such as Tuesday, April 12, 1952 AD or 3:30:42pm PST.
		*/
		
		// cal�� �̿��ؼ� ������ ���� ����
		// Date�� �޾ƿ°� ������, ���� �״�� �ְ� �������� ������ �ٲ��ش�.
		// String  >>	format(Date date)
		String msg = df.format(cal);
		System.out.println(msg);
		
		
		
		// java.text >> Class SimpleDateFormat
		// java.lang.Object > java.text.Format > java.text.DateFormat > java.text.SimpleDateFormat (���� ����Ʈ ���)
		java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		// ���� ������ ������ ǥ�� ����
		// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		// Date and Time Patterns ���!
		// �ڸ��� ���� : yyyy-MM-dd hh:mm
		
		msg = sdf.format(cal);
		System.out.println(msg);

	}

}
