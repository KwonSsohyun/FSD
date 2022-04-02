<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>
<div class="jumbotron">
   <h1>글쓰기</h1>      
</div>
<div class="container-fluid">
  <form action="#" method="post" enctype="multipart/form-data">
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">제목</span>
      </div>
      <input type="text" class="form-control" name="title" placeholder="제목을 입력하세요." required>      
    </div>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">작성자</span>
      </div>
      <input type="text" class="form-control innm" name="writer">      
    </div>
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">내용</span>
      </div>
      <textarea class="form-control" rows="10" id="comment" name="content"></textarea>      
    </div>  
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">파일등록</span>
      </div>
      <input type="file" class="form-control innm" name="uploadFile">      
    </div>
    <div id="footer">
	  	<button id="conComplete" type="submit" class="btn btn-primary">새글 등록</button>
	  	<button id="conList" type="button" class="btn btn-primary">글목록</button>
	 </div>
  </form>  
</div>

</body>
</html>
