<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	
	<%
		String sql = "delete from bbs06 where num="+request.getParameter("num");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String user = "scott";
		String password = "tiger";
	
		if(request.getMethod().equals("POST")){
			Connection conn = null;
			Statement stmt = null;
			
		
			try{
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				
				
			} finally {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}
		
			response.sendRedirect("./");
			
			
		} else { // POST방식이 아닐때 페이지 이동
			response.sendRedirect("./detail.jsp?num="+request.getParameter("num"));
		}
	
	
	%>
</body>
</html>