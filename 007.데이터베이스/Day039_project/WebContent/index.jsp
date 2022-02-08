<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				height: 600px;
				line-height: 600px;
				text-align: center;
				background-color: #EBEBEB;
				padding: 50px 0px;
			}
		    /* 하단 영역 (푸터) ***************************************/
		    #footer {
		    	background-color: #1C1C1C;
		    	height: 70px;
		    	color: #A1A1A1;
		    	text-align: center;
		    	padding: 20px 0px;
		    	line-height: 70px;
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
			학생성적관리사이트 (ver 0.10.0)
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