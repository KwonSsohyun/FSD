<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 리스트페이지로 바로 넘어감 : 쿼리문장만 실행하고 리스트페이지 이동 -->
	<%
	    /* post 방식 */
	    // post 방식의 한글깨짐 처리 - 매 코드마다 반복적으로 수행해야함
	    // 파라미터값 피싱 전에 수행되어야함
	    /* 한글은 자바쪽에서 제어해줘야함 → 파라미터로 받아지기 전에 엔코딩해줘야 한다! */
	    /* GET처럼 주소로 넘어가는게 아니니까. */
	    request.setCharacterEncoding("utf-8");
	
	    // << 자바에서 벨류데이션 체크 >>
	    //    : id 작성자 null 안뜨게 not null 걸기
		String sub = request.getParameter("sub");
		String id = request.getParameter("id");
		String content = request.getParameter("content");
	
		String method = request.getMethod();
		String path = "add.jsp";
		
		// ▶ 자바에서 벨류데이션 체크
		//   : 제목입력 안하면 null -> 제목없음으로 데이터베이스에 집어넣기
		//     들어올때 null이면, 변수에 담고 -> sql문장에 변수로 전달!
		if(sub.isEmpty()) sub = "제목없음";
		else{
			// ▶▶ 인젝션 공격 패턴 (검색해서 막는다.)
			//    : 공격패턴 회피!
			//      주석이나 '' ,  등등 막기
			//      비번 특수문자 정해져있는 것 (비번은 진짜 그값이어야하니 비슷한거 교체 안됨)
			//      보여지는 게시글은 비슷한걸로 바꿔도 된다.
			sub = sub.replace('-','－'); // 사용자가 진짜 필요할 수 있으니 ▶ 'ㄷ + 한자키'로 바꾼다.  
			sub = sub.replace(',','‚');  // '윈도우 + .' ▶ 오메가 눌러서 → 비슷한 문자끼리 바꿔치기
			
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "insert into bbs03(num, sub, id, content) values(bbs03_seq.nextval,'"+sub+"','"+id+"','"+content+"')";
		
		Connection conn = null;
		Statement stmt = null;
		
		
		if(!(id.isEmpty()) && method.equals("POST")){ // POST 방식일때만 입력되게한다.
			try{ 
				// 데이터베이스에 문제없으면, 
				// >> finally 실행 후 >> 다음 문장인 56번으로 이동 >> path = "list.jsp"; >> 63번도 실행
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, "scott", "tiger");
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				
			} catch(SQLException e){
				// try에 문제 있으면, catch문 들어오고, 데이터베이스에 문제가 생기면, 들어오고,
				// >> finally 실행 후 >> 다음 문장인 56번으로 이동 >> path = "list.jsp"; >> 63번도 실행
			} finally { // 문제가 있건 없건 실행 
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}
		
		    // null값 없이 정상수행시 리스트 페이지 돌아가기
			path = "list.jsp";
			
		} 
			
	
		
		/* null값이면 add.page 가기 */
		response.sendRedirect(path);
	
	
	%>
</body>
</html>