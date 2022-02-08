<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import= "java.sql.*" %>
	<%
		String sql = "delete from bbs07 where num="+request.getParameter("num");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
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
				
			} finally{
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}
			
			response.sendRedirect("list.jsp");
			
		} else {
			response.sendRedirect("list.jsp");
		}
	
	
	
	
	
	
	
	
	%>
</body>
</html>