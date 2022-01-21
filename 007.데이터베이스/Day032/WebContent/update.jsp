<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.sql.*,  oracle.jdbc.driver.OracleDriver" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 페이지 돌아가려면!!!! -->
<% String num = request.getParameter("num"); %> <!-- 여기에 있어야 아래서 num 쓸 수 있으니까 -->
<meta http-equiv="refresh" content="0; url=detail.jsp?num=<%=num%>"> 
<!-- 0초뒤  list.jsp로 이동 -->

<title>Insert title here</title>
</head>
<body>
	<%
		
		String sub = request.getParameter("sub");
		String content = request.getParameter("content");
		
		// 쿼리문장
		String sql = "update bbs01 set sub='" + sub +"', content='" +content+"' where num="+num;
		// 데이터베이스 접속 위한 url
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		Connection conn = null;
		Statement stmt = null;
		
		try{
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			
		} catch(SQLException e){
			out.print("잘못된 접근입니다.");
		} finally {
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
	%>
</body>
</html>