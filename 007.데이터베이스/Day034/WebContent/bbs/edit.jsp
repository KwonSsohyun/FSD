<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="800" align="center" cellspacing="0"> <!-- cellspacing="0" ▶ 간격 안붙게 이미지 다 붙힘 -->
		<tr> <!--************************************* 상단 *************************************-->
			<td colspan="5">
				<img alt="logo" src="../imgs/logo.png"> <!-- ../ -> 한뎁스 올라가서 찾음 -->
			</td>
		</tr>
		<tr> <!--************************** GNB (Global Navigation Bar) **************************-->
			<td background="../imgs/bg.png"></td> <!-- ../ → 한번 올라가서 이미지를 찾겠다. -->
			<td background="../imgs/bg.png" align="center" width="100"><a href="../index.jsp">[ HOME ]</a></td> <!-- ../ -> 한뎁스 올라가서 찾음 -->
			<td background="../imgs/bg.png" align="center" width="100"><a href="./list.jsp">[ BBS ]</a></td> <!-- ▶ bbs라는 폴더 안에 들어가서 할거임(한뎁스내려감) --> <!-- ./ 현재 디렉토리에서 찾음 -->
			<td background="../imgs/bg.png" align="center" width="100"><a href="../login/form.jsp">[ LOGIN ]</a></td>
			<td background="../imgs/bg.png"></td>
		</tr>
		<tr> <!--************************************* 내용 *************************************-->
			<td colspan="5" align="center">
				<%@ page import="java.sql.*" %>
				<%
					// 파라미터 전달받음
					String param = request.getParameter("num");
					int num = Integer.parseInt(param);
				
					Date nalja = null;
					String sub = null;
					String content = null;
					String id = null;
					int cnt = 0;
				
					String sql = "select num, nalja, sub, content, id, cnt from bbs03 where num="+num;
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "scott";
					String password = "tiger";
					
					Connection conn = null;
					Statement stmt = null;
					ResultSet rs = null;
					
					try{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn = DriverManager.getConnection(url, user, password);
						stmt = conn.createStatement();
						rs = stmt.executeQuery(sql);
						
						if(rs.next()){
							num = rs.getInt(1);
							nalja = rs.getDate(2);
							sub = rs.getString(3);
							content = rs.getString(4);
							id = rs.getString(5);
							cnt = rs.getInt(6);
						}
						
					}finally{
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					}
				
				
				%>
				<h1>수정 게시글 ( <%=num %>번 글 ) </h1>
				<form action="update.jsp" method="post">
					<table border="1" width="80%" cellspacing="0">
						<tr>
							<td width="100">글번호</td> 
							<td><input type="text" name="num" value="<%=num %>" readonly="readonly"></td>  <!-- ▶ readonly ▶ 값 넘어가고, 수정안되게 -->
							<td width="100">날짜</td>   
							<td><input type="text" name="nalja" value="<%=nalja %>" disabled="disabled"></td>  <!-- ▶ disabled ▶ 값 안 넘어가고, 수정안되게 -->
						</tr>
						<tr>
							<td>작성자</td>
							<td><input type="text" name="id" value="<%=id %>" disabled="disabled"></td>
							<td>조회수</td>
							<td><input type="text" name="cnt" value="<%=cnt %>" disabled="disabled"></td>
						</tr>
						<tr>
							<td>제목</td>
							<td colspan="3"><input type="text" name="sub" value="<%=sub %>"></td>
						</tr>
						<tr>
							<td colspan="4"><textarea name="content"><%=content %></textarea></td>
						</tr>
						<tr>
							<td colspan="4" align="center">
								<input type="submit" value="[ 수 정 ]">
								<input type="reset" value="[ 취 소 ]">
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
		<tr> <!--************************************* 푸터 *************************************-->
			<td colspan="5" align="center">
				<img alt="footer" src="../imgs/footer.png"> <!-- ../ → 한번 올라가서 이미지를 찾겠다. -->
			</td>
		</tr>
		
	</table>
</body>
</html>