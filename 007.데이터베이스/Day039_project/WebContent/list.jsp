<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "java.sql.*, java.util.ArrayList, com.hi.bean.StuBean" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생성적관리사이트(ver 0.10.0)</title>
		<!-- 폰트 : HTML -->
		<link href="https://fonts.googleapis.com/css?family=Black+Han+Sans:400" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Gothic+A1:100,400" rel="stylesheet">
		<!-- CSS 영역 *********************************************** -->
		<style rel="stylesheet" type="text/css">
		    /* 전체 디폴트 설정 ***********************************/
			*{
				margin: 0px;
				padding: 0px;
			}
		    /* 헤드 영역 ******************************************/
			#header>h1{
				margin: 50px 50px; 
				text-indent: -999px;
				background-image: url("./imgs/logo.jpg");
				background-repeat: no-repeat;
				/* background-color: red; */
			}
			/* 메뉴 영역 *******************************************/
			#menu>ul{
				list-style: none;
				padding: 0px;
				width: 640px;
				margin: 0 auto;
			}
			#menu>ul>li{
				background-color: blue;
				float: left; 
				margin: 0 5px;
				
			}
			#menu>ul>li>a{
				display: block;
				width: 150px;
				height: 50px;
				color: white;
				text-decoration: none;
				text-align: center;
				line-height: 50px;
				text-transform: uppercase;
				font-size: 24px;
				/* background-color: gray; */
				
			}
			
			#menu>ul>li>a:visited, #menu>ul>li>a:link{
				background-color: #D8464A;
			}
			#menu>ul>li>a:hover, #menu>ul>li>a:active{
				background-color: #7334D9;
			}
			/* 컨텐츠 영역 (본문) ************************************/
			#content {
				clear: both;
				/* height: 600px; */
				/* line-height: 600px; */
				text-align: center;
				background-color: #EBEBEB;
				padding: 50px 0px;

			}
			#content>table{
				width: 800px;
				border-collapse: collapse;
				margin: 0 auto;
			}
			table, th, td{
				border: 1px solid black;
			
			}
			
			table thead{
				background-color: #6834C2;
				color: white;
				line-height: 50px;
			}
			table tbody{
				line-height: 30px;
			}
			
			thead>tr>th:nth-child(6n){
				background-color: #B64A2E;
			}
			tbody>tr>td:nth-child(6n){
			 	background-color: #D24F2E;
			 	color: white;
			}
			

			
			
		    /* 하단 영역 (푸터) ***************************************/
		    #footer {
		    	background-color: #1C1C1C;
		    	height: 70px;
		    	line-height: 70px;
		    	color: #A1A1A1;
		    	text-align: center;
		    	padding: 20px 0px;
		    }
		   	#footer>p{
		   		font-size: 15px;
		   		font-family: "Black Han Sans", serif;
		   	}
		    
		    
		
		</style>
		<!-- ******************************************************** -->
	</head>
	<body>
		<!---------------------------------------------------->
		<div id="header">
			<h1>하이미디어</h1>
		</div>
		<!---------------------------------------------------->
		<div id="menu">
			<ul>
				<li><a href="index.jsp">home</a></li>
				<li><a href="list.jsp">목록</a></li>
				<li><a href="add.jsp">등록</a></li>
				<li><a href="edit.jsp">수정</a></li>
			</ul>
		
		</div>
		<!---------------------------------------------------->
		<div id="content">
			<table>
				<thead>
					<tr>
						<th>학번</th>
						<th>이름</th>
						<th>국어</th>
						<th>영어</th>
						<th>수학</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
				<!-- 자바코드 -->
				<% // 스크립트 릿 ▶ 자바소스 코드 작성 
				
					// 데이터베이스 연동해서 값 뿌리기
					ArrayList<StuBean> list = new ArrayList<StuBean>();
				
					// 수행할 쿼리문장
					String sql = "select num, name, kor, eng, math from bbs07 order by num desc";
				
					String driver = "oracle.jdbc.driver.OracleDriver";
					// 데이터베이스 접속주소
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
							StuBean stu = new StuBean();
							
							// 해당 클래스에 접근제한자가 있기때문에
							// set해당메서드명(값셋팅) -> 해서 값을 넣어준다.
							stu.setNum(rs.getInt(1));
							stu.setName(rs.getString(2));
							stu.setKor(rs.getInt(3));
							stu.setEng(rs.getInt(4));
							stu.setMath(rs.getInt(5));
							
							list.add(stu);
						}
						
					} finally{ /* 클로즈 닫아주기 */
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					}
				%>
				<% 	
					for(StuBean stu : list){
						
				%>
						<tr>
							<td><%= stu.getNum() %></td>
							<td><%= stu.getName() %></td>
							<td><%= stu.getKor() %></td>
							<td><%= stu.getEng() %></td>
							<td><%= stu.getMath() %></td>
							<td><form action="delete.jsp" method="post"><button type="submit" name="num" value="<%= stu.getNum() %>">ⅹ</button></form></td>
						</tr>
				<%
					}
				%>	
				
				</tbody>
			</table>
		</div>
		<!---------------------------------------------------->
		<div id="footer">
			<p>
			(주)하이미디어홈페이지 작업자 : 권소현 creative103@naver.com &nbsp;| &nbsp;사업자등록번호 : 000-00-00000 
			&nbsp; | &nbsp;본사 : 서울 서초구 강남대로 405 통영빌딩
			&nbsp; | &nbsp;&copy; 2022 All Right Reserved.
			</p>
		</div>
		<!---------------------------------------------------->
	</body>
</html>