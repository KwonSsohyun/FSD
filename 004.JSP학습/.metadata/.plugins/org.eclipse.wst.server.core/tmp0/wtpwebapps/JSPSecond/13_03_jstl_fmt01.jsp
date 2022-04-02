<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<% request.setAttribute("nationCode", (request.getParameter("nc")!=null ? request.getParameter("nc") :"en")); %>
<html>
<head>
<title>Internationalization</title>
</head>
<body>
<button onclick="location.href='13_03_jstl_fmt01.jsp?nc=ko'">한국어</button>
<button onclick="location.href='13_03_jstl_fmt01.jsp?nc=en'">영어</button>
	<p>	--------기본 로케일--------
		<fmt:setBundle basename="com.bundle.myBundle" var="resourceBundle" />
	<p>	제목 :<fmt:message key="title" bundle="${resourceBundle}" />
	<p>	<fmt:message key="username" var="userMsg" bundle="${resourceBundle}" />
		이름 : ${userMsg}
		
	<p>	--------영문 로케일 --------
		<fmt:setLocale value="${nationCode}" />
		<fmt:setBundle basename="com.bundle.myBundle" var="resourceBundle" />
	<p>	제목 :<fmt:message key="title" bundle="${resourceBundle}" />
	<p>	이름 :<fmt:message key="username" bundle="${resourceBundle}" />
</body>
</html>