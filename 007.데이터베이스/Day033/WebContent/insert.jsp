<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 0초 뒤 페이지 바꾸기 -->
<meta http-equiv="refresh" content="3; url=index.jsp">

<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%
	
		// ▶ ≪ POST 방식일때만 접근하게 하기 ≫
		//     주소로 붙혀버리는 GET방식 막기 → ex) http://localhost:8080/day33/insert.jsp?sub=text&content=text
		//                                          주소 계속 칠때마다 값이 계속 ⇒ sub=text&content=text  들어감
		//                                          그것을 막고자, POST방식일때만 접근하게 설정한다.
		String method = request.getMethod();
	
		if(method.equals("POST")){ // POST방식일때만 테이블에 값 추가
			String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
			String sub = request.getParameter("sub");
			String content = request.getParameter("content");
		
		
			String sql = "insert into bbs02 values (bbs02_seq.nextval,'"+sub+"','"+content+"',sysdate)";		
			
			Connection conn = null;
			Statement stmt = null;
			
			try{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				conn = DriverManager.getConnection(url);
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				
			} finally {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}
		}
	%>
	
</body>
</html>