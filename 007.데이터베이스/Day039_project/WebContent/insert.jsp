<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ▶ 한글깨짐 방지 -->
	<% request.setCharacterEncoding("utf-8"); %>
	
	<!-- ▶ 객체 찍어내는 것 -->
	<jsp:useBean id="stu" class="com.hi.bean.StuBean"></jsp:useBean>
	
	<!-- ▶ 파라미터 받아오는 것 -->
	<jsp:setProperty property="num" name="stu"/>
	<jsp:setProperty property="name" name="stu"/>
	<jsp:setProperty property="kor" name="stu"/>
	<jsp:setProperty property="eng" name="stu"/>
	<jsp:setProperty property="math" name="stu"/>
	
	<%@ page import="java.sql.*" %>
	
	<% 
		String sql = "insert into bbs07 values ("+ stu.getNum() + ",'"+ stu.getName() +"',"+ stu.getKor() + "," + stu.getEng() + "," + stu.getMath() + ")";
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
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
	
	
	%>
	
	
</body>
</html>