<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page errorPage="10_03_exception02_02.jsp"%>
<html>
<head><title>에러 처리</title></head>
<body>
<h2>에러처리 : try~catch 사용</h2>
<%-- 	name 파라미터 값: <%= request.getParameter("name").toUpperCase() %> --%>
 <%try{ %>
	name 파라미터 값: <%= request.getParameter("name").toUpperCase() %>
<%} catch(Exception e){
	out.print("<br>에러 내용<br><hr>");
	out.print("name파라미터가 올바르지 않습니다.<br>");
	out.print("에러메세지: "+ e.getMessage());
} %>
</body>
</html>
