<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<html>
<head>
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
    <%@ include file="17_01_menu.jsp"%>
	<%!String greeting = "웹 쇼핑몰에 오신 것을 환영합니다";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<div class="container">
		<div class="text-center">
			<h3>Security</h3>
			<p>	사용자명(username) :	<%=request.getRemoteUser()%></p>
			<p>	인증방법 :	<%=request.getAuthType()%></p>
			<p>	인증한 사용자명이 역할명 "tomcat"에 속하는 사용자인가요?
				<%=request.isUserInRole("tomcat")%></p>
			<p>	인증한 사용자명이 역할명 "role1"에 속하는 사용자인가요?
				<%=request.isUserInRole("role1")%> </p> 
		</div>
		<hr>
	</div>	
	<%@ include file="17_01_footer.jsp"%>
</body>
</html>