<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.sql.*,   oracle.jdbc.driver.OracleDriver" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="2; url=list.jsp"> <!-- 2초 동안 페이지 보여지고 다시 list.jsp 페이지로 이동  -->


<title>Insert title here</title>
</head>
<body>
	<%
	    // 삭제
		String num = request.getParameter("num"); // 파라미터값 전달 받음 (안던져줬는데, 받으려 하면 오류)
		String sql = "delete from bbs01 where num="+num;
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		Connection conn = null;
		Statement stmt = null;
		
		try{
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		
		} catch(SQLException e){
			// 파라미터 오류 -> 이걸 안적으면 15번에서 잘못받아지면 오류남
		} finally{
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
	%>
</body>
</html>