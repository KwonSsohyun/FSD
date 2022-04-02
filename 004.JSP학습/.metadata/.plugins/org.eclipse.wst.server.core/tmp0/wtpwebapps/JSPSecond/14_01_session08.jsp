<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*, java.text.*" %>
<html>
<head>
<title>Session</title>
</head>
<body>
	<%
		String sessin_id = session.getId();
		out.println("세션 아이디 : " + sessin_id + "<br>");
		
		
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:SS");

		long start_time = session.getCreationTime();
		date = new Date(start_time);
		out.println("세션이 생성된 시간  : " + sdf.format(date) + "<br>");
		
		long last_time = session.getLastAccessedTime();
		date = new Date(last_time);
		out.println("세션에 마지막으로 접근한 시간 : " + sdf.format(date) + "<br>");

		long used_time = (last_time - start_time) / 1000;
		out.println("웹 사이트에서 경과 시간  : " + used_time + "초<br>");
	%>
</body>
</html>