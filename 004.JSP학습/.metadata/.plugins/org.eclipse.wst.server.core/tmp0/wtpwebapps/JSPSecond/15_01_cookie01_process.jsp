<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Cookie</title>
</head>
<body>
	<%
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("passwd");

		if (user_id.equals("admin") && user_pw.equals("1234")) {
			// 쿠키 객체 생성
			// 데이터만 생성
			Cookie cookie_id = new Cookie("userID", user_id);
			Cookie cookie_pw = new Cookie("userPW", user_pw);
 			// cookie_id.setMaxAge(60*60*24*1); //유효기간 1일 설정

			// 응답객체에 쿠키 추가(클라이언트 브라우저에 저장)
			// 실제 브라우저에 쓰이는건 여기!
			response.addCookie(cookie_id);
			response.addCookie(cookie_pw);
			
			out.println("쿠키 생성이 성공했습니다<br>");
			out.println(user_id + "님 환영합니다");
		} else {
			out.println("쿠키 생성이 실패했습니다");
		}
	%>
</body>
</html>