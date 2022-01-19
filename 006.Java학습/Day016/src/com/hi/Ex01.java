package com.hi;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
		// 날짜
		// java.util >>	Class Calendar

		// Constructor Summary
		// protected  >>	Calendar()
		// 생성자가 없다. -> protected (디폴트와 같고, 상속)
//		java.util.Calendar cal = new java.util.Calendar();
		
		// 객체를 얻어내기 위해서는 메서드 쓴다.
		// static Calendar	>>  getInstance()
		// 기본 표준시 및 로케일을 사용하여 일정관리를 가져옵니다.
		java.util.Calendar cal = Calendar.getInstance();
		
		
		
		// Field Summary
		/// set
		cal.set(2002, 5-1, 1, 12, 0); // 5월을 집어넣고 싶으면 -1을 한다. // 월 0부터 세서(0~11)
		// 2002년 5월 1일 12시 0분
		
		//cal.setTimeInMillis(0); // 기준시간 >> 1970년 1월 1일 0분 0초 >> 부터 기준으로 숫자를 셈
		cal.setTimeInMillis(System.currentTimeMillis()); //호출하는 지금의 시간 (1000으로 나눴을때 나오는 숫자)
		
		
		/// get
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(1));  // 연도 -> 1 상수형변수
		System.out.println(cal.get(Calendar.MONTH)+1);  // 월 // 0부터셈 -> +1
		System.out.println(cal.get(2));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 연중에 몇주차
		System.out.println(cal.get(3)); // 연중에 몇주차
		System.out.println((cal.get(Calendar.WEEK_OF_MONTH))); // 달의 몇주차
		System.out.println((cal.get(4))); // 달의 몇주차
		System.out.println((cal.get(5)));// 한달중에 몇일
		System.out.println((cal.get(6)));// 연중에 356중에 몇일인지
		System.out.println(365-(cal.get(6))); // 356 - 몇일 남았나 카운팅
		System.out.println((cal.get(7)));// 한주중에 오늘 (요일) // 일요일부터 시작 -> 1부터 셈
		System.out.println((cal.get(7)==Calendar.THURSDAY)); // 해당요일과 같냐?
		
		// 해당요일이 맞냐? (Calendar.DAY_OF_WEEK)
		System.out.println((cal.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY)); // 해당요일과 같냐?
		
		// AM || PM 이냐? 구분 (Calendar.AM_PM)
		System.out.println(cal.get(Calendar.AM_PM) == Calendar.AM); // AM = 0  / PM = 1
		System.out.println(cal.get(Calendar.HOUR)); // 시간
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 시간
		System.out.println(cal.get(Calendar.MINUTE)); // 분
		System.out.println(cal.get(Calendar.SECOND)); // 초
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
