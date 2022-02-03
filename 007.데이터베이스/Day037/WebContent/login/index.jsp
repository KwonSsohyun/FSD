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
		
		<h1>로그인</h1>
		<form action="result.jsp" method="post">
			<table>
				<tr>
					<td>id</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>pw</td>
					<td><input type="text" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="로그인">
						<input type="reset" value="취소">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><a href="join.jsp">회원가입</a></td>
				</tr>
			
			</table>
		
		
		</form>
		
		
		
		<!-- ▶ 템플릿 파일 → 인쿠르드해서 가져옴 -->
		<%@ include file="../template/footer.jspf" %>	
</body>
</html>