package com.hi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02 {

	public static void main(String[] args) {
		
		// GregorianCalendar 이 Calendar 상속받음
		// 바로 set을 해준다.
//		java.util.GregorianCalendar cal = new GregorianCalendar(2002,4,1); // 2002년 5월 1일
		// 다형성에 따라 이거 가능 (부모에 정의된 기능만 씀)
		java.util.Calendar cal = new GregorianCalendar(2002,4,1); // 2002년 5월 1일
		
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
