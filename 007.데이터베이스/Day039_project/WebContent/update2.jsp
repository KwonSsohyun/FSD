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
			#content>form>table{
				width: 800px;
				border-collapse: collapse;
				margin: 0 auto;
			}
			table, th, td{
				border: 1px solid black;
			
			}
			
			table th{
				background-color: #6834C2;
				color: white;
				line-height: 50px;
				width: 150px;
			}
			table tbody{
				line-height: 30px;
			}
			
			
			tbody>tr:nth-child(6n)>td{
			 	background-color: #D24F2E;
			 	color: white;
			 	line-height: 50px;
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
			<form action="update3.jsp" method="get">
				<table>
					<tbody>
					
					<!-- 한글깨짐 방지 -->
					<% request.setCharacterEncoding("utf-8"); %>
					
					<!-- 객체를 찍어내는 것 -->
					<jsp:useBean id="stu" class="com.hi.bean.StuBean"></jsp:useBean>
					
					<!-- 파라미터 받아오는 것 -->
					<jsp:setProperty property="num" name="stu"/>
					<%-- <jsp:setProperty property="name" name="stu"/>
					<jsp:setProperty property="kor" name="stu"/>
					<jsp:setProperty property="eng" name="stu"/>
					<jsp:setProperty property="math" name="stu"/>
					 --%>
					<%@ page import="java.sql.*" %>
					
					<%
						// GET 으로 넘어온 값
						// String num = request.getParameter("num");
					
						String sql = "select num,name,kor,eng,math from bbs07 where num="+stu.getNum();
					
						String name=null;
						int kor=0;
						int eng=0;
						int math=0;
						
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
							
							while(rs.next()){ // ▶ 여기서 값 주입했으니까, 아래서 값을 get해서 쓸 수 있는 것
								name = rs.getString(2);
								kor = rs.getInt(3);
								eng = rs.getInt(4);
								math = rs.getInt(5);
							
							}
							
						} finally {
							if(rs!=null) rs.close();
							if(stmt!=null) stmt.close();
							if(conn!=null) conn.close();
						}
						
					%>
						<tr>
							<th>학번</th>
							<td>
								<input type="number" name="num" value="<%=stu.getNum()%>" readonly="readonly">
							</td>
						</tr>
						<tr>
							<th>이름</th>
							<td>
								<input type="text" name="name" value="<%=name%>">
							</td>
						</tr>
						<tr>
							<th>국어</th>
							<td>
								<input type="number" name="kor" value="<%=kor%>">
							</td>
						</tr>
						<tr>
							<th>영어</th>
							<td>
								<input type="number" name="eng" value="<%=eng%>">
							</td>
						</tr>
						<tr>
							<th>수학</th>
							<td>
								<input type="number" name="math" value="<%=math%>">
							</td>
						</tr>
						<tr>
							<td colspan='2'>
									<button type="submit">수정</button>
									<button type="reset">취소</button>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
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