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
	   <h1>에러 404</h1>      
	</div>
	<div class="alert alert-danger">
	 <strong>요청한 페이지는 존재하지 않는 페이지입니다.</strong>
		<br>주소를 올바르게 입력했는지 확인해보시기 바랍니다.
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>
