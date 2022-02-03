<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ▶ 한글깨짐 방지 -->
	<% request.setCharacterEncoding("utf-8"); %>
	
	<!-- ▶ 객체를 찍어내는 것 -->
	<jsp:useBean id="bean" class="com.hi.bean.BbsBean"></jsp:useBean>
	
	<!-- ▶ 파라미터 받아오는 것 -->
	<jsp:setProperty property="sub" name="bean"/>
	<jsp:setProperty property="id" name="bean"/>
	<jsp:setProperty property="content" name="bean"/>
	
	<%@ page import="java.sql.*" %>
	
	<%
		// System.out.println(bean);
		// System.out.println(new com.hi.bean.BbsBean());
		
		
		// ▶▶ <jsp:useBean id="bean" class="com.hi.bean.BbsBean"></jsp:useBean>
		//       com.hi.bean.BbsBean bean2 = new com.hi.bean.BbsBean();
		// ▶▶ class ▶ 타입 
		// ▶▶ id    ▶ 참조변수명 
		
		
		// ▶▶ <jsp:setProperty property="sub" name="bean"/>
		// System.out.println(bean.getSub());
		// System.out.println(bean.getId());
		// System.out.println(bean.getContent());
		
		// <jsp:useBean id="bean" class="com.hi.bean.BbsBean"></jsp:useBean>
		// com.hi.bean.BbsBean bean2 = new com.hi.bean.BbsBean();
		
		// ▶▶ <jsp:setProperty property="sub" name="bean"/>
		// ▶▶ property  ▶ 넘어오는 파라미터 명
		// ▶▶ name      ▶ 위에서 사용한 참조변수명
		//    자료형에 맞춰서 알아서 캐스팅 해준다.
		// String sub = request.getParameter("sub");
		// bean2.setSub(sub);
		
		
		// ----------------------------------------------------------------------------------
		
		// add 에서 파라미터받아서 사용
		
		// 받아와야 sql 문장을 수행하죠~ 그래서 get
		// 그래야 문장이 완성되죠~
		String sql = "insert into bbs06 values (bbs06_seq.nextval,'"+bean.getId()
		              + "' , sysdate,'" + bean.getSub() +"','"+ bean.getContent() +"')";

		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user="scott";
		String password="tiger";
		
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
		
		
		// ▶ 페이지 이동
		//   ./  ▶  현재경로에서 "index.jsp" 로 이동함
		//   아무것도 안적으면 index로 페이지 이동한다.
		//   현재경로니까 bbs폴더 안에 있는
		//   "index.jsp" 로 이동한다.
		response.sendRedirect("./");
	%>
</body>
</html>