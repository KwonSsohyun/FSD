<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력 페이지</h1>
	<!-- 
		주소창 계속 입력 막기 ▶ method="post"
								POST방식으로 바꾼다. 
								기본이 GET방식이라 주소창에 적으면 계속 값 추가할 수 있어서 막기 위함
	-->

	<form action = "insert.jsp" method="post">
		<table align="center">
			<tr>
				<td>제목</td>
				<td><input type="text" name="sub"></td>
			</tr>
			<tr>
				<td colspan="2"><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>