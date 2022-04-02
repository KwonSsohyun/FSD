<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Validation</title>
<meta charset="utf-8">
<!-- 파비콘(해당 사이트를 나타내는 아이콘) 에러 시 -->
<!-- <link rel="shortcut icon" href="data:image/x-icon" type="image/x-icon"> -->
<style>
form {width:60%; margin:0 auto; padding:10px; text-align:center;}
</style>
</head>
<body>
	<form name="loginForm" action="12_01_validation_process.jsp" method="post">
	<fieldset>
		<legend>로그인</legend>
		<label for="uid">아&nbsp;이&nbsp;디&nbsp;&nbsp;: </label>
		<input type="text" name="id" id="uid" required><br>
		<label for="upw">비밀번호&nbsp;: </label>
		<input type="password" name="passwd" id="upw" required><br><br>
		<!-- <input type="submit" value="전송"> -->
 		<input type="button" value="전송" onclick="checkLogin()">
	</fieldset>
	</form>

<script>
	 function checkLogin() {
		var form = document.loginForm; // 폼요소의 name (.) 폼요소일경우 name 핸들링 가능
		
		if (form.id.value == "") { // name이 id인것
			alert("아이디를 입력해 주세요.");
			form.id.focus();
			return; // 밑에거 실행 안되고 나감! -> 펑셩 자체를 나감
		} else if (form.passwd.value == "") {
			alert("비밀번호를 입력해 주세요");
			form.passwd.focus();
			return false; // -> 펑셩 자체를 나감
		}			
		console.log("값 가져오기: ");
		console.log("아이디 : " + document.loginForm.id.value + "\n" +  "비밀번호 : " + document.loginForm.passwd.value);
		form.submit();
	} 
</script>
</body>
</html>