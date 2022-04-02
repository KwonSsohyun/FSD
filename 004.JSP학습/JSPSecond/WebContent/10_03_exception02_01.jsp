<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page errorPage="10_03_exception02_02.jsp"%>
<html>
<head><title>에러 처리</title></head>
<body>
	<h2>에러 페이지</h2>
	name 파라미터 값: <%= request.getParameter("name").toUpperCase() %><br><hr>
</body>
</html>
