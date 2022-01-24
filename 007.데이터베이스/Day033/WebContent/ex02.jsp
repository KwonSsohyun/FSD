<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전달할 페이지</h1>
	
	<!-- ▶▶ 기본이 GET 방식 : 주소에 바로 보냄 (파일전송불가능) → method="get"
	                          주소를 치고 접속
	                          빠르고 간편, 정보노출 -->
	<!-- ▶▶ post 방식 : 값 숨겨서 전달 (주소표시줄 안나옴 | 헤더에 정보를 보냄 | 
	                    from태그를 꼭 써야 접근 가능 (입력폼에서 넘어오는 방식) (curd 데이터베이스 값변동이 주소의 영향안받으니 새로고침할때마다 안일어나니 좋다)
	                    바이너리데이터(값 그대로감 (엔코딩필요없음,파일을 주고받고 가능, 문자열이외의 데이터 가능, 제한이 없다.) 
	                    
	                    → method="post" -->
	<form action="ex03.jsp" method="post"> 
	
	 	ename : <input type = "text" name="ename"><br>
	 	empno : <input type="text" name="empno"><br>
	 	
	 	<input type="checkbox" name="chk" value="i1">item1
	 	<input type="checkbox" name="chk" value="i2">item2
	 	<input type="checkbox" name="chk" value="i3">item3 <br>
	 	
		<input type ="submit" value="전달">
		
	</form>
</body>
</html>