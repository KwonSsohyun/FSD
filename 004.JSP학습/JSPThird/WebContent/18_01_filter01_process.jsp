<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Filter</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String name1 = request.getAttribute("name").toString();
	%>
	<p>	입력된 파라미터 name 값 :<%=name%></p>
	<p>	입력된 속성 name 값 :<%=name1%></p>
</body>
</html>