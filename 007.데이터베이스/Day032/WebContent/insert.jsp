<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.sql.*, oracle.jdbc.driver.OracleDriver"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 엔코딩방식 어떤 방식으로 읽어드린것인가. -->
<!-- 브라우저에게 전달하는 정보 -> meta -->
<!-- 이 기능은 브라우저가 지원해주는 기능 -->
<!-- 나 html이고 엔코딩 UTF-8 -->
<!-- 나는 여기서 어떤 페이지로 이동해줘 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="0; url=http://localhost:8080/Day032/list.jsp" > <!-- 0초뒤에 해당 페이지로 이동해라 -->
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
			
			<%
				// 넘어온값 쿼리문장으로 쓰기
				String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
				String sub = request.getParameter("sub");
				String content = request.getParameter("content");
				String sql = "select max(num)+1 from bbs01";
				// String sql2 = "insert into bbs01 values (0, '"+ sub +"',sysdate,'"+content+"')";
			
				// 선언부
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				try{
					DriverManager.registerDriver(new OracleDriver());
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					
					rs = stmt.executeQuery(sql);
					rs.next();
					int nextval = rs.getInt(1); // 숫자 받음
					
					if(rs!=null) rs.close(); 
					if(stmt!=null) stmt.close();
					if(conn!=null) conn.close(); // 커넥션 발생할때마다 닫아줘야 한다.
					// 디도스 공격이라 생각해서 
					// 오라클데이터베이스 자체를 쓸 수 없게된다. 
					// 오라클에서 계정 막아버림
					
					
					// 숫자 받아서 씀 (해당 순번필요)
					String sql2 = "insert into bbs01 values ("+nextval+", '"+ sub +"',sysdate,'"+content+"')";
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					int result = stmt.executeUpdate(sql2); // 업데이트! > executeUpdate는 int *를 리턴함 (*행 등록함!)
					if(result>0) { out.println("<h1> 입력 성공 </h1>"); }
					else { out.println("<h1> 입력 실패 </h1>"); }
					
				} finally{ // 여기서 또하는 이유는 sql이 아닌 sql2인 새로운 커넥션이기 때문!
					// if(rs!=null) rs.close();  -- 업데이트 할때는 rs안함 ▶ 왜? 업데이트를 하는데 왜 자료구조를 씀 ㅋㅋ
					if(stmt!=null) stmt.close();
					if(conn!=null) conn.close();
				}
	
			%>
			
			
			
			<!-- content end -->
			</td>
		</tr>
		<tr> <!-- 4 줄 -->
			<td colspan="6"><img src="imgs/img08.png"></td>  <!-- 밀리니까 -> 가로 6칸 다먹게 -->
	
		</tr>
	</table>
	
	
</body>
</html>