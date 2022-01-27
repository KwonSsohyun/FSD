<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<%! // 필드, 메서드, 생성자, 내부클래스
		
		// 객체 사용
		class Bean{
			// 글번호
			int num;
			// 글제목, 글쓴이
			String sub, name; 
			// 날짜
			java.sql.Date nalja;
		}
	%>


	<%
	
		String param1 = request.getParameter("page"); // 페이지 내장객체라 변수명으로 쓰면 안됨. 단, 넘어가는 파라미터는 가능	
		if(param1 == null) param1="1";  // 주소표시줄에 아무런 값없을땐 1page
		int p = Integer.parseInt(param1);
		// 1p -> 01  로부터 +9 하면됨 -> 1+10*0 -> 1+10*(1-1)
		// 2p -> 11                   -> 1+10*1 -> 1+10*(2-1)
		// 3p -> 21                   -> 1+10*2 -> 1+10*(3-1) 
		// 4p -> 31                   -> 1+10*3 -> 1+10*(4-1)
		
		int row = 10; // 한페이지에 보여주고 싶은 갯수만큼 입력하면 바뀜
		
		int pstart = 1+row*(p-1);
		int pend = pstart+(row-1); // 한페이지에 10개씩 노출할거라서
		int tot = 0;
		
		
		// 동적자료구조 만든다.
		ArrayList<Bean> list = new ArrayList<Bean>(); // Bean이 들어있음  // 추론타입<>

		// 쿼리
		// 10개씩만 보이게 하기 →  where num between 91 and 100
		// select rownum, deptno, dname from dept;  -> 임시번호 부여해줌 (1부터 순차적 임의 부여)
		// select rownum, deptno, dname from dept where rownum between 1 and 2;
		// select rownum, deptno, dname from dept where rownum between 3 and 4;  -> 앞에 호출안하려면 별칭부여
		// -> select * from (select rownum as rn, deptno, dname, from dept) where rn between 3 and 4;
		// String sql2 = "select * from (select rownum,num,sub from bbs04 order by num desc)"; // 100부터 됨
		
		
		//String sql = "select num,sub,name,nalja from bbs04 where num between 91 and 100 order by num desc";
		//String sql3 = "select rownum,num,sub from (select * from bbs04 order by num desc)";
		String sql = "select * from (select rownum as rn,num,sub,name,nalja,(select count(*) from bbs04) from (select * from bbs04 order by num desc)) where rn between "+pstart+" and "+pend;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "scott";
		String password = "tiger";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
			   
				while(rs.next()){
					Bean bean = new Bean();
					bean.num = rs.getInt(2);
					bean.sub = rs.getString(3);
					bean.name = rs.getString(4);
					bean.nalja = rs.getDate(5);
					tot = rs.getInt(6); // 매번 숫자 받음 
					list.add(bean);
				}
			
		} finally{
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		
		
	//	try(    // close() 자동으로 제공해줌 (1.8부터 지원) (괄호)
				// 선언도 안에서
		//		Connection conn = DriverManager.getConnection(url, user, password);
		//		Statement stmt = conn.createStatement();
		//		ResultSet rs = stmt.executeQuery(sql);
				// 클로즈 대상만 괄호 안 -> .AutoCloseable 상속받아서임 
		//	    ){ 
	%>


	<h1>게시판</h1>
	
	<table border="1" width="80%" align="center">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>
		<%
			// 어레이리스트에서 끄내와서 반복 	ArrayList<Bean> list = new ArrayList<Bean>();
			for(int i=0; i<list.size(); i++){
				Bean bean = list.get(i);
		%>
				<tr>
					<td><%=bean.num %></td>
					<td><%=bean.sub %></td>
					<td><%=bean.name %></td>
					<td><%=bean.nalja %></td>
				</tr>
		<%
			}
		
		
		%>
	
	</table>
	<p align="center">
	<%
		// 전체 레코드 갯수 알아야 측정가능 -> cnt -> 그룹함수 -> 별도의 쿼리문장 써야함 2번날려야함
		// 십의 자리 -> 한페이지에 10개라서
		//             
		// 00 ~ 10  -> 1  -> (00~10)-1  0  >> 10-1 = 9 -> 십의 자리 0  >> 십의 자리에다가 +1  
		// 11 ~ 20  -> 2  -> (11~20)-1  1  > 20-1 = 19 -> 십의 자리 1
		// 21 ~ 30  -> 3  -> (21~30)-1  2  > 30-1 = 29 -> 십의 자리 2
		
		// 90    -> 9
		// ...
		// 99    -> 10
		// 100   -> 10  // 100개가 있으니 10이된거 /// 어떻게 자동화 할것이냐
		// 101	 -> 11
	
	
		for(int i=1; i<=(tot-1)/row+1; i++){
	%>
			    <!-- 페이지 넘어갈 수 있게함 -->
				<a href ="index.jsp?page=<%=i%>"> [<%=i%>] </a>
				<!-- <a href ="index.jsp?page=2"> [2] </a> -->
				<!-- <a href ="index.jsp?page=3"> [3] </a> -->
			
	<%
		}
	%>
	</p>
</body>
</html>