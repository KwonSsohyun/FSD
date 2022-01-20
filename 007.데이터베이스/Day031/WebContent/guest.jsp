<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>방명록</h1>
	<form action="result.jsp">                 <!-- 버튼을 누르면 입력을 아무것도 안하더라도 빈값으로라도 → result.jsp로 값 날아감. -->
		<textarea name="msg"></textarea>       <!-- 입력 -->
		<input type = "submit" value = "등록"> <!-- type = "submit" ▶ 버튼 -->
	</form>
	
	
	<%  // 보기
		String sql = "select msg from guest01 order by nalja";
		oracle.jdbc.driver.OracleDriver driver = null;
		// 드라이버로딩
		driver = new oracle.jdbc.driver.OracleDriver();
		
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		
		// 레지스터드라이버로 등록
		java.sql.DriverManager.registerDriver(driver);
		java.sql.Connection conn = java.sql.DriverManager.getConnection(url);
		
		// System.out.println(conn);
	
		java.sql.Statement stmt = conn.createStatement();
		java.sql.ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			out.println("<p>" + rs.getObject(1) + "</p>");
		}
		
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();

	%>
	
	
	
	
</body>
</html>