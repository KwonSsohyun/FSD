<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, java.sql.*, com.hi.bean.BbsBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 해당위치 에서는 한단계 위로 올라가서 가져온다. -->
	<!-- 콩콩찍어도 안되니까 템플릿에서 슬러시를 앞에 붙혀서 절대경로로 설정해준다. -->
	<%@ include file="../template/header.jspf" %>
	
	<%
		String key = request.getParameter("key");
		String word = request.getParameter("word");
		if(key==null) key="sub";
		if(word==null) word="";
	
	    // ▶ 외부 클래스파일 사용
	    //   왜? : <%! 선언해서 → 내부클래스를 하면 ⇒ 해당 jsp에서밖에 안됨
	    //   이를 극복하고자 
	    //   외부에서도 공유해서 쓰려고 외부클래스 jar로 만듬
	    //   만든 외부클래스 jar파일을 F:\webWork\Day036\WebContent\WEB-INF\lib ▶ "ojdbc14.jar" 만든 jar파일 넣어주면됨
	    //   jar 파일 가능해짐 ▶ 코드 쳐봐라, 빨간줄 안뜨면 사용가능해진 것임
	    //                       new com.hi.bean.BbsBean();
	    //                       new BbsBean();
		ArrayList<BbsBean> list = new ArrayList<BbsBean>();
		
		// 쿼리 문장
		// dep 받아온다. 답글 띄어쓰기
		String sql = "select num,sub,id,dep from bbs05 where "+key+" like '%"+word+"%' order by grp desc,ord asc"; /* like → % 와일드 모든것 키워드 찾아줌 */
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				BbsBean bean = new BbsBean();
				
				bean.num = rs.getInt(1);
				bean.sub = rs.getString(2);
				bean.id = rs.getString(3);
				bean.cnt = rs.getInt(4);
				
				list.add(bean);
			}
			
		} finally{
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		
		
	%>
	
	<h1>게시판 목록</h1>
	<table border="1" cellspacing="0" width="600">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>띄어쓰기-답글땜에</th>
		</tr>
		<%
		// ArrayList 사이즈만큼 돌리기
		for(int i=0; i<list.size(); i++){
			BbsBean bean = list.get(i);
		%>
			<tr>
				<!-- 어떤걸 눌러도 해당페이지로 넘어가야 하니까 detail.jsp?num=<%=bean.num %>" -->
				<td><a href="detail.jsp?num=<%=bean.num %>"><%=bean.num %></a></td> 
				<td><a href="detail.jsp?num=<%=bean.num %>"><%
				
					for(int j=0; j<bean.cnt; j++){
						out.print("&nbsp;&nbsp;&nbsp;&nbsp;");
					}
					if(bean.cnt!=0) out.print("└");
					out.print(bean.sub);
					
				%></a></td> <!-- &nbsp; 띄어쓰기 -->
				
				<td><a href="detail.jsp?num=<%=bean.num %>"><%=bean.id %></a></td>
				<td><a href="detail.jsp?num=<%=bean.num %>"><%=bean.cnt %></a></td>
			</tr>
		<%
		}
		%>
	</table>
	<br> 
	
	<!-- 해당게시글 찾기 -->
	<form action="list.jsp">
		<select name="key">
			<option value="sub">제목</option>
			<option value="id">글쓴이</option>
		</select>
		<input type="text" name="word">
		<input type="submit" value="검색">
	</form>
	
	<br>
	
	<!-- 입력버튼 -->
	<p align="center"><a href="add.jsp"><img src="https://dummyimage.com/100x50/aaa/fff.png&text=ADD"></a></p>
	
	<br><br>
	<%@ include file="../template/footer.jspf" %>
</body>
</html>