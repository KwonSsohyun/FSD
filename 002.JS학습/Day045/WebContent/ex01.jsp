<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>전달할 메시지</h1>
		<% 
			System.out.println("ex01 jsp 페이지 호출..."); 
		
			// 메소드 방식 찍어봄
			// get | post 방식 인지
            System.out.println(request.getMethod()); 	
		%>
	</body>
</html>