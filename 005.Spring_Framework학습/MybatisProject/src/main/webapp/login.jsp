<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
	<!--
	          외부스타일 CSS 
		 <link rel="stylesheet" href="css_login.css"> 
	-->
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	<style>
		.container{
			width : 50%;
		}
		
		h2{	
			margin-top : 50px;
			text-align : center;	
			font-weight : bold;
		}
		
		label {
			font-size : 15pt;
		}
		
		.form-control{
			height : 40px;
		}
		.sd{
			text-align : center;
		}
		form{
			width:50%;
			margin : 0 auto;
		}
		.bn{
			margin-top: 50px;
		}
	</style>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-info navbar-dark">
	  <ul class="navbar-nav">
	    <li class="nav-item active">
	      <a class="nav-link" href="getBoardList.jsp">HOME</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="getBoardList.do">글목록</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="insertBoard.jsp">글쓰기</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="login.jsp">로그인</a>
	    </li>
	  </ul>
	</nav>


	<div class="container">
	  <h2>로그인</h2>
	  <form action="login.do" method="post">
	    <div class="form-group">
	      <label for="id">아이디</label>
	      <input type="text" class="form-control" id="id" placeholder="id 입력" name="id" value="${userVO.id}">
	    </div>
	    <div class="form-group">
	      <label for="pw">비밀번호</label>
	      <input type="text" class="form-control" id="pw" placeholder="password 입력" name="password" value="${userVO.password}">
	    </div>
	
		<div class="sd">
		    <button type="submit" class="btn btn-info bn">로그인</button>
		</div>
	  </form>
	</div>
</body>
</html>