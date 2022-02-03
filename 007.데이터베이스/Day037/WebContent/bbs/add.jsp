<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../template/header.jspf" %>
	
	<h1>입력페이지</h1>

		<form action="insert.jsp" method="post">
			<table>
				<tr>
					<td>제목</td>
					<td>
						<input type="text" name="sub">
					</td>
				</tr>
				<tr>
					<td>글쓴이</td>
					<td>
						<input type="text" name="id">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea name="content"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="입 력">
						<input type="reset" value="취 소">
					</td>
				</tr>
			</table>
		</form>
	
		
	
	<%@ include file="../template/footer.jspf" %>
</body>
</html>