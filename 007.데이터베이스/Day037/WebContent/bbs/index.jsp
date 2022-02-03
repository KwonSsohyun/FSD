<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ▶ 템플릿 파일 → 인쿠르드해서 가져옴 -->
	<%@ include file="../template/header.jspf" %>
	<%@ page import="java.sql.* , java.util.ArrayList, com.hi.bean.BbsBean" %>
	
	<%
		// 데이터베이스 연동해서 값 뿌리기
		ArrayList<BbsBean> list = new ArrayList<BbsBean>();
	    
		String sql = "select num,sub,id,nalja from bbs06 order by num desc";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				// 이안에서 한 싸이클 이니까 이 와일안에서만 bean 변수명
				BbsBean bean = new BbsBean();
	
				// 접근제한자가 있기 때문에,
				// 클래스 파일에 설정해놓은 우린 값을 셋팅 넣는거니까
				// 클래스에 정의해놓은 
				// ▶ set해당메서드명(값셋팅) → 해서 값을 넣어준다.
				bean.setNum(rs.getInt(1));
				bean.setSub(rs.getString(2));
				bean.setId(rs.getString(3));
				bean.setNalja(rs.getDate(4));
						
				list.add(bean);
			}
			
			
		} finally {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
				
	    
		// -------------------------------------------------------------------------------
		// new com.hi.bean.BbsBean();
		// BbsBean bean = new BbsBean();
		
		// ▶ public 접근제한자는 그냥 됨
		//   bean.id="aaaa";
		//   bean.num=1111;
		
		// ▶ 접근제한자 디폴트는 동일패키지 안에서만 접근가능
		//   bean.sub="bbbb";  → 이건 안됨
		// ▶ 2가지 가능
		//   ① 값만 가져오는거라면, 기능을 부여해서 메서드 호출해서 쓴다.
		//   ② 값을 설정하는것이라면, → 설정한 메서드괄호안에 값 넣어서 값 설정한다.
		//   bean.setSub("bbbb");
		// -------------------------------------------------------------------------------		
		
	%>
	
	<h1>게시판 목록</h1>
	<table border="1" align="center" width="600" cellspacing="0">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>
		<%
		// 기존 루프문
		// ▶ for(int i=0; i<list.size(); i++){
			  // 아까 값넣었던 while문에서 쓴 bean변수명은 그 안에서만
			  // 라이프사이클이 존재하니
			  // 여기서 같은 변수명 또 써도 되는것
			  // BbsBean A = list.get(i);
			  // 이렇게 다른것임
			  // 같은 데이터 타입 형 이라서 BbsBean 쓴것
			
			  // ▶ BbsBean bean = list.get(i);
		
			  
		  // ▶▶ 개선된 루프문(jdk 1.7)	
		  //    : 함수용 언어를 본따서 만듬
		  // 자료구조만 된다. 그중 이터레이터되는 것만 된다. (Map 안된다.)
		  // for(자료형 한 단계 아래의 자료형의 변수명 : 배열명){ /// }
		  for(BbsBean bean : list){  // list 인덱스 -> 순서대로 끄집어낸다.	
			                         // BbsBean bean 은 데이터 타입과 변수
		%>
				<tr>
				    <!-- 접근제한자가 있기 때문에,
						 클래스 파일에 설정해놓은 우린 값을 가져오는것이니
						 클래스에 정의해놓은 
						 ▶ get해당메서드명(값셋팅) → 해서 값을 가져온다. -->
					<th><a href="detail.jsp?num=<%=bean.getNum() %>" ><%=bean.getNum() %></a></th>
					<th><a href="detail.jsp?num=<%=bean.getNum() %>" ><%=bean.getSub() %></a></th>
					<th><a href="detail.jsp?num=<%=bean.getNum() %>" ><%=bean.getId() %></a></th>
					<th><a href="detail.jsp?num=<%=bean.getNum() %>" ><%=bean.getNalja() %></a></th>
				</tr>
		<%
		}
		
		
		%>
	</table>
	
	<p>
		<a href="add.jsp">[ 입력 ]</a>
	</p>
	
	<!-- ▶ 템플릿 파일 → 인쿠르드해서 가져옴 -->
	<%@ include file="../template/footer.jspf" %>
	
</body>
</html>