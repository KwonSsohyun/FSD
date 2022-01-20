<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>페이지 이동</h1>
	<a href = "http://192.168.0.38:8080/Day031/ex04.jsp?id=admin&pw=abcd">go ex05.jsp</a> <!-- 절대경로 -->
	<a href = "ex04.jsp?id=admin&pw=abcd>go ex05.jsp"></a> <!-- 상대경로 -->
	
	<form action = "ex04.jsp"> <!-- 입력한 값을 가지고 쿼리스트링을 만든다. -->
		<input type = "text" name = "id" value = "까꽁!"> <!-- 입력창 -->
		
		
		
		
		
		<!-- 선택하는 것 -->
		<!-- <select name = "pw" size="4"> size주면 펼쳐져서 보임
			<option value = "i1">item1</option> value 주면 해당 값으로 전달된다.
			<option value = "i2">item2</option>
			<option value = "i3">item3</option>
			<option value = "i4">item4</option>
		</select> -->
		
		
		
		
		<!-- <input type = "radio" name = "pw" value = "aaaa"> 서로 name이 같아서 하나를 선택하고 다른거 선택하면 기존 선택한것 선택 풀림 
		<input type = "radio" name = "pw" value = "bbbb" checked> checked 처음부터 선택
		<input type = "radio" name = "pw" value = "cccc"> -->
		
		<!-- <input type = "checkbox" name = "pw" value = "aaaa"> <!-- 체크해서 보내면 벨류값 aaa가 넘어가고 / 미체크시 NULL 전달 -->
		
		<!-- <input type = "password" name = "pw"> <!-- 입력창 | type에 "password"라고 적으면 ooo으로 보인다. |  type = "hidden" 화면에 안보인다. --> 
		
		<textarea rows ="5" cols="" name="pw">ㄴㄴㄴㄴ</textarea> <!-- row에 5 적으면 5줄 -->
		
		<input type = "submit" value = "까꽁!"> <!-- 버튼 | value안주면 버튼 내용은 알아서 정해진다. --> 
	</form>
	
</body>
</html>