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
		<strong>서비스 처리 과정에서 널(NULL) 에러가 발생하였습니다.</strong>
		<br>파라미터 값이 제대로 전송되었는지 확인해주세요.
		<br>${exception.message}
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>