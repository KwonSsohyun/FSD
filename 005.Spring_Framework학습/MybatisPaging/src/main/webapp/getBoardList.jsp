<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page import = "java.util.List" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>


<%
	// 세션에 저장된 글 목록을 꺼낸다.
	// List<BoardVO> boardList = (List) session.getAttribute("boardList");

	// if(boardList == null){
	//	response.setContentType("text/html; charset=UTF-8");
	//	PrintWriter pw = response.getWriter();
	//	pw.println("<script>");
	//	pw.println("location.href='getBoardList.do'; ");
	//	pw.println("</script>");
	//}
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글 목록</title>
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
	    #btnst {padding:0px 20px!important;height:38px !important;}
	    
	    .container{padding : 0;}
	    .input-group{
	    	margin-left: 0px !important; 
	    	-webkit-justify-content: space-between;
			justify-content: space-between;
	    }
	    .ipst {width:100%!important;}
	    .table{boder:0px !important;}
		.astyle{color:white; text-decoration-line: none;}
	    .cen{text-align:center;}
	    .gtd{border-width:0px!important;}
	    .astyle:hover{color:white; text-decoration-line: none;}
	    .log{color:red; font-weight:bold;}
	    .log:hover{ color:red; }
	    .tc:last-child { border-bottom: 1px solid #599799;}
		.mabtn { margin-bottom : 50px; }
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
	  <h2>글 목록</h2>
	  <p><strong>${userName} </strong> 님 환영합니다.&nbsp;&nbsp; <a class="log" href="logout.do">Log-out</a></p>
	
	
	  <!-- 검색 -->
	  <form action="getBoardList.do" method="post">
	    <table class="table">
	     <colgroup>
	      <col style="width:20%;">
	      <col style="width:65%;">
	      <col style="width:15%;">
	 	 </colgroup>
	      <tr>
	        <td class="gtd">
	        	<select style="width:200px;" name="searchCondition" class="custom-select ipst">
	        	<c:forEach items="${conditionMap}" var="option">
	        		<option value="${option.value}"> ${option.key}
	 	             <!-- <option value="TITLE">제목</option>
		              <option value="CONTENT">내용</option> -->
	            </c:forEach>
	        	</select>
	        </td>
	        <td class="gtd">
	        	<input type="text" class="form-control ipst" placeholder="검색하세요." style="width:500px;" name="searchKeyword">
	        </td>
	        <td  class="gtd">
	        	<button type="submit" class="btn btn-primary ipst" id="btnst">검색</button>
	        </td>
	      </tr>   
	  </table>
	  </form>
	</div>
	
	<div class="container mt-5">
	  <table class="table">
	    <thead class="table-info">
	      <tr>
	        <th>번호</th>
	        <th>제목</th>
	        <th>작성자</th>
	        <th>등록일</th>
	        <th>조회수</th>
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach items="${boardList}" var="board">
        <tr class = "tc">
	          <td>${board.seq}</td>
	          <td align="left"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
	          <td>${board.writer}</td>
	          <td>${board.regDate}</td>
	          <td>${board.cnt}</td>
	    </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
	
	
	<div class="container mt-5 cen">
		<button type="button" class="btn btn-info mabtn"><a class="astyle" href="insertBoard.jsp">새글 등록</a></button>
	</div>

	<div class="container mabtn">
		<ul class="pagination justify-content-center">
		
		
			<%-- for문 --%>
			<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=${ptotalBtn.btnCnt-1}">Previous</a></li>
			<c:forEach var="i" begin="1" end="${totalBtn.totalBtn}">
				<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=${i}">${i}</a></li>
			</c:forEach>
			<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=${ptotalBtn.btnCnt+1}">Next</a></li> 
			
			<!-- 
			<li class="page-item"><a class="page-link" href="#">Previous</a></li>
			<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=1">1</a></li>
			<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=2">2</a></li>
			<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=3">3</a></li>
			<li class="page-item"><a class="page-link" href="getBoardList.do?btnCnt=4">4</a></li>
			<li class="page-item"><a class="page-link" href="#">Next</a></li> 
			-->
		</ul>
	</div>

	
	

</body>
</html>



