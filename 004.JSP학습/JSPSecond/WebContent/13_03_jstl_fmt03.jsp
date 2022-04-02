<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Internationalization</title>
</head>
<body>
	<p> <jsp:useBean id="now" class="java.util.Date" />
<%-- <%@ page import="java.util.Date" %>
	 <% Date now = new Date(); %> 
--%>
	<p> date: <fmt:formatDate value="${now}" type="date" />
	<p> time: <fmt:formatDate value="${now}" type="time" />
	<p> both: <fmt:formatDate value="${now}" type="both" />
	<p> default: <fmt:formatDate value="${now}" type="both" dateStyle="default" timeStyle="default" />
	<p> short: <fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short" />
	<p> medium: <fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium" />
	<p> long: <fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long" />
<!-- 	 KST 시간표기법: Korea Standard Time -->
	<p> full: <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" />
	<p> pattern: <fmt:formatDate value="${now}" type="both" pattern="yyyy년 MM월 dd일  HH시 mm분 ss초  E요일" />
</body>
</html>