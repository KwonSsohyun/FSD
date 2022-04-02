<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<html>
<head>
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Security</title>
</head>
<body>
	<% String greeting = "인증 성공했습니다.";%>
    <%@ include file="17_01_menu.jsp"%>
    <%if(!request.isUserInRole("manager")){ 
    	session.invalidate();%>
    <script>
	    alert("다른 사용자로 인증해주십시오.");
	    location.href="17_01_login.jsp";
    </script>
    <%} %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<div class="container">
		<div class="text-center">
			<h3><%=greeting%></h3>
			<%
				//response.setIntHeader("Refresh", 5);
				Date day = new java.util.Date();
				String am_pm;
				int hour = day.getHours();
				int minute = day.getMinutes();
				int second = day.getSeconds();
				if (hour / 12 == 0) {
					am_pm = "AM";
				} else {
					am_pm = "PM";
					hour = hour - 12;
				}
				String CT = hour + ":" + minute + ":" + second + " " + am_pm;
				out.println("현재 접속  시각: " + CT + "\n");
			%>
			<br><a href="17_01_security02.jsp">시큐리티 정보 확인하기 </a>
		</div>
		<hr>
	</div>	
	<%@ include file="17_01_footer.jsp"%>
</body>
</html>