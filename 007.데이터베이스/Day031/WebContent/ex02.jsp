<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스크립트릿</h1>
	<p>
	<b>	자바 코드를 작성하는 부분</b>
	</p>
	<!-- html 주석 -->


	<% // 자바코드 작성하는 부분 ▶ 스크립트릿
		// 자바의 주석	
		// 연결된 io
		
		int su = 1234;
		
		for(int i=0; i<10; i++){
			// out 내장객체 (참조변수)
			System.out.println(out); // out을 통해서 화면에 쏠 수 있다.
			// out.print("출력");	 // 서버의 콘솔
			// out.print("<br>");   // 화면적인 퍼포먼스는 html언어
			out.print(su +" "+ i +" 출력<br>");
		}
	%>	
	<p>또 다른 스크립트릿 </p>
	
	<%
		int su2 = 4321;
		out.println("<h2>다른 스크립트릿" + su +"</h2>");
		out.println(new java.util.Date()); // 객체 생성할때마다 다른 시간 볼 수 있다.(창 새로고침 할때마다) // 어시스트 작동하지 않음
	%>
	
	
	
	
	
</body>
</html>