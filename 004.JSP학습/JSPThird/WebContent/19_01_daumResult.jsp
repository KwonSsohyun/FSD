<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="addrVO" class="com.dao.AddrVO" />
<jsp:setProperty name="addrVO" property="*"/>

우편번호: <jsp:getProperty name="addrVO" property="addrNum"/><br>
주소: <jsp:getProperty name="addrVO" property="addr1"/>
	<jsp:getProperty name="addrVO" property="addr2"/><br>
참고: <jsp:getProperty name="addrVO" property="cmt"/><br>
</body>
</html>