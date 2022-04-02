<%@ page contentType="text/html; charset=utf-8" %>
<%
	String memberId = request.getParameter("memberId");
	out.print("memberId: "+memberId+"<br>");
	session.setAttribute("MEMBER", memberId);
%>
<html>
<head><title>로그인</title></head>
<body>

로그인 성공<br>
아이디: ${memberId }<br>
<a href="<%=request.getContextPath() %>/board/boardList.jsp">게시판 보기</a>
</body>
</html>