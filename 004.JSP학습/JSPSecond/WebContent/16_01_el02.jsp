<%@page import="com.dao.Thermometer"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
	Thermometer thermometer = new Thermometer();
	request.setAttribute("t", thermometer);
%>
<html>
<head>
	<title>EL로 객체의 메서드 호출하기</title>
</head>
<body>
	<h2>EL로 객체의 메서드 호출하기</h2>
	${t.setCelsius('서울', 27.3)}
	서울 온도: 섭씨 ${t.getCelsius('서울')}도 / 화씨 ${t.getFahrenheit('서울')}

	<br/>
	정보: ${t.info}
</body>
</html>
