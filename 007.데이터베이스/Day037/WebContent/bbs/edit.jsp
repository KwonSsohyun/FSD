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
	
	<%@ page import="java.sql.*" %>
	
	<!-- ▶ 객체를 찍어내는 것 -->
	<jsp:useBean id="bean" class="com.hi.bean.BbsBean"></jsp:useBean>
	
	<!-- ▶ 파라미터 받아와서 객체에 담는다. -->
	<!--   : property로 파라미터 값을 받아오고, name="bean"객체를 참조변수로 가르켜서 
	         그 객체 안에 있는 같은 이름의 변수 num에 파라미터 값을 넣어준다.    -->
	<!--     ▶▶ num이라는 이름이 클래스에 정의한 이름이랑 
	            넘겨주는 파라미터 이름과 
	            여기서의  property 이름이 다 같아야한다!!!                       -->
	<jsp:setProperty property="num" name="bean"/>
	
	
	<%
		String sql = "select * from bbs06 where num="+bean.getNum();
	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String username="scott";
		String password="tiger";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){ // ▶ 여기서 값 주입했으니까, 아래서 값을 get해서 쓸 수 있는 것
				bean.setSub(rs.getString("sub"));
				bean.setId(rs.getString("id"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
	
			}
			
		} finally {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
	
	%>
	
	<h1>수정 페이지</h1>
	
	<form action="update.jsp" method="post">
		<table border="1" cellspacing="0" width="600" align="center">
			<tr>
				<td colspan="4">
					<jsp:getProperty property="num" name="bean"/> <!-- 화면에 보이기 위해서 -->
						<input type="hidden" name="num" value="<%=bean.getNum()%>"> <!-- (숨겨서 전달) 파라미터 전달위해서 -->
				</td>
			</tr>
			<tr>
				<td width="100">글쓴이</td>
				<td>
					<jsp:getProperty property="id" name="bean"/>
				</td>
				<td width="100">날짜</td>
				<td>
					<jsp:getProperty property="nalja" name="bean"/>
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan="3">
					<!-- 수정가능하게 바꿔준다. -->
					<input type="text" name="sub" value="<%=bean.getSub() %>">
					<%-- <jsp:getProperty property="sub" name="bean"/> --%>
				</td>
			</tr>
			<tr>
				<td colspan="4">
				    <!-- 수정가능하게 바꿔준다. -->
				    <%-- textarea 공백있으면 내용으로 인식함 --%>
				    <textarea rows="6" cols="40" name="content"><jsp:getProperty property="content" name="bean"/> 
				    </textarea>		
				    <!-- <jsp:getProperty property="content" name="bean"/>  -->		
				    <!--  ▶ get받아오는것 
				            : bean이라는 객체 중에 content 필드명에 있는 값을 가져온다. 
				    -->	
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" value="수 정">
				</td>
			</tr>
		
		</table>
	</form>
	
	
	<%@ include file="../template/footer.jspf" %>	
</body>
</html>