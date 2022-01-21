<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   import="java.sql.*,  oracle.jdbc.driver.OracleDriver" %>
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
			<h1> 수정 페이지 </h1>
			
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
				String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				try{
					DriverManager.registerDriver(new OracleDriver());
					conn = DriverManager.getConnection(url);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
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
			
			<form action="update.jsp">
				<table border="1" align="center" width="80%">
					<tr>
						<td width="100">글번호</td>
						<!-- ★★★ 파라미터로 num을 전달하려고 하는데 사용자가 num을 변경할 수도 있어서 읽기전용으로 설정! -->
						<!-- input 타입으로 해야 파라미터 전달가능(입력할수있는 형식이어야함) | 코드 남기기 위해서임 -->
						<td><input type="text" name="num" value="<%= num %>" readonly ></td> <!-- readonly : 읽기전용!!!! -->
						<td width="100">날짜</td>
						<!-- ★★★ disabled="disabled" 읽기전용이긴 한데, 다만 파라미터 전달은 안된다. -->
						<td><input type="text" name="naljs" value="<%= nalja %>" disabled="disabled" ></td>					
					</tr>
					<tr>
						<td>제목</td>
						<td colspan="3">
							<input type="text" name="sub" value="<%= sub %>">
						</td>				
					</tr>
					<tr>
						<td colspan="4">
							<textarea name="content"><%= content %></textarea> <!-- textarea은 벨류가 없다. -->
						</td>		
					</tr>
					<tr>
						<td colspan="4">		
							<input type="submit" value="수 정">
							<input type="reset" value="취 소"> <!-- 여기서 리셋은 초기값 -> 이미 값이 있으니 비워지는게 아니라 초기값 나옴 -->
						</td>
					</tr>
				</table>
			</form>
			
			
			
			<!-- content end -->
			</td>
		</tr>
		<tr> <!-- 4 줄 -->
			<td colspan="6"><img src="imgs/img08.png"></td>  <!-- 밀리니까 -> 가로 6칸 다먹게 -->
	
		</tr>
	</table>
	
	
</body>
</html>