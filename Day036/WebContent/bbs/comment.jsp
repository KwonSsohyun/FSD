<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"  %>
	<%
		// 댓글 쓰는 - 쿼리 실행하는 곳
		request.setCharacterEncoding("utf-8");
	
		String sub = request.getParameter("sub");
		String id = request.getParameter("id");
		String content = request.getParameter("content");
		
		int grp = Integer.parseInt(request.getParameter("grp"));
		int ord = Integer.parseInt(request.getParameter("ord"));
		int dep = Integer.parseInt(request.getParameter("dep"));
		
		// 조건에 따라 2개로 나눠져야 함.
		// ▶ ord = 0
		// ▶ ord != 0
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			if(ord==0){ 
				// ▶▶ 본문의 답글
				// insert into bbs05 (num,sub,id,content,grp,ord,dep) 
				//         values (bbs05_seq.nextval, '답글1', 'guest', 'test', 4, (select max(ord)+1 from bbs05 where grp=4), 0+1);
			
				String sql = "insert into bbs05 (num,sub,id,content,grp,ord,dep) ";
				sql += "values (bbs05_seq.nextval, '"+ sub +"','"+ id + "','"+ content + "'," + grp;
				sql += ",(select max(ord)+1 from bbs05 where grp=" + grp + "),1) "; 
				
				System.out.println(sql);
				
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				
				
			} else { // ord != 0
					
				// ▶▶ 본문의 답글의 "답글"	
				
				// 기존값 보다 크면 다 숫자 +1
				// 쿼리문장 2개 
				// update bbs05 set ord=ord+1 where grp=4 and ord>param;
				stmt = conn.createStatement();
				stmt.executeUpdate("update bbs05 set ord=ord+1 where grp="+grp+" and ord>"+ord);
				stmt.close();
				
				// -------------------------------------------------------------------------------------
				
				// 기존값에 + 1
				// insert into bbs05 (num,sub,id,content,grp,ord,dep) 
				//			values (bbs05_seq.nextval, '답글1', 'guest', 'test', 4, param+1, 0+1);	
				String sql = "insert into bbs05 (num,sub,id,content,grp,ord,dep) ";
				sql += "values (bbs05_seq.nextval, '"+ sub +"','"+ id +"','"+ content + "',"+grp+","+(ord+1)+","+(dep+1)+")";
				
				System.out.println(sql);
				
			 	stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				
			}
		} finally{
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		
		
		
	
	
		
		// 페이지 돌아가는 곳
		response.sendRedirect("list.jsp");
		
	%>
</body>
</html>