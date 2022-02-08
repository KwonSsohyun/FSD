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
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<!-- ▶ 객체 찍어내는 것 -->
	<jsp:useBean id="stu" class="com.hi.bean.StuBean"></jsp:useBean>
	
	<!-- ▶ 파라미터 받아와서 객체에 담는다. -->
	<jsp:setProperty property="num" name="stu"/>
	
	<%
	System.out.println("test1");
		ArrayList<Integer> sunum = new ArrayList<Integer>();
	
		// 해당 학번이 있냐?
		String sql = "select num from bbs07";
		int num=0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String username = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				if(rs.getInt(1) == stu.getNum()){
					num = stu.getNum();
					//System.out.println("있습니다~");
				}
			}
			if(num<=0){
				out.println("<script>alert('있는 학번을 다시 입력하시오.'); location.href='edit.jsp';</script>");
			}
			
		} finally {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
	%>
	
	<script>
		window.onload = function(){
			console.log('test');
			 location.href = "http://localhost:8080/Day039_project/update2.jsp?num="+<%=num%>;
		}
	</script>
</body>
</html>