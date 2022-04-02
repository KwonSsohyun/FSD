<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Validation</title>
<meta charset="utf-8">
<!-- 파비콘(해당 사이트를 나타내는 아이콘) 에러 시 -->
<!-- <link rel="icon" type="image/png" href="http://example.com/myicon.png"> -->
<script>
	function checkMember() {

		var regExpId = /^[0-9a-zA-Z]{4,8}/; //숫자,영문자 4자~8자 이내 가능
		var regExpName = /^[가-힣]*$/; //$ : 한글 문자만 가능. ㄱ~ㅎ, ㅏ~ㅣ도 안됨.
		var regExpPasswd = /^[0-9a-zA-Z]{4,12}/; //숫자,영문자 4자~12자 이내 가능
		var regExpPhone = /^\d{3}-\d{4}-\d{4}$/; //숫자3-숫자4-숫자4개 형식으로만 가능
		var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])+@[a-zA-Z]([-_\.0-9]?[a-zA-Z])+.[a-zA-Z]{2,3}$/i;

		var fm = document.Member;

		var uid = fm.uid.value;
		var unm = fm.unm.value;
		var upw = fm.upw.value;
		var phone = fm.phone1.value + "-" + fm.phone2.value + "-" + fm.phone3.value;
		var umail = fm.umail.value;	

		if (!regExpId.test(uid)) {
			alert("아이디는 영문자와 숫자로 4~8자리 이내로 입력해 주세요!");
			fm.uid.focus();
			return; // 펑셩을 나간다.
		}
		
		if (!regExpPasswd.test(upw)) {
			alert("비밀번호는 영문자와 숫자로 4~12자리 이내로 입력해 주세요!");
			return;
		}
		
		if (!regExpName.test(unm)) {
			alert("이름은 한글만으로 입력해 주세요!");
			fm.unm.focus();
			return;
		}
		
		if (!regExpPhone.test(phone)) {
			alert("연락처 입력을 확인해 주세요!");
			return;
		}
		if (!regExpEmail.test(umail)) {
			alert("이메일 입력을 확인해 주세요!");
			return;
		}
		
		fm.submit();

	}
</script>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="12_02_validation03_process.jsp" name="Member" method="post">
		<label for="uid">아 이 디: </label>
		<input type="text" name="uid" id="uid" required><br>
		<label for="upw">비밀번호: </label>
		<input type="password" name="upw" id="upw" required><br>
		<label for="unm">이름: </label>
		<input type="text" name="unm" id="unm" required><br>
		<label for="utel">연 락 처: </label>
		<select name="phone1" id="utel">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="019">019</option>
		</select>
		 - <input type="text" maxlength="4" size="4" name="phone2">
		 - <input type="text" maxlength="4" size="4" name="phone3"><br>
		<label for="umail">이 메 일: </label>
		<input type="email" name="umail" id="umail" required><br>
		
		<br><input type="button" value="전송" onclick="checkMember()">
	</form>
</body>
</html>