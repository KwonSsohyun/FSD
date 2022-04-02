<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>JSTL fmt태그</title>
</head>
<body>
	<h3>JSTL fmt태그 사용</h3>
	<span style="color:red">파라미터의 인코딩 설정하기</span><br>
	
	<fmt:requestEncoding value="utf-8" />
	<%-- <% request.setCharacterEncoding("utf-8"); %> --%>
	
	요청 파라미터 : 
	<%=request.getParameter("name")%>
	<form method="post">
		<p>이름: <input type="text" name="name" value="김마리"></p>
		<p><input type="submit" value="전송"></p>
	</form>
</body>
</html>