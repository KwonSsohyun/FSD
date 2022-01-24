<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>before</h1>
	<%
	    String msg = "abc";
	
	    // 여기서 또 IO를 받아서 또 쓰니 나머지 덮어써진다.
		java.io.OutputStream os = response.getOutputStream();
		os.write("hello".getBytes());
		os.flush();
		os.close();
		// out 내장객체 - 출력
		out.println();
	%>
	<!-- 표현식 출력 -->
	<h2>after<%=msg %></h2>
</body>
</html>