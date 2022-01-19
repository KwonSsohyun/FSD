package com.hi;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		// ��¥
		// java.util >>	Class Calendar

		// Constructor Summary
		// protected  >>	Calendar()
		// �����ڰ� ����. -> protected (����Ʈ�� ����, ���)
//		java.util.Calendar cal = new java.util.Calendar();
		
		// ��ü�� ���� ���ؼ��� �޼��� ����.
		// static Calendar	>>  getInstance()
		// �⺻ ǥ�ؽ� �� �������� ����Ͽ� ���������� �����ɴϴ�.
		java.util.Calendar cal = Calendar.getInstance();
		
		
		
		// Field Summary
		/// set
		cal.set(2002, 5-1, 1, 12, 0); // 5���� ����ְ� ������ -1�� �Ѵ�. // �� 0���� ����(0~11)
		// 2002�� 5�� 1�� 12�� 0��
		
		//cal.setTimeInMillis(0); // ���ؽð� >> 1970�� 1�� 1�� 0�� 0�� >> ���� �������� ���ڸ� ��
		cal.setTimeInMillis(System.currentTimeMillis()); //ȣ���ϴ� ������ �ð� (1000���� �������� ������ ����)
		
		
		/// get
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(1));  // ���� -> 1 ���������
		System.out.println(cal.get(Calendar.MONTH)+1);  // �� // 0���ͼ� -> +1
		System.out.println(cal.get(2));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // ���߿� ������
		System.out.println(cal.get(3)); // ���߿� ������
		System.out.println((cal.get(Calendar.WEEK_OF_MONTH))); // ���� ������
		System.out.println((cal.get(4))); // ���� ������
		System.out.println((cal.get(5)));// �Ѵ��߿� ����
		System.out.println((cal.get(6)));// ���߿� 356�߿� ��������
		System.out.println(365-(cal.get(6))); // 356 - ���� ���ҳ� ī����
		System.out.println((cal.get(7)));// �����߿� ���� (����) // �Ͽ��Ϻ��� ���� -> 1���� ��
		System.out.println((cal.get(7)==Calendar.THURSDAY)); // �ش���ϰ� ����?
		
		// �ش������ �³�? (Calendar.DAY_OF_WEEK)
		System.out.println((cal.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY)); // �ش���ϰ� ����?
		
		// AM || PM �̳�? ���� (Calendar.AM_PM)
		System.out.println(cal.get(Calendar.AM_PM) == Calendar.AM); // AM = 0  / PM = 1
		System.out.println(cal.get(Calendar.HOUR)); // �ð�
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // �ð�
		System.out.println(cal.get(Calendar.MINUTE)); // ��
		System.out.println(cal.get(Calendar.SECOND)); // ��
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
