<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	request.setAttribute("person", "호동이");
%>
<html>
<head><title>EL의 기본객체</title></head>
<body>
<h2>기본객체를 사용한 EL(Expression Language: 표현언어)</h2>
<!-- post방식 인코딩설정 -->
<fmt:requestEncoding value="utf-8"/>

<!-- 컨텍스트부터 ~ URI -->
요청 URI: ${pageContext.request.requestURI}<br>

<%-- request에 설정한  person 속성: ${requestScope.person}<br><hr> --%>
request에 설정한  person 속성: ${person}<br><hr>
request에 설정한  person 속성: <%= request.getAttribute("person")%><br><hr>

<form action="16_01_el01_proc.jsp" method="post">
	<input type="text" name="code" >
	<input type="submit" value="전송">
</form>
</body>
</html>
