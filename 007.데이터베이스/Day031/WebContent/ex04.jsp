<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request(요청) 내장객체</h1>
	
	<% // 자바 소스코드
	
		// 8080은 서버의 문
		
		String addr = request.getRemoteAddr();
		String host = request.getRemoteHost(); // 클라이언트 IP주소 가져옴
		
		int port = request.getRemotePort();
		
		System.out.println(addr);
		System.out.println(host);
		System.out.println(port); // 클라이언트 나가는 문
	
		// 쿼리스트링의 파싱
		// http://192.168.0.38:8080/Day031/ex04.jsp?id=admin&pw=abcd ▶  ?id=admin&pw=abcd
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
	
	%>
	
</body>
</html>