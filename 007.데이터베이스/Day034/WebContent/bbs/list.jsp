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
				<h1>게시판 목록</h1>
				<table border="1" width="80%" align="center" cellspacing="0">
					<tr>
						<th width="80">글번호</th>
						<th>제목</th>
						<th width="100">글쓴이</th>
						<th width="80">조회수</th>
					</tr>
					<%@ page import="java.sql.*" %>
					<%
					    String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
						String sql = "select num,sub,id,cnt from bbs03 order by num desc";
						
						Connection conn = null;
						Statement stmt = null;
						ResultSet rs = null;
						
						try{
							// ▶ 자바 리플렉션
							// 자바의 코드를 프로그램적으로 제어
							// Class clss = Class.forName("oracle.jdbc.driver.OracleDriver"); -> 클래스의 정보를 넣어주면 클래스클래스를 만들어준다.
							// oracle.jdbc.driver.OracleDriver driver = null;
							// driver = (oracle.jdbc.driver.OracleDriver)clss.newInstance();
							// DriverManager.registerDriver(driver);
							
							// DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
							// conn = DriverManager.getConnection(url);
							// stmt = conn.createStatement();
							// rs = stmt.executeQuery(sql);
							
							Class.forName("oracle.jdbc.driver.OracleDriver");
							conn = DriverManager.getConnection(url);
							stmt = conn.createStatement();
							rs = stmt.executeQuery(sql);
				
							
							while(rs.next()){
					%>		
								<tr>
									<td><%=rs.getInt(1) %></td>
									<td><a href="detail.jsp?num=<%=rs.getInt(1) %>"><%  // 제목누르면 해당 유저의 디테일 페이지로 이동
										
										String sub = rs.getString(2);
									
									    // null 이면 ▶  "제목없음" → 대체문구 뽑기
										if(sub==null) sub = "제목없음";
										
										// 제목 ▶ 5글자 이상이면 ... 표시
										if(sub.length()>5){
											sub = sub.substring(0,5) + "...";	
										}
										
										out.print(sub);
									%></a></td>
									<td><%=rs.getString(3) %></td>
									<td><%=rs.getInt(4) %></td>
								</tr>
			
					<% 
							}
						} finally{
							if(rs!=null) rs.close();
							if(stmt!=null) stmt.close();
							if(conn!=null) conn.close();
						}
					%>		
						
				</table>
				<p align="center"><a href="add.jsp">[입 력]</a></p>
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