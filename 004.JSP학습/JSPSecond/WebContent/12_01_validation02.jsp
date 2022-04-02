<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Validation</title>
<meta charset="utf-8">
<style>
form {width:60%; margin:0 auto; padding:10px; text-align:center;}
</style>
</head>
<body>
	<form name="frm" action="12_01_validation_process.jsp" method="post">
	<fieldset>
		<legend>exec()메소드 사용</legend>
		<label for="itt">제목 : </label>
		<input type="text" name="itt" id="itt" value="java server Pages" required><br>
 		<input type="button" value="전송" onclick="checkForm()">
	</fieldset>
	</form>
<script>
/* 유효성 검사: 데이터가 전송되기 전 폼 입력값이 규칙에 맞게 입력되었는지 확인하는 것
      정규 표현식: 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 형식 언어
	형식: 
	1. var 변수명 = /정규표현식/[Flag];
	2. var 변수명 = new RegExp('정규표현식',['Flag']);
	flag값 : 
		i - 대소문자 구분 없이 검사
		g - 문자열 내의 모든 패턴을 검사
		m - 문자열에 줄바꿈행이 있는지 검사 
	
       문자열 판단 메소드
	test() : 매개 변수 값으로 전달되는 문자열이 정규표현식에 부합한지 판단하여 boolean판단
	exec() : 매개 변수 값으로 전달되는 문자열에서 정규 표현식에 문자열을 추출하여 반환함.
*/
	function checkForm() {
		var regExp = /Java server/i; //Java server문자열이 포함되었는지 여부 판단. i: 대소문자 구분없이
		//var regExp = new RegExp('Java','i');
		var str = document.frm.itt.value;
		var result = regExp.exec(str);
		alert(result);
	} 
</script>
</body>
</html>