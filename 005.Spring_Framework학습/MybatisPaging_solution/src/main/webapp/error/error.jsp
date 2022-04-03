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
		<h1>에러</h1>
	</div>
	<div class="alert alert-danger">
		<strong>에러가 발생하였습니다.</strong> <br>내용을 확인해주세요.
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>
