<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ include file="header.jsp" %>
<%	String sts = ""; %>
<c:if test="${userName ne board.writer }"><% sts = "disabled"; %></c:if>
<body>
<div class="jumbotron">
   <h1>상세 보기</h1>      
</div>
<%@ include file="menu.jsp" %>
<div id="popBox">
<img src="img/${board.filename}">
</div>
<div class="container-fluid">
  <form name="fm" action="updateBoard.do" method="post" enctype="multipart/form-data">
  <input type="hidden" name="seq" value="${board.seq}">
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">제목</span>
      </div>
      <input type="text" class="form-control innm" name="title" value="${board.title}" <%=sts %>>      
    </div>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">작성자</span>
      </div>
      <input type="text" class="form-control innm" name="writer" value="${board.writer}" readonly <%=sts %>>      
    </div>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">내용</span>
      </div>
      <textarea class="form-control innm" rows="10" id="comment" name="content" <%=sts %>>${board.content}</textarea>      
    </div> 
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">파일보기</span>
      </div>
      	<span id="imgShow">${board.filename}</span>
<%--       	<a href="img/${board.filename}" download="파일오리지널이름으로(확장자포함)" style="padding-left:10px;">${board.filename}</a>&nbsp;&nbsp; --%>
   		<c:choose>
	   		<c:when test="${board.filename eq ''}">파일없음</c:when>
	   		<c:otherwise><span style="cursor:pointer;" onclick="downloadFile('${board.filename}')">[파일다운]</span></c:otherwise>
   		</c:choose>
    </div>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">등록일</span>
      </div>
      <input type="text" class="form-control innm" name="regDate" value="${board.regdate}" readonly <%=sts %>>      
    </div>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">조회수</span>
      </div>
      <input type="text" class="form-control innm" name="cnt" value="${board.cnt}" readonly <%=sts %>>      
    </div>
    <div id="footer">
	  	<button type="submit" class="btn btn-primary" <%=sts %>>글수정</button>
	  	<button id="conWrite" type="button" class="btn btn-primary" <%=sts %>>글쓰기</button>
	  	<button id="conDel" type="button" class="btn btn-primary" <%=sts %>>글삭제</button>
	  	<button id="conList" type="button" class="btn btn-primary">글목록</button>
	</div>
  </form>  
</div>
<script type="text/javascript">
function downloadFile(filename){
    window.location ='download.do?filename='+filename;
}
</script>

</body>
</html>
