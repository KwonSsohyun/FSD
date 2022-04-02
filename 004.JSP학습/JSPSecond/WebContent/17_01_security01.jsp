<%@ page contentType="text/html; charset=utf-8"%>
<% session.setAttribute("uid", request.getRemoteUser()) ;%>
<html>
<head>
<title>Security</title>
</head>
<body>
	<p>인증 성공했습니다.</p><br>
	<button onclick="location.href='17_01_security02.jsp'">인증 정보 확인하기</button>
	<button onclick="location.href='17_01_logout.jsp'">로그아웃</button>
</body>
</html>