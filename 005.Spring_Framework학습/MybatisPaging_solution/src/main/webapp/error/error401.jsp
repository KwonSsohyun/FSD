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
		<h1>에러 401</h1>
	</div>
	<div class="alert alert-danger">
		<strong>요청한 페이지는 인증이 되어야 접근 가능합니다</strong> <br>사용자와 비밀번호가 제대로 입력이
		되었는지 확인해주세요.
	</div>
	<div id="footer">
		<button type="button" id="goBack" class="btn btn-primary">돌아가기</button>
	</div>
</body>
</html>
