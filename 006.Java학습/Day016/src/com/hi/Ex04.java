package com.hi;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex04 {

	public static void main(String[] args) {
		// java.text >> Class DateFormat
		
		// 날짜 format 변환 해보기!
		// 무조건 java.util.Date 를 "Date"를 받아온다. (현재시간)
		Date cal = new Date();
		System.out.println(cal);
		
		// 생성자 없음
		java.text.DateFormat df = DateFormat.getDateInstance(DateFormat.FULL , Locale.US ); // 출력포맷 결정해줘야함
		
		/*
			▶ SHORT 	: is completely numeric, such as 12.13.52 or 3:30pm
			▶ MEDIUM 	: is longer, such as Jan 12, 1952
			▶ LONG 		: is longer, such as January 12, 1952 or 3:30:32pm
			▶ FULL 		: is pretty completely specified, such as Tuesday, April 12, 1952 AD or 3:30:42pm PST.
		*/
		
		// cal을 이용해서 문자형 포맷 만들어냄
		// Date를 받아온걸 가지고, 값은 그대로 있고 보여지는 형식을 바꿔준다.
		// String  >>	format(Date date)
		String msg = df.format(cal);
		System.out.println(msg);
		
		
		
		// java.text >> Class SimpleDateFormat
		// java.lang.Object > java.text.Format > java.text.DateFormat > java.text.SimpleDateFormat (위의 데이트 상속)
		java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		// 포멧 패턴은 문서의 표를 참조
		// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		// Date and Time Patterns 사용!
		// 자릿수 지정 : yyyy-MM-dd hh:mm
		
		msg = sdf.format(cal);
		System.out.println(msg);

	}

}
