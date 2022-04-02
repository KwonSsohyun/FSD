<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%	// 설정해놓은 쿠키 가져옴
		// 세션아이디(JSESSIONID)까지 쿠키로 가져옴
		Cookie[] cookies = request.getCookies();
	
	if(cookies!=null){
		out.println("현재 설정된 쿠키의 개수 => " + cookies.length + "<br>");
		out.println("==========================<br>");
		for (int i = 0; i < cookies.length; i++) {
			out.println("설정된 쿠티의 속성 이름 [ " + i + " ] : " + cookies[i].getName() + "<br>");
			out.println("설정된 쿠키의 속성 값 [ " + i + " ] : " + cookies[i].getValue() + "<br>");
			out.println("---------------------------------------------<br>");
		}
	}else{
		// 브라우저 바로 세션아이디(JSESSIONID) 못 끌고 옴
		// 새로고침해야만 가져올 수 있다.
		out.print("쿠키가 없습니다.");
	}
	%>
</body>
</html>