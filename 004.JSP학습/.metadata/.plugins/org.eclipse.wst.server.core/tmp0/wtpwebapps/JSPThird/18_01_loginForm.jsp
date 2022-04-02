<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head><title>로그인</title></head>
<body>
<form action="<%= request.getContextPath() %>/18_01_login.jsp" method="post">
아이디<input type="text" name="memberId" required>
암호<input type="password" name="password" required>
<input type="submit" value="로그인">
</form>
</body>
</html>
