<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트페이지</h1>
	
	<table border="1" width="100%">
		<tr>
			<th width="100">글번호</th>
			<th>제목</th>
			<th width="100">날짜</th>
		</tr>
		<%
			// 쿼리문
			String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
			String sql = "select num, sub, nalja from bbs02 order by num desc";
		
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				conn = DriverManager.getConnection(url);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()){
		%>
					<tr>
						<td><%= rs.getInt(1) %></td>
						<td><%= rs.getString(2) %></td>
						<td><%= rs.getDate(3) %></td>
					</tr>
		<%
				}
			} finally {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}
		%>

	</table>
	<a href="add.jsp">입력</a>
</body>
</html>