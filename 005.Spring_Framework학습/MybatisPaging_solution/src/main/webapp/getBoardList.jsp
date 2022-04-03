<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*,com.springbook.biz.board.BoardVO" %>
<%@ include file="header.jsp" %>
<style>
#searchNav{-webkit-justify-content: flex-end; justify-content: flex-end; }
</style>
<body>
<div class="jumbotron">
   <h1>공지 사항</h1>      
</div>
<%@ include file="menu.jsp" %>
<nav id="searchNav" class="navbar navbar-expand-sm navbar-dark">
  <form class="form-inline" name="fm" action="getBoardList.do" method="post">
  	<select class="form-control" id="sel1" name="searchCondition" style="display:inline-block!important;margin-right:10px;">
		<c:forEach items="${conditionMap}" var="option">
			<option value="${option.value}" <c:if test="${boardVO.searchCondition eq option.value}">selected</c:if>>${option.key}</option>
		</c:forEach>
    </select>
    <input class="form-control mr-sm-2" type="text" name="searchKeyword" value="${boardVO.searchKeyword}" placeholder="검색어를 입력하세요.">
<!--     <button class="btn btn-success" type="submit">검색</button> -->
	<input type="hidden" name="nowPage">
    <button class="btn btn-success" type="button" onclick="pageFnc('0')">검색</button>
    <button type="button" id="conWrite" class="btn btn-primary">글쓰기</button>
  </form>
</nav>
<div class="container-fluid">
  <table class="table table-hover">
    <thead class="btn-primary">
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
	<tr onclick="selTr(${board.seq})" style="cursor:pointer;">
	  <td class="tdCenter">${board.seq}</td>
	  <td>${board.title}</td>
	  <td class="tdCenter">${board.writer}</td>
	  <td class="tdCenter">${board.regdate}</td>
	  <td class="tdCenter">${board.cnt}</td>
	</tr>
</c:forEach>
    </tbody>
  </table><br><br>
  
  <div id="btnBox"  style="text-align: center;">
	<div id="pgCnt" class="btn-group">
	<c:if test="${paging.startPage != 1 }">
		<button type="button" class="btn btn-primary" onClick="pageFnc(${paging.startPage - 1 })">&lt;</button>
	</c:if>
	<c:forEach begin="${paging.startPage }" end="${paging.endPage }" var="p">
		<c:choose>
			<c:when test="${p == paging.nowPage }">
				<button type="button" class="btn btn-primary" style="color:#f00;">${p }</button>
			</c:when>
			<c:when test="${p != paging.nowPage }">
				<button type="button" class="btn btn-primary" onClick="pageFnc(${p })">${p }</button>
			</c:when>
		</c:choose>
	</c:forEach>
	<c:if test="${paging.endPage != paging.lastPage}">
		<button type="button" class="btn btn-primary" onClick="pageFnc(${paging.endPage+1})">&gt;</button>
	</c:if>
	</div>
  </div><br>
  
</div>
<script>
function pageFnc(np){
	let frm = document.fm;
	frm.nowPage.value = np;
	frm.action = "getBoardList.do";
	frm.method = "post";
	frm.submit();	
}
</script>

</body>
</html>
