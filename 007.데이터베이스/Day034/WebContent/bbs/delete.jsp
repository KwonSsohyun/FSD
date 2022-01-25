<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 삭제
		
		// 파라미터로 받아오자마자 숫자형 변환해서 변수 담음
		int num = Integer.parseInt(request.getParameter("num"));
		
		String sql = "delete from bbs03 where num="+num;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "scott";
		String password = "tiger";
		
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
		
		response.sendRedirect("list.jsp");
		
	
	
	%>
	
</body>
</html>