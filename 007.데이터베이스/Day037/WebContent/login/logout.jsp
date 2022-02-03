<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="../template/header.jspf" %>

	<jsp:setProperty property="result" name="user" value="false" />

		<h1>이용해주셔서 감사합니다.</h1>

	<% response.sendRedirect("/Day037/"); %>

	<%@ include file="../template/footer.jspf" %>
</body>
</html>