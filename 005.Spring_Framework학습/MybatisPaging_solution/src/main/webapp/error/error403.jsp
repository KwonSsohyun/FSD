<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="../header.jsp"%>
<script>
	$(document).ready(function() {
		$("#goBack").click(function() {
			history.back();
		});
	});
</script>
<body>
	<div class="jumbotron">
		<h1>에러 403</h1>
	</div>
	<div class="alert alert-danger">
		<strong>허가가 안된 사용자 입니다.</strong>
		<br>허가된 사용자로 이용을 해주세요.
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>
