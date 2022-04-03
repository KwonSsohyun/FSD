<%@ page contentType = "text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<%@ include file="../header.jsp" %> 
<script>
$(document).ready(function(){ 
	$("#goBack").click(function() {
		history.back();
	});	
});
</script>
<body>
	<div class="jumbotron">
	   <h1>NULL 에러 발생</h1>      
	</div>
	<div class="alert alert-danger">
		<strong>서비스 처리 과정에서 산술식 에러가 발생하였습니다.</strong>
		<br>${exception.message}
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>