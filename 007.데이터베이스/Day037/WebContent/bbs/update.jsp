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
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<!-- BbsBean클래스 객체 생성 -->
	<jsp:useBean id="bean" class="com.hi.bean.BbsBean"></jsp:useBean>
	
	<!-- 넘어오는 파라미터값 전부 다 받을때 * 사용 -->
	<jsp:setProperty property="*" name="bean"/>
	
	<%
		String sql = "update bbs06 set sub='"+bean.getSub()
		              +"', content='"+bean.getContent()+"' where num="+bean.getNum();
	
	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user="scott";
		String password="tiger";
		
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
	
		response.sendRedirect("./detail.jsp?num="+bean.getNum());
	
	%>
	
</body>
</html>