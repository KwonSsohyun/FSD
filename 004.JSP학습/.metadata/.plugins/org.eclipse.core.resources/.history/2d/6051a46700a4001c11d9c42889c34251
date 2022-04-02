<%@ page import="java.sql.*"%> 
<%
	Connection conn = null;
	String user = "test";
	String password = "1234";
	
// 	String url = "jdbc:mariadb://localhost:3306/jspbookdb";
// 	Class.forName("org.mariadb.jdbc.Driver");
	
/* 	String url = "jdbc:mysql://localhost:3306/jspbookdb";
	Class.forName("com.mysql.jdbc.Driver"); */
	
 	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	
	conn = DriverManager.getConnection(url, user, password);
%>