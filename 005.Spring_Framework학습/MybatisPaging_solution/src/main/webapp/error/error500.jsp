<%@ page contentType = "text/html; charset=UTF-8" %>
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
	   <h1>에러 500</h1>      
	</div>
	<div class="alert alert-danger">
		<strong>잠시 서비스에 문제가 발생했습니다.</strong>
		<br>문법(Syntax) 오류이거나 알 수 없는 오류가 있습니다.
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>