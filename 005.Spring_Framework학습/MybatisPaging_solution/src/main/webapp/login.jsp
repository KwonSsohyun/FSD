<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>
<div class="jumbotron">
   <h1>로그인</h1>      
</div>
<%@ include file="menu.jsp" %>  
	<div class="container" align="center">
		<div class="col-md-4 col-md-offset-4">
			<h3 class="form-signin-heading">로그인</h3>
			<%
				if (request.getParameter("error")!=null) {
					out.println("<div class='alert alert-danger'>");
					out.println("아이디와 비밀번호를 확인해 주세요");
					out.println("</div>");
				}
			%>
			<form class="form-signin" action="login.do" method="post">
				<div class="form-group">
					<label for="inputUserName" class="sr-only">아이디</label> 
					<input	type="text" class="form-control" placeholder="ID" name="id" value="${userVO.id}" autofocus>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="sr-only">비번</label> 
					<input 	type="password" class="form-control" placeholder="Password" name="password" value="${userVO.password}" >
				</div>
				<button class="btn btn btn-lg btn-success btn-block" type="submit">로그인</button>
			</form>
		</div>
	</div>
</body>
</html>