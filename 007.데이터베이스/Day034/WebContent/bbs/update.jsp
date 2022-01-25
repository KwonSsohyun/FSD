<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// POST방식 - 한글처리
		request.setCharacterEncoding("utf-8");
		
		// 수정 - 파라미터 전달받고 쿼리문장 수행하고 리스트 페이지 보여주기
		String param1 = request.getParameter("num");
		String param2 = request.getParameter("sub");
		String param3 = request.getParameter("content");
		
		int num = Integer.parseInt(param1);
		String sub = param2.trim(); // 앞뒤공백 자름 -> 제목에 앞뒤에 공백에 있다는게 이상하니까 처리해준다.
		String content = param3;
		
		String sql = "update bbs03 set sub='"+sub+"',content='"+content+"' where num="+num;
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
	
		// 다 끝나면 돌아가기
		// 해당자기글에 넘어가기
		response.sendRedirect("detail.jsp?num="+num);
	
	%>
</body>
</html>