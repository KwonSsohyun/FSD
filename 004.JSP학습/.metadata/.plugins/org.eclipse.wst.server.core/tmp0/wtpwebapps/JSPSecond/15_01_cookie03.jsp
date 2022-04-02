<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();

		for (int i = 0; i < cookies.length; i++) {
			// 쿠키 만료시간 변경 (1초단위) 
			cookies[i].setMaxAge(60*60*24); // 하루
			
			// 쿠키 삭제 (0또는 음수로 지정)
			cookies[i].setMaxAge(0); // 0으로 하면 쿠키 넘기면서 사라진다.
			response.addCookie(cookies[i]); // 같은 이름으로 재생성해서 없앤다.
		}
		response.sendRedirect("15_01_cookie02.jsp");
	%>
</body>
</html>