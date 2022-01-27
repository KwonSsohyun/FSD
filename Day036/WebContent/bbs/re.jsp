<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- ▶ 템플릿 파일 → 인쿠르드해서 가져옴 -->
	<%@ include file="../template/header.jspf" %>
	
	<h1>댓글 페이지</h1>
	<form action="comment.jsp" method="post">

	<!-- 화면에 표시하지 않고, 바로 값 숨겨서 전달 -->
	<input type="hidden" name="grp" value="<%=request.getParameter("grp") %>">
	<input type="hidden" name="ord" value="<%=request.getParameter("ord") %>">
	<input type="hidden" name="dep" value="<%=request.getParameter("dep") %>">

		<table>
			<tr>
				<td>제목</td>
				<!-- value = 실제 넘어가는 값 -->
				<td><input type="text" name="sub"></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td colspan="2"><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입 력">
					<input type="reset" value="취 소">
				</td>
			</tr>
		
		
		</table>
	</form>
	
	<!-- ▶ 템플릿 파일 → 인쿠르드해서 가져옴 -->
	<%@ include file="../template/footer.jspf" %>
</body>
</html>