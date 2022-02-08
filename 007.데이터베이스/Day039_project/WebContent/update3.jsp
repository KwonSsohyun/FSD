<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*, java.util.ArrayList" %>
	
	<!-- ▶ 한글깨짐 방지 -->
	<% request.setCharacterEncoding("utf-8"); %>
	
	<!-- ▶ 객체 찍어내는 것 -->
	<jsp:useBean id="stu" class="com.hi.bean.StuBean"></jsp:useBean>
	
	<!-- ▶ 파라미터 받아와서 객체에 담는다. -->
	<!-- 넘어오는 파라미터값 전부 다 받을때 * 사용 -->
	<jsp:setProperty property="*" name="stu"/>
	
	<%
		
		String sql = "update bbs07 set num="+ stu.getNum() + ",name='"+stu.getName()+"',kor="+stu.getKor()+",eng="+stu.getEng()+",math="+stu.getMath() + "where num="+stu.getNum();
	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String username = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
	

		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
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