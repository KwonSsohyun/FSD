<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Session</title>
</head>
<body>
	<p> <h4>----- 세션 유효 시간 변경 전 -----</h4>
	<%
		//세션 기본값  1,800초
		//예전에는 세션의 유효시간을 0이나 음수로 설정하면 세션 유효시간이 없는 상태가 되어
		//이 상태에서 세션 제거를 하지 않고 종료되면 웹서버에서 세션이 제거 되지 않고 유지되었으나
		//현재는 브라우저 보안으로 인해 브라우저가 종료되면 세션이 무조건 만료됨.
		int time = session.getMaxInactiveInterval() / 60;

		out.println("세션 유효 시간  : " + time + "분<br>");
	%>
	<p>	<h4>----- 세션 유효 시간 변경 후 -----</h4>
	<%
		//세션 유효시간 설정 60초=1분 설정
		//유효시간 이후 세션 자동 만료됨
		session.setMaxInactiveInterval(60);
		time = session.getMaxInactiveInterval() / 60;

		out.println("세션 유효 시간  : " + time + "분<br>");
	%>
</body>
</html>