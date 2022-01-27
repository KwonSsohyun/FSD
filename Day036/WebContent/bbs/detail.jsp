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
	<%@include file="../template/header.jspf" %>
	<%@page import="java.sql.*, com.hi.bean.BbsBean" %>
	
	<%
		int num = Integer.parseInt(request.getParameter("num"));
	
		// 이게 있기 때문에 5개의 타입 맞는 변수를 따로 할 필요가 없어졌다.
		// 페이지에 보여주기 위한 객체임
		// javabean ▶ 객체로 하니까 동적할당의 자료구조 느낌으로 쓰고 있는것
		//            정보를 저장하기 위한 목적
		//            원래는 int cnt 이런것과 String msg 이렇게 타입을 일일히 다 선언해서 써야하는 불편함.
		//            그렇다고 배열을 쓰면 한 타입만 int만 써야하는데, 
		//            클래스를 이용해서 각각의 다른타입이 넣고 뺐을때 그대로 유지
		//            (나중엔 확장성으로 dto)
		BbsBean bean = new BbsBean();
		
		String sql = "select num,id,cnt,sub,content, grp, ord, dep from bbs05 where num="+num;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		int grp = 0;
		int ord = 0;
		int dep = 0;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			// 하나의 접속으로 두개의 문장 처리
			// stmt 객체 2개같은것임
			stmt.execute("update bbs05 set cnt=cnt+1 where num="+num); // 조회수 값 업데이트
			// 여기서  stmt 객체 닫고
			stmt.close();
			
			//----------------------------------------------------------------
			
			// 다른 하나의 쿼리문장 실행하기위해
			// stmt 다시 연결
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				bean.num=rs.getInt(1);
				bean.id=rs.getString(2);
				bean.cnt=rs.getInt(3);
				bean.sub=rs.getString(4);
				bean.content=rs.getString(5);
				grp = rs.getInt(6);
				ord = rs.getInt(7);
				dep = rs.getInt(8);
			}
			
			
			
		}finally{
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			
		}
	
	%>
	<h1>상세페이지</h1>
	<table border="1" cellspacing="0" width="600">
		<tr>
			<td width="80">글번호</td>
			<td width="80"><%=bean.num %></td>
			<td width="80">글쓴이</td>
			<td></td>
			<td width="80">조회수</td>
			<td width="80"><%=bean.cnt %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="5"><%=bean.sub %></td>
		</tr>
		<tr>
			<td colspan="6" height="300"><%=bean.content %></td>
		</tr>
		<tr>
			<td colspan="6" align="center">
				<a href="#"><img src="https://dummyimage.com/100x50/aaa/fff.png&text=EDIT"></a>
				<a href="#"><img src="https://dummyimage.com/100x50/aaa/fff.png&text=DEL"></a>
				<a href="re.jsp?grp=<%=grp %>&ord=<%=ord%>&dep=<%=dep%>"><img src="https://dummyimage.com/100x50/aaa/fff.png&text=COMMENT"></a> <!-- 답글기능 -->
				<!-- 가기전에 전달해줌 -->
				
				
				<!-- 기본테이블과 답글테이블 조인 : 2개 테이블 조인 -->
				<!-- 기본은 0, 글번호의 숫자의 max값의 +1 -->
				<!-- 표현을 위한 컬럼 필요 -->
				<!-- 뎁스 ▶ dep : 0 -->
				<!-- 순서 오더 ▶ ord  : 0 내림차순-->
				<!-- 그룹 ▶ grp : 번호 똑같이 (부모래퍼런스) 오름차순 --> 
				
				<!-- 정렬컬럼 새로 만듬 -> 정렬의 기준 메커니즘 새로 정의 -->
				<!-- 같은 번호의 정렬을 위해 컬럼 하나 더 씀 -->
				<!-- 같을 경우 별도 정렬 정의 -->
				<!-- 서브쿼리사용해서 cols1의 4번이 같으면 max(num)+1  숫자 배정 -->
				<!-- 답글의 답글은 있는것에서 max(num)을 업데이트해서 값 올리고, 추가된건 값 내리고, -->
				
				<!-- 내글은 항상 0, 다른것들은 +1씩 -> 답글은 무조건 업데이트하고, 그다음 내꺼 인서트 하겠다. -->
				<!-- 답글의 답글)  내가 1이되고, 나머지는 +1씩 -->
			</td>
		</tr>
	
	
	
	</table>
	
	
	
	<!-- ▶ 템플릿 파일 → 인쿠르드해서 가져옴 -->
	<%@include file="../template/footer.jspf" %>
</body>
</html>