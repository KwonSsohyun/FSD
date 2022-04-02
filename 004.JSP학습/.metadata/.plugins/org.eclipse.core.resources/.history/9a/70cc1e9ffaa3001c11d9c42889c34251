<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<style>
		a:hover {color:red;}
		.input-group-append {cursor:pointer;}
		.input-group-text{background-color:#007bff; color:#fff!important;}
		.input-group-text:active{background-color:#5fa1e7; color:#fff!important;}
		#sample6_postcode {background-color:#fff;}
		</style> 
	</head>
<body>
<div class="container">
	<h1>Daum 우편번호 Api 이용하기</h1>
	<a href="https://postcode.map.daum.net/guide" target="_blank">api다운받기</a>
	<br><br>

	<form action="19_01_daumResult.jsp" method="post">
		<div class="input-group mb-3">
			<input type="text" class="form-control" id="sample6_postcode" name="addrNum" placeholder="우편번호" readonly>
			<div class="input-group-append" onclick="sample6_execDaumPostcode()">
				<span class="input-group-text">우편번호 찾기</span>
			</div>
		</div>
		<div class="form-group">
	      <input type="text" class="form-control" id="sample6_address" name="addr1" placeholder="주소">
	    </div>
	    <div class="input-group">
	      <input type="text" class="form-control" id="sample6_detailAddress" name="addr2" placeholder="상세주소">
	      <input type="text" class="form-control" id="sample6_extraAddress" name="cmt" placeholder="참고항목" readonly>
	    </div><br>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

<script>
function sample6_execDaumPostcode() {
	new daum.Postcode({
		oncomplete : function(data) {
			// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

			// 각 주소의 노출 규칙에 따라 주소를 조합한다.
			// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			var addr = ''; // 주소 변수
			var extraAddr = ''; // 참고항목 변수

			//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
			if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
				addr = data.roadAddress;
			} else { // 사용자가 지번 주소를 선택했을 경우(J)
				addr = data.jibunAddress;
			}

			// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
			if (data.userSelectedType === 'R') {
				// 법정동명이 있을 경우 추가한다. (법정리는 제외)
				// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
				if (data.bname !== ''
						&& /[동|로|가]$/g.test(data.bname)) {
					extraAddr += data.bname;
				}
				// 건물명이 있고, 공동주택일 경우 추가한다.
				if (data.buildingName !== ''
						&& data.apartment === 'Y') {
					extraAddr += (extraAddr !== '' ? ', '
							+ data.buildingName
							: data.buildingName);
				}
				// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
				if (extraAddr !== '') {
					extraAddr = ' (' + extraAddr + ')';
				}
				// 조합된 참고항목을 해당 필드에 넣는다.
				document.getElementById("sample6_extraAddress").value = extraAddr;

			} else {
				document.getElementById("sample6_extraAddress").value = '';
			}

			// 우편번호와 주소 정보를 해당 필드에 넣는다.
			document.getElementById('sample6_postcode').value = data.zonecode;
			document.getElementById("sample6_address").value = addr;
			// 커서를 상세주소 필드로 이동한다.
			document.getElementById("sample6_detailAddress").focus();
		}
	}).open();
}
</script>
</body>
</html>