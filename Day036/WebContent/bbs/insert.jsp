<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"  %>
	<%  
		// 입력시 쿼리문장 수행	
		
		// 미입력시 다시 돌아가기
		String path = "add.jsp";
	
		// POST방식인지 체크
		String method = request.getMethod();
	
		// POST방식 한글 처리방식
		request.setCharacterEncoding("utf-8");
		
		// 파라미터 받기
		String sub = request.getParameter("sub").trim(); // 앞뒤공백 없앰
		String id = request.getParameter("id").trim();
		String content = request.getParameter("content");
		
		
		// isEmpty() >> 아무것도 입력 안했을때
		// null      >> 사용자가 주소창에 insert.jsp 치고 접속할때도 막음
		
		if(method.equals("POST") && sub!=null && id!=null && !sub.isEmpty() && !id.isEmpty()){
		
			// 쿼리문장
			String sql = "insert into bbs05 (num,sub,id,content,grp) values (bbs05_seq.nextval,'"
			              +sub+"','"+id+"','"+content+"', bbs05_seq.currval)";
			
			
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
				
				// 입력이 잘 됬을때만 수행됨.
				path = "list.jsp";
				
			} finally{
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}
		} else {
			// 제목, 글쓴이 -> 둘 중 하나라도 입력하면 값을 살아나게 해주기
			if(sub==null) sub="";
			if(id==null) id="";
			path += "?sub=" + sub + "&id=" + id;
		}
		response.sendRedirect(path);
	
	%>
</body>
</html>