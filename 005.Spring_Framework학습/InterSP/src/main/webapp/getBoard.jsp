<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<%
	String sts = "";
	if(session.getAttribute("login") == null){
		 sts = "disabled";
	}
	
%>
<body>
<div class="jumbotron">
   <h1>상세 보기</h1>      
</div>
<div class="container-fluid">
<%
	if (request.getParameter("error")!=null) {
		out.println("<div class='alert alert-danger'>");
		out.println("해당 글은 작성자만이 수정할 수 있습니다.");
		out.println("</div>");
	}
%>
  <form name="fm" action="#" method="post">
  <input type="hidden" name="seq" value="${board.seq}">
  <input type="hidden" name="filename" value="${board.filename}">
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
      	<a href="img/${board.filename}" target="_blank" style="padding-left:10px;">${board.filename}</a>&nbsp;&nbsp;
   		<c:if test="${board.filename ne NULL }"><span style="cursor:pointer;" onclick="downloadFile('${board.filename}')">[파일다운]</span></c:if>
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
	  	<button id="conWrite" type="button" class="btn btn-primary" <%=sts %>>글등록</button>
	  	<button id="conDel" type="button" class="btn btn-primary" <%=sts %>>글삭제</button>
	  	<button id="conList" type="button" class="btn btn-primary">글목록</button>
	</div>
  </form>  
</div>


</body>
</html>
