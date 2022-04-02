<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Validation</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>

	<p>	아이디 : <%=request.getParameter("uid")%>
	<p>	비밀번호 :	<%=request.getParameter("upw")%>
	<p>	이름 : <%=request.getParameter("unm")%>
	<p>	연락처 : <%=request.getParameter("phone1")%>-<%=request.getParameter("phone2")%>-<%=request.getParameter("phone3")%>
	<p>	이메일 : <%=request.getParameter("umail")%>
</body>
</html>