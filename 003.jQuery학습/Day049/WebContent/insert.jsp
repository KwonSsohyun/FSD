<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	// ★ index.jsp에서 사용자가 팝업창 인풋창에 입력한 값
	//   데이터베이스에 추가 하기
	
    // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	// ▶ 한글도 잘 읽힐 수 있게 한다.
	request.setCharacterEncoding("utf-8");
	

	// ▶ 파라미터 받는것 (index.jsp에서 받아온다.)
	//   request.getParameter()
	//   ▶ deptno : 파라미터 이름  →  index.jsp  html에서 name으로 정함 (name="deptno")
	//     dname
	//     loc
	
	//   ▶ 문자열로 받아오니까, 내가 사용하고자 하는 타입으로 받는다.
	//     문자를 숫자로 받을거면 형변환 한다. Integer.parseInt(숫자로써야함)
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	
	// ▶ 콘솔에 잘찍히는지 확인함
	//   index.jsp에서 파라미터 전달해준사항
	//   insert.jsp에서 잘 받아졌나 확인
	System.out.println(deptno + dname + loc);
	
	
	// -----------------------------------------------------------------------------------
	
	
	// ▶ 쿼리문장
	//   → 사용자가 인풋창에 입력한 값을 
	//     데이터베이스에 추가해 넣어야 한다. (insert 문 사용)
	//     dept테이블에 넣을 것이다.
	//     + 한 행을 추가하는 것
	//       PreparedStatement 을 쓰기에 ?를 쓸 수 있다.
	//       넣을 값을 물음표로 표기할 수 있다.
	String sql = "insert into dept values (?,?,?)";
	
	
	// ▶ 데이터베이스 연결
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	Class.forName(driver);
	
	try{
		   conn = DriverManager.getConnection(url,user,password);
		   
		   // ▶ 쿼리문장 먼저 보냄
		   pstmt = conn.prepareStatement(sql);
		   
		   // ▶ 벨류값 따로 보냄
		   //   파라미터 받은것을 쿼리문 물음표에 넣는다.
		   //   인덱스 번호에 맞게 (데이터베이스는 인덱스 1번부터시작) 
		   //   쿼리문에 물음표를 대체한다.
		   //   조합은 데이터베이스에서 알아서 한다. 
		   // ▶ 자료형에 맞게 set뒤에 붙혀준다.
		   pstmt.setInt(1, deptno);
		   pstmt.setString(2, dname);
		   pstmt.setString(3, loc);
		   
		   // ▶ 데이터베이스에 넣는다.
		   pstmt.executeUpdate();
		
	}finally{
		   if(conn!=null)conn.close();   
	}
	
%>

</body>
</html>