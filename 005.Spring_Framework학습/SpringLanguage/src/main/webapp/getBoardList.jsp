<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page import = "java.util.List" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>



<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><spring:message code="message.board.list.mainTitle" /></title>
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
	  <h2><spring:message code="message.board.list.mainTitle" /></h2>
	  <p><strong>${userName} </strong> <spring:message code="message.board.list.welcomeMsg" />&nbsp;&nbsp; 
	  <a class="log" href="logout.do">Log-out</a></p>
	
	
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
	        	<button type="submit" class="btn btn-primary ipst" id="btnst"><spring:message code="message.board.list.search.condition.btn" /></button>
	        </td>
	      </tr>   
	  </table>
	  </form>
	</div>
	
	<div class="container mt-5">
	  <table class="table">
	    <thead class="table-info">
	      <tr>
	        <th><spring:message code="message.board.list.table.head.seq" /></th>
	        <th><spring:message code="message.board.list.table.head.title" /></th>
	        <th><spring:message code="message.board.list.table.head.writer" /></th>
	        <th><spring:message code="message.board.list.table.head.regDate" /></th>
	        <th><spring:message code="message.board.list.table.head.cnt" /></th>
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
		<button type="button" class="btn btn-info"><a class="astyle" href="insertBoard.jsp"><spring:message code="message.board.list.link.insertBoard" /></a></button>
	</div>

</body>
</html>



