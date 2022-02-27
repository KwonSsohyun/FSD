<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	table{}
	table,th,td{
		border : 1px solid gray;
	}

</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		// 해당페이지 브라우저에서 열기
		// http://localhost:8080/Day049/list.jsp
		
		// ▶ 제이쿼리 통신
		//   → 파라미터 전달하고 싶다면?
		// $.get("stu.jsp", function(data){ → 통신성공하면 수행되는 콜백 (200)
		
		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	
		
		// ▶ 파라미터 인자 전달하기
		//   → 2가지 방식이 존재
		//     ① 첫번째 인자 → 파일명뒤에 ?붙혀서 파라미터 전달 값 적기
		//     ② 두번째 인자 → 파라미터 전달 값 적기
		
		//   ● get 방식
		//     ▶ 파라미터 전달 ①방식 사용
		//       → 파라미터 전달하면, stu.json이 받는다.
		//         문자열로 던져진다.
		//         해당 json에서 숫자로 받고 싶으면, 숫자로 변환한다.
		//   $.get("stu.jsp?num=10", function(data){
			
		//   ● post 방식
		//     ▶ 파라미터 전달 ②방식 사용
		//       → 두 번째 인자가 파라미터 전달하는 값
		//         마찬가지로 문자열로 파라미터값 던져진다.
		// $.post("stu.jsp", "num=11", function(data){
			
		// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■	
		
		//  ● get 방식 
		//    → 두 번째 인자 파라미터 전달값
		//      여러개 보낼거면 & 하면 된다.
		$.get("stu.jsp", "num=12&name=권소현", function(data){
			console.log(typeof data, data); //  object  |  {students: Array(1)}
			                                //  stu.jsp의 타입이 object 객체타입인 걸 알수 있다.
			                                //  그 안에 받아온 데이터는 
			                                //  ▶ students 배열 1개를 받아온 걸 알수있다.
			
			// tbody 엘리먼트 만들고,
			// 만든 tbody가 <table>태그 안, 맨 뒤에 들어간다.
			var tbody = $('<tbody/>').appendTo('table');
			
			// ▶ json파일의 배열의 갯수만큼 존재해야한다.
			//   → stu.jsp 받아온 인자 data타입이 object객체 타입이니
			//     프로퍼티 형식으로 접근한다.
			//     data. 로 하고 그 안에 키명이 students니 적고
			//     아까 콘솔로 위에서 data찍었을때 students의 배열을 받아왔으니
			//     students의 배열갯수만큼 돌아야 하니
			//     .lenath를 붙혀줘서 완성하면!
			// ▶ data.students.length
			for(var i=0; i<data.students.length; i++){
				// ▶ tr, td → 엘리먼트 생성 
				$('<tr><td></td><td></td><td></td><td></td><td></td></tr>')
				    // ▶ 위에서 바로 엘리먼트를 생성했으니
				    //   → 만든 것중에서 td를 찾는다.
					.find('td')
					// → 첫번째 td에 넣는다.
					//   <td> ///이 사이에 넣는다.// </td>
					//   ▶ data.students[i].num
					//     stu.json의 불러온 데이터 이름이 data에 접근해서
					//     students키명에 접근해서
					//     그안에 해당 배열[i]접근해서
					//     그 안은 또 객체니 num, name, kor... 이 키명이니
					//     .num으로 접근한다.
					.first().text(data.students[i].num)
					// → next니까 두번째 td넣는다.
					.next().text(data.students[i].name)
					// → next니까 그 다음인 세번째 td
					.next().text(data.students[i].kor)
					.next().text(data.students[i].eng)
					.next().text(data.students[i].math)
					
					// ▶ 현재 위에서는 td를 잡고 있으니
					//   .parent를 이용해 td의 부모인 tr를 잡고
					//   tr을 toboy에 집어넣는다.
					.parent().appendTo(tbody);
			}
		
		});
	
	
	});

</script>

</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
		</thead>
	
	
	</table>
</body>
</html>