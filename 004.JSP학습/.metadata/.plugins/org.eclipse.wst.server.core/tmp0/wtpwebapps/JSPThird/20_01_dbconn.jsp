<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%> 
<%
	Connection conn = null;
	// String user = "test";
	// String password = "tiger";
	String user = "root";
	String password = "1111";
	

	// 마리아DB
	String url = "jdbc:mariadb://localhost:3306/jspproject";
	Class.forName("org.mariadb.jdbc.Driver");
	
/* 	마이에스큐엘
	String url = "jdbc:mysql://localhost:3306/jspbookdb";
	Class.forName("com.mysql.jdbc.Driver"); */
	
 	// String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// Class.forName("oracle.jdbc.driver.OracleDriver"); 
	
	conn = DriverManager.getConnection(url, user, password);
%>