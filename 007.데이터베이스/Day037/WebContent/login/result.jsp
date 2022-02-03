<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../template/header.jspf" %>
	<%@ page import = "java.sql.*" %>
	
	<%-- <jsp:useBean id="user" class="com.hi.bean.UserBean" scope="session"></jsp:useBean> --%>
	<%
		// [ scope ]	
		/// 정보를 기억하는 주체 -> 톰켓
		///                         톰켓 세션 메모리 (같은 공간)(로그인 값 담고 있음) 
		///// 네트워크계층 - 동일접속이냐 아니냐 구분하는것
        ///// 링크를 타고 왔을때 
		
		// => page
		//    : 디폴트 - 실행되는 현재 jsp에서만 유효하다.
		//    : 안주면 page 현재페이지 -> page 스코프는 일시적
		
		// => request
		//    : 요청하는 단계에서 요청할때 응답하기 전까지 계속 유지 (같은 리퀘스트에서 페이지넘어가는 상황)
		
		// => session
		//    : 접속당 하나 -> 해당 브러우저에서만 유지 -> 다른 크롬이나 엣지로 하면 다름
		//      어셉되는 순간 어셉 하나씩
		//      접속이 다르면 다른 메모리 공간
		//      (네트워크계층 세션과는 다름) -> 톰켓? 
				//  로그아웃 - 값 다 날리면됨 (톰켓 메모리 값)
		
		// => application
		//    : 어플리케이션 -> 서버를 켜서 끌때까지 계속 유지됨
		//      메인을 켰으면 공간을 해놓고 쓰는것
	
	
	
	
	%>
	<jsp:setProperty property="*" name="user"/>
	
	<%
		String sql = "select name from user06 where id='"+user.getId()+"' and pw='"+user.getPw()+"'";
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
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
			
			if(rs.next()){
				// 로그인 성공
				String name=rs.getString("name");
				user.setName(name);
				user.setResult(true);
				out.println("<h1>로그인 성공</h1>");

			} else {
				// 로그인 실패
				user.setResult(false);
				out.println("<h1>로그인 실패</h1>");
			}
			
			
		} finally {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		
		response.sendRedirect("/Day037/");
	
	%>
	
	<%@ include file="../template/footer.jspf" %>
</body>
</html>