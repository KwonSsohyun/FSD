
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>  <!-- import="java.sql.*, oracle.jdbc.driver.OracleDriver" -->

<%@ page import = "java.sql.*" %>
<%@ page import = "oracle.jdbc.driver.OracleDriver" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 기본으로 나오는 페이지는 디폴트가 뜨는 이름이 "index" -->
	
	<table align="center" width="1130"> <!-- 표 가운데 배치 -->
		<tr> <!-- 1 줄 -->
			<td colspan="6"><img src="imgs/img01.png"></td> <!-- 이미지 테이블에 붙히기 -->
			<!-- 밀리니까 -> 가로 6칸 다먹게 -->
		</tr>
		<tr> <!-- 2 줄 -->
			<td><img src="imgs/img02.png"></td>
			<!-- <td><img src="imgs/img04.png"></td> -->
			<td align="center" width = "184" background="imgs/img03.png"><a href="index.jsp">[ HOME ]</a></td> <!-- 이미지를 백그라운드로 깐다. -->
			<td align="center" width = "184" background="imgs/img04.png"><a href="intro.jsp">[ INTRO ]</a></td>
			<td align="center" width = "184" background="imgs/img05.png"><a href="list.jsp">[ B B S ]</a></td>
			<td align="center" width = "184" background="imgs/img06.png"><a href="guest.jsp">[ GUEST ]</a></td>
			<td><img src="imgs/img02.png"></td>

		</tr>
		<tr> <!-- 3 줄 -->
			<td colspan="6"> <!-- 본문 내용넣을거니까 -> 가로 6칸 다먹게 -->
			<!-- content start ---------------------------------------------------------------------------->
			<h1> 게시판 페이지 </h1>
			<!-- 테이블 안에 예쁘게 정보 출력 -->
			<table border="1" width="80%" align=center>
				<tr>
					<th width ="100">글번호</th> <!-- 제목은 th -->
					<th>제목</th> 
					<th width="150">날짜</th> 
				</tr>
				
				<% // 스크립트 릿 ▶ 자바소스 코드 작성 
				    
				   // 수행할 쿼리문장
				   String sql = "select num, sub, nalja from bbs01 order by num desc";
				   // 데이터베이스 접속주소
				   String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
				   
				   // 이제 로딩해서 쓰면됨
				   // 임포트 시킴 명세 귀찮으니까 (맨위)
				   // <%@  ▶  디렉티브! 
				   //         페이지 디렉티브는 문서의 정의
				   //         자바에서  클래스 밖에 있는 import 정의 해주는 느낌이다.
				
				   
				   Connection conn = null;
				   Statement stmt =null;
				   ResultSet rs = null;
				   
				   try{ // finally → close() 닫으려고 씀.
				       // 드라이버 주입
					   DriverManager.registerDriver(new OracleDriver());
					   conn = DriverManager.getConnection(url);
					   stmt = conn.createStatement();
					   rs = stmt.executeQuery(sql);
					   
					   while(rs.next()){ // 값 있으면, 반복문 실행
				%>
				
					<!-- 데이터베이스 내용 반복하면됨 -->
					<!-- 자바 소스코드 while문 돌음! 값이 있으면 while문 계속 돈다! -->
					<tr>
						<td><% out.print(rs.getObject(1)); %></td> <!-- 화면 출력 -->
						<!-- http://localhost:8080/Day032/detail.jsp?num=1 ▶ 이렇게 뒤에 해당순번이 num=숫자가 붙어서 페이지 이동함 -->
					    <td><a href="detail.jsp?num=<% out.print(rs.getObject(1)); %>"> <% out.print(rs.getObject(2)); %> </a></td>
					    <td><% out.print(rs.getObject(3)); %></td>
					</tr>	
				    <!-- 데이터베이스 내용 반복하면됨 -->
			    
			    <% // 자바소스 코드 작성
						}
					   
				    } finally { /* 클로즈 닫아주기 */
				    	if(rs!=null) rs.close();
				    	if(stmt!=null) stmt.close();
				    	if(conn!=null) conn.close();
				    }
				%>
			
			</table>
			<p align="center">
				<a href="add.jsp"> [ 입력 ] </a>
			</p>
			
			
			<!-- content end ------------------------------------------------------------------------------>
			</td>
		</tr>
		<tr> <!-- 4 줄 -->
			<td colspan="6"><img src="imgs/img08.png"></td>  <!-- 밀리니까 -> 가로 6칸 다먹게 -->
	
		</tr>
	</table>
	
	
</body>
</html>