<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>새글 등록</title>
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
	  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
	  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>	
	
		<style>
		  	h2{
				font-weight : bold;
				margin-bottom : 30px;
			}
		  	.colst{
		    	padding-left : 0px !important;
			}
			strong{ color: #008099; }
		    .table{boder:0px !important; margin-top:40px;}
		    .log{color:red; font-weight:bold;}
	        .log:hover{ color:red; }
		    .tc:last-child { border-bottom: 1px solid #599799;}
			th, td {
	  			text-align: center;
			}
	        tr:nth-child(3){ height:200px !important; }
	        tr:nth-child(3)>th{ line-height : 200px;}
	        tr:nth-child(3)>tr{ line-height : 200px;}
	        .btnv { margin-top:40px; text-align : center; }
	        .as{ color:white; }
	        .as:hover{ color:white; text-decoration:none; }
	        input { width:100%; }
	        textarea {
			    width: 100%;
			    height: 200px;
			    border: none;
			    resize: none;
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
	
	
    
	<div class="container mt-5">
	  <h2>글 등록</h2>
	  <p><strong>테스트</strong> 님 환영합니다.&nbsp;&nbsp; <a class="log" href="logout_proc.jsp">Log-out</a></p>
      

	<form action = "insertBoard.do" method="post">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th class="col-md-3 table-info">제목</th>
            <td><input type="text" name="title" /></td>
          </tr>
          <tr>
            <th class="col-md-3 table-info">작성자</th>
            <td><input type="text" name="writer" size="10" /></td>
          </tr>
          <tr>
            <th class="col-md-3 table-info">내용</th>
            <td><textarea name="content"></textarea></td>
          </tr>
       </thead>
      </table>
      	
        
        <div class="btnv"> 
            <button type="submit" class="btn btn-info">새글 등록</button>
            <button type="button" class="btn btn-primary"><a class="as" href="getBoardList.do">글 목록 가기</a></button>
        </div>


	</form>

	</div>      
	
</body>
</html>