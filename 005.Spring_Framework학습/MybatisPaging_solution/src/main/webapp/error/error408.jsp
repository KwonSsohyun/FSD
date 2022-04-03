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
	   <h1>에러 408</h1>      
	</div>
	<div class="alert alert-danger">
	 <strong>잘못된 요청을 여러번 시도하였습니다.</strong>
		<br>계속하시려면 다른 메뉴를 클릭한 후 접속하시거나, 브라우저를 닫았다가 다시 시작해야 합니다.
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>
