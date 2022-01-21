<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.sql.*,  oracle.jdbc.driver.OracleDriver" %> 
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
			<!-- content start -->
			<h1> 상세 페이지 </h1>
			
			<%
			    // 사용자가 선택한 넘버 받아오기
			    // 이게 있기때문에 >> ?num=2  주소 뒤에 붙이면 되는것임
				String num = request.getParameter("num"); 
			    // 쿼리문장에 추가함
				String sql = "select num,sub,nalja,content from bbs01 where num="+num;
				
			    String nalja = null;
			    String sub = null;
			    String content = null;
							
				// 데이터베이스 접속 
				// (위에서 import 해줌) import="java.sql.*,  oracle.jdbc.driver.OracleDriver" //
				String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe"; // 계정정보
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				try{
					DriverManager.registerDriver(new OracleDriver()); // 자바가 db를 사용할 수 있도록
					conn = DriverManager.getConnection(url); // 자바랑 db연결됨 - 계정정보로 로그인함
					stmt = conn.createStatement(); // DB정보를 쓸수있게
					rs = stmt.executeQuery(sql); // 쿼리명령어의 결과값을 rs를 여기에 담는다. 
					
					if(rs.next()){
						num = rs.getString(1); // 데이터형식을 스트링으로 했기 때문
						sub = rs.getString(2);
						nalja = rs.getString(3);
						content = rs.getString(4); // 문자열로 받으면 시간까지 나옴
					}
					
					
				} catch(SQLException ex){ // 캣치를 안하면 ?num= 숫자안주면 오류가 떨어지니까 이런 사항에 처리를 위해서
					out.print("올바른 연결이 아닙니다.");
				
				} finally{
					if(rs!=null)   { rs.close(); }
					if(stmt!=null) { stmt.close(); }
					if(conn!=null) { conn.close(); }
				}
				
			%> <!-- 자바 문법 끝 -->
			
			
			<table border="1" align="center" width="80%">
				<tr>
					<td width="100">글번호</td>
					<td> <%= num %> </td> <!-- "표현식" ▶ 간편(끝에 세미콜론 안들어감) -->
					<!-- out.print(num); ▶ 여기서 (num) 의 내용을 적는것인데 당연히 괄호안에 ; 세미콜론 붙히면 안되죠~ -->
					<td width="100">날짜</td>
					<td> <%= nalja %> </td>
				</tr>
				<tr>
					<td>제목</td>
					<td colspan="3"> <%= sub %> </td>
				</tr>
				<tr>
					<td colspan="4"><%= content  %></td>
				</tr>
				<tr>
					<td colspan="4">
						<!-- 파라미터값 전달 -->
						<!-- http://localhost:8080/Day032/detail.jsp?num=1 -->
						<a href="edit.jsp?num=<%=num %>">수정</a>  
						<a href="delete.jsp?num=<%=num %>">삭제</a> <!-- http://localhost:8080/Day032/delete.jsp?num=1 -->
						
				    </td>
				</tr>
			
			</table>
			
			
			
			<!-- content end -->
			</td>
		</tr>
		<tr> <!-- 4 줄 -->
			<td colspan="6"><img src="imgs/img08.png"></td>  <!-- 밀리니까 -> 가로 6칸 다먹게 -->
	
		</tr>
	</table>
	
	
</body>
</html>