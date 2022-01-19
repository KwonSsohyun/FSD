package com.hi;

import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		
		// java.util  >>  Class Date
		// 무조건 java.util.Date 를 "Date"를 받아온다. (현재시간)
		java.util.Date cal = new Date();
		System.out.println(cal);
		
		
//		cal.setYear(2002-1900); // 기준년도 바꾸는것
		cal.setMonth(11-1);
		cal.setDate(29);
		cal.setHours(9);
		cal.setMinutes(30);
		// 없어질거니까 쓰지마라 -> 메이저 버전이라 그냥 쓴다.

		
		System.out.println(cal.getYear()+1900); // 기준이 1900년임
		System.out.println(cal.getMonth()+1); // 월은 0부터니까 +1
		System.out.println(cal.getDate());     // 날짜
		System.out.println(cal.getHours());   // 시
		System.out.println(cal.getMinutes()); // 분
		System.out.println(cal.getSeconds()); // 초
		
		// 현재시간 >> .getTime()
		System.out.println(cal.getTime()); // 밀리세컨(롱타입)
		// 몇 일 지났는지 계산
		System.out.println((System.currentTimeMillis()-cal.getTime())/1000/60/60/24);
		// 10000 (밀리세컨드)
		// 60 분
		// 60 시
		// 24 시간
		
		// 롱타입으로 반환			>> .currentTimeMillis()
		// cal을 롱타입으로 반환    >> cal.getTime()
		// 계산해준다.
		
		

		
		

	}

}
