<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	*{
		margin: 0px;
		padding : 0px;
	}	
	.container{
		margin: 0px auto;
	}
	#menu{
		text-align:center;
		position: fixed;
		width : 100%;
		height : 50px;
		background: gray;
	}
	#menu>a{
		line-height: 50px;
		color: white;
		text-decoration: none;
		margin-right: 50px;
	}
	#content{
		padding-top: 60px;
	}
	#content table{
      border-collapse: collapse;
      width: 80%;
      margin: 10px auto;
   }
   #content table,#content table th,#content table td{
      border: 1px solid gray;
   }
   #backup{
   	  display: none;
   }
   #popup{
   		background-color: rgba(0,0,0,0.5);
   		width : 100%;
   		height : 100%;
   		position : absolute;
   		left : 0px;
   		top: 0px;
   		display : none;
   }
   #popup>div{
   		width : 400px;
   		height : 400px;
   		background-color : white;
   		margin : 100px auto;
   		border-radius : 20px;
   }

</style>

<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		// 해당페이지 브라우저에서 열기
		// http://localhost:8080/Day049/index.jsp 
		
        // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
		
		// ▶ 팝업에 입력버튼을 클릭했을때, submit 이벤트가 발동됨
		//   .submit()  ▶  파라미터로 값 전송됨 (form태그의 이벤트)
		//   기존의 있던 기능은 페이지이동 이라 
		//   내가 의도하는 바와 다르기 때문에 콜백함수를 재정의를 한다.
		//   ▶ 페이지 이동없이 → 한 페이지에서 모든걸 하길 원함.
		
		// id="popup" 아래 form태그 잡고,
		$('#popup form').submit(function(){ // ▶ type="submit"인 버튼이 폼태그안에서 클릭되면 submit이벤트가 발동된다.
			                                //   <button type="submit">입력</button> 을 누르면
			                                //   해당 함수 발동됨!
			// ▶ .serialize()                                
			//    파라미터 만들어줌.
			//   
			//    ▶ input창에 사용자가 입력을 하면, 그것을 파라미터값으로 뽑아준다.
			//      → 팝업창 뜨고, 인풋창 각각에 1, 2, 3 이라 입력하고 입력 버튼 눌러주면
			//        콘솔창에  "deptno=1&dname=2&loc=3"  뜨는 것을 볼 수 있다.
			//        → console.log( $( this ).serialize() );   // deptno=1&dname=2&loc=3
			var param = $( this ).serialize();
			console.log(param);
			
			
			// ▶ 팝업창 열고 "입력버튼"을 누르면, 팝업창 닫히기
			//   → 아래서 $('#popup').click() 이벤트 정의해놓음
			//     정의해놓은 사항대로 이벤트 발동이 된다.
			//   ● 트리거 → 이벤트 발동
			$('#popup').click();
			
			
			// ▶ 제이쿼리 통신
			//   【 jquery 비동기 통신  |  $.ajax(), $.get(), $.post() 사용방법 】
            //      → https://webinformation.tistory.com/22 
			$.ajax({
				// ● 요청 할 주소
				url : 'insert.jsp' ,
				
				// ● 파라미터 값 보낸다.
				//   위에서 .serialize() 로 파라미터 만들었다. 
				//   → 인풋창에 적은 내용들 파라미터로 만들어줌
				//     insert.jsp로 파라미터값 전달해 준다.
				data : param,
				
				// ● post 방식
				type : 'post',
				
				// ● 요청 완료 시, 수행되는 함수
	            success:function(){ 
					// insert.jsp가 성공하면(index.jsp에서 사용자가 팝업창 인풋창에 입력한 값이 데이터베이스에 잘 추가완료되면), 
					// 페이지 새로고침해서, 바로 표에 값 확인할 수 있게 한다.
					// 트리거
					// 실시간으로 입력 버튼눌렀을때
					// 적은내용이 테이블에 바로 홈페이지에서 볼 수 있게
					// 페이지 새로고침의 역활을 한다.
	                $('#menu a:eq(1)').click(); // → 성공되면 자동으로 [ LIST ] 클릭하게 됨
	                                            //   보여지는 페이지가 새로고쳐짐
	             }
				
			});
			
			// ● 기본기능 막기
			//   → form태그의 페이지 이동 막기
			//     페이지 이동없이 → 한 페이지에서 모든걸 하길 원함.
			return false;
		});
		
		
        // ------------------------------------------------------------------------------------------------------------
		
        
		$('#popup')
			// 하나의 연결임 (메서드 체인)
			.click(function(){
				// ▶ 팝업 누르면, 팝업 안보이게 하기  ▶  $(this).css('display', 'none')
				//   + 인풋 기존값 지우기  ▶  .find('input').val('')
				$(this).css('display', 'none').find('input').val(''); 
				
			})
			.children() // popup 직속자식들 (popup 아래 같은레벨) ▶ <div> 
			.first()    // 위의 .children() 복수(아이들)(child의 복수)들을 잡았으니, 그 중 첫번째 자식을 잡았다. 그게 div
			            // 원래 children() 해서 직속자식이라서 div하나이지만, 복수형이라서
			            // 확실히 하고자, 그중 첫번째로 .first() 해서 확실히 div잡음
			.click(function(e){ // div를 클릭하면~
				// 버블링 막기 → 팝업창 눌러도 안닫침 (배경눌르면 팝업창 꺼짐)
				//               자식의 내용이 부모로 퍼진다.
				// ▶ 자식을 클릭했을때 전파를 막는다.
				//   div를 잡았기 때문에다.
				//   → 검은배경을 눌러야만 팝업창이 꺼진다.
				e.stopPropagation();
		});

	    // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

		
		// ▶ 리스트페이지에서 맨 아래 "입력"을 눌렀을 때 팝업창 뜨게 하기!
		//   table+a  →  + 같은 레벨의 형제요소인데 '바로 다음'이어야 한다.
		//               <table> 같은 레벨 아래로 <a href="#">입력</a> 있으니
		//               입력이라는 a앵커태그를 선택한 것이다.
		// 
		// ▶▶  $('선택자를가지고있는상위요소').on(이벤트, 선택자, 콜백함수);
		$('#content').on('click', 'table+a', showPopup);
		
	    // ------------------------------------------------------------------------------------------------------------		
	    
		$('#menu a')
			.first() // → [ HOME ]
				.click(function(){ // ▶ [ HOME ] 버튼 누르면!
					// html()    ▶ 겟터
					// html(///) ▶ 셋터 (기존에 있던거 없어지고, 이걸로 덮어써짐)
					//             html(html()+num); → 기존내용까지 같이 쓰고싶다면 해당처럼 해라 겟터+셋터같이 쓰기
					// 
					// <div id="content"> 영역은 보이는 영역 이므로
					//  $('#home').html() → 숨겨져서 화면에는 안보이는 <div id="home">의 내용을 긁어와서
					//  <div id="content"> 태그사이에 긁어온 내용을 넣는다.
					//   그러면, <div id="home"> 의 내용이 화면에 보인다.
					// ▶ 싱글페이지 어플리케이션 
					//   : 페이지 전환은 이루어지지 않으나, 
					//     실질적인 주소변경은 일어나지 않는데, 
					//     보여지는 페이지 전환은 일어난다.
					$('#content').html($('#home').html());
				})
				// ▶ 페이지 로딩 순간, 첫 화면 보이게 하기
				//   트리거 → 이벤트 발동시킴 (위에 것을 호출한것임)
				//   내가 클릭하지도 않았는데, 클릭 이벤트 발동시켜서
				//   [HOME] 버튼 누르게 한것처럼, 첫 화면 보이게 함
				.click()
			.next() // → [ LIST ] 
				.click(function(){ // ▶ [ LIST ] 버튼 누르면!
					// $('#list').html() → 숨겨져서 화면에는 안보이는 <div id="list"> 내용을 긁어와서
					// '#content' 태그사이에 긁어온 내용을 넣는다.
					// → 코드재사용같은 느낌
					// ▶ 싱글페이지 어플리케이션 
					//   : 페이지 전환은 이루어지지 않으나, 
					//     실질적인 주소변경은 일어나지 않는데, 
					//     보여지는 페이지 전환은 일어난다.
					$('#content').html($('#list').html());
					
				
					// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

					
					// ▶ 제이쿼리 통신을 지원하는 대표 ajax
					//   전체를 대상으로 함 (통신기반)
					//   → 설정이 이미 되어있는 편하게 쓰기 위한 get, post, getJSON 있다.
					
					
					// ▶ 요청 URL 
					//    → dept.jsp
					$.ajax('dept.jsp', {
						
						// ●  type : 전송방식
						//    → get | post | put | delete 방식 
						type : 'get', 
						
						
						// ●  데이터타입
						//     → 받아오는 문서의 데이터 타입
						//       dept.jsp 받아오는 데이터 타입
						//       json 형식으로도 받아올 수 있다.
						//       우리는 jsp확장명이지만, 해당파일안에 json형식으로 작성했고,
						//       컨텐츠타입또한 contentType="application/json 으로 상단에 작성했기 때문에
						//       json 파일형식으로 가져올 수 있어서 json이라 작성!
						// 
						//     → post일때는 필수 설정 해야함!
						//       get은 알아서 추측해서 알아서 한다. (xml, json, script, or html)
						dataType : 'json', 
						
						
						// ●  파라미터 전달 (파라미터 값 보낸다.)
						//     → 받아오는 문서에 파라미터 값 전달됨
						//       ex) dept.jsp?num=1&name=abcd  →  이렇게 파라미터 전달된다.
						//           dept.jsp에서 request.getParameter() 로 파라미터를 받아서 사용할 수 있다.
						//
						//     → 두 개 이상이면 &를 붙힌다.
						// ***** data : 'num=1&name=abcd',
						
						
						// ●  post방식으로 전달할때 contentType을 명시해줘야 한다.
						//    → form태그를 사용하면 기입을 안해줘도 된다.
						//      form 태그에 enctype="application/x-www-form-urlencoded" 기본 내장되어있음
						//
						//    → form태그를 제외한 나머지는 명시를 해줘야 한다. (★post방식일때)
						// ***** contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
						
						
						
						// ▶ 성공했을때 콜백 (요청 완료 시, 수행되는 함수)
						//   → dept.jsp가 성공하면 (dept.jsp안에 dept테이블 데이터베이스 전체 볼 수 있게 조회했다.) 
						//     이것이 문제없이 잘 수행되고 완료되면
						//     콜백이 수행된다.
						// 
						//   → 인자 3개
						//     ● 데이터     (받아온 문서 데이터) 
						//     ● Status상태 (success라는 문자열 떨어짐 | 상태코드 성공여부확인), 
						//     ● XHR        (XMLHttpRequest)
						success : function(data , status , xhr){  // ▶ 통신성공을 하면, 해당 콜백이 수행된다.
							console.log(typeof data, data , status , xhr.status, xhr.readyState); //  'success'    200(접속성공)    4(완료시점)
							                                                                      //   status       xhr.status     xhr.readyState
							                                                                      // -------------------------------------------------------
																									
																								  // ▶ Status     : 데이터 수신의 성공여부를 판단해주는 속성
																								  //                200 → 해당 url로 접근 성공
																								  //
																								  // ▶ readyState : ajax통신의 진행중인 상태
																								  //                4 → 수신완료 (데이터를 모두 받은 상태)
																								  
																								  // -------------------------------------------------------
							// ▶ 통신성공을 하면, 해당 수행된다.		 															  
							//   엘리먼트 만든다.                                                        
							var tbody = $('<tbody/>');
							
							
							// ▶ in "객체" 대상으로 반복하며, 키값을 가져온다.
							// ▶ of "배열" 대상으로 반복하며, 배열안에 있는 아이템들을 가져온다.
							// -----------------------------------------------------------------
							
							// < for ...in (객체 순환) → 객체(키:값)을 대상 >
							//   for(변수 in 객체)
							//   ▶ 변수       -> 해당 객체 안의 들어있는, 키의 갯수만큼 키를 가져온다.
							//   ▶ 객체[변수] -> 해당 객체 안의 들어있는, 키의 갯수만큼 키의 해당하는 값을 가져온다.
							
							//      var obj = { a: 1, b: 2, c: 3 };
							//
							//      → var prop 변수명 지은것임
							//
							//      for (var prop in obj) {
							//           console.log(prop)       //  a  |  b  |  c
							//      }
							//
							//      for (var prop in obj) {
							//           console.log(obj[prop]); //  1  |  2  |  3
							//      }
							
							// -----------------------------------------------------------------	
							
							// < for ...of (배열 순환) >
							//   for(변수 of 배열)
							//   ▶ 변수       -> 배열안에 들어있는 갯수만큼 해당 아이템들이 나온다.	
							
							//      var arr = [1, 2, 3];
							//
						    //      → var item 변수명 지은것임
							//
                            //      for (var item of arr) {
                            //          console.log(item);    //  1  |  2 |  3
                            //      }
							//
							//   for(변수 in 배열)
							//   ▶ 변수       -> 배열안의 갯수만큼 각각의 인덱스가 나온다.
							
							//     for (var item in arr) {
                            //         console.log(item);     //  0  |  1  | 2
                            //     }
							// -----------------------------------------------------------------	
							for(row of data.dept){ // ▶ row 변수명 지음 
								                   //   dept가 배열이니까 of를 쓴다.
								                   //   그래야 아이템을 가져올 수 있으니까.
								                   //   아이템은 객체로 되어있으니
								                   //   아래서 사용할때
								                   //   속성명으로 접근해서 사용할 수 있다.
								                   //   가지고 있는 배열의 갯수만큼 반복해서 실행된다.
                                // tr을 엘리먼트를 만들면서
                                // tr안에 td를 만들고 
                                // td안에 데이터를 넣는다.
                                // 그리고, tr을 tbody안에 넣는다.
								$('<tr/>')
									.append($('<td/>').text(row.deptno))
									.append($('<td/>').text(row.dname))
									.append($('<td/>').text(row.loc))
								.appendTo(tbody);	
								
							}  
							// 위에서 클릭시 #content에 #list 내용이 붙혀져 있는 상태로 해놨기 때문에
							// 이미 <div id="list"> 안에 들어있는 코드가 있기에
							// table 태그가 이미 존재하기에
							// append사용이 가능하다.
							// (html요소생성이 더 먼저 위에서 되어있기 때문에 
							//  '#content table'를 잡을 수 있고,
							//   append사용이 가능하다.)
							$('#content table').append(tbody);
							                                              
						},
						// ▶ 실패했을때 콜백
						//   → 인자 3개
						//     ● XHR         (XMLHttpRequest), 
						//     ● Status 상태 (error라는 문자열 떨어짐 | 상태코드 성공여부확인)
						//     ● 에러메시지
						error : function(xhr, status, throwMsg){
							// 에러났을때 여기다가 사용자한테 보이게 해주면 된다.
							// 예를 들면 잘못된 접속입니다. 이렇게 화면에 보여지게 할 수 있다.
							console.log(xhr, status, throwMsg); // 객체나오고 , 'error', 'Internal Server Error'
						}
					});
					// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■		
				});
		
	});
	
	function showPopup(){
		// ▶ 팝업창 보이게 하기
		$('#popup').css('display','block');
		// 앵커태그가 원래는 페이지이동을 하는데
		// 그것을 막는 기능
		// 진짜 같은 창
		// 여기서는 목적이 클릭해서 팝업창을 띄우는 목적이지
		// 페이지 이동이 목적이 아니다.
		// 그래서 기본기능을 막는다.
		return false;
	}



</script> 

</head>
<body>
	<% System.out.println("페이지 로딩..."); %>
	<div class="container"> 
		<div id="menu">
			<!-- 단 한번만 페이지 로딩됨 -->
			<a href="#home">[ HOME ]</a>
			<a href="#dept">[ LIST ]</a>
		</div>
		<div id="content">
		    <!-- ▶ 싱글페이지 어플리케이션 
		    	   : 페이지 전환은 이루어지지 않으나, 
		    	     실질적인 주소변경은 일어나지 않는데, 
		    	     보여지는 페이지 전환은 일어난다.
		    	     
		    	     여기서는 해당 div를 비워놓고,
		    	     div안에 넣고 싶은 내용을 계속 넣으면서
		    	     코드 재사용을 통해서 구현한다.
		    -->
			<!-- <h1>환영합니다.</h1>
			<p>한 회계연도를 넘어 계속하여 지출할 필요가 있을 때에는 정부는 연한을 정하여 계속비로서 국회의 의결을 얻어야 한다. 국무총리는 대통령을 보좌하며, 행정에 관하여 대통령의 명을 받아 행정각부를 통할한다.</p>
			<p>대한민국의 국민이 되는 요건은 법률로 정한다. 국회의원이 회기전에 체포 또는 구금된 때에는 현행범인이 아닌 한 국회의 요구가 있으면 회기중 석방된다.</p>
			<p>헌법에 의하여 체결·공포된 조약과 일반적으로 승인된 국제법규는 국내법과 같은 효력을 가진다. 국가안전보장에 관련되는 대외정책·군사정책과 국내정책의 수립에 관하여 국무회의의 심의에 앞서 대통령의 자문에 응하기 위하여 국가안전보장회의를 둔다.</p>
			<p>국토와 자원은 국가의 보호를 받으며, 국가는 그 균형있는 개발과 이용을 위하여 필요한 계획을 수립한다. 국가는 균형있는 국민경제의 성장 및 안정과 적정한 소득의 분배를 유지하고, 시장의 지배와 경제력의 남용을 방지하며, 경제주체간의 조화를 통한 경제의 민주화를 위하여 경제에 관한 규제와 조정을 할 수 있다.</p>
			<p>법관이 중대한 심신상의 장해로 직무를 수행할 수 없을 때에는 법률이 정하는 바에 의하여 퇴직하게 할 수 있다. 국회의원은 현행범인인 경우를 제외하고는 회기중 국회의 동의없이 체포 또는 구금되지 아니한다.</p>
			<p>모든 국민은 소급입법에 의하여 참정권의 제한을 받거나 재산권을 박탈당하지 아니한다. 군인은 현역을 면한 후가 아니면 국무위원으로 임명될 수 없다.</p> -->
		</div>
	</div>
	
	<!-- ▶ 얘는 숨길 것임 -->
	<div id="backup">
		<div id="home">
			<h1>환영합니다.</h1>
			<p>한 회계연도를 넘어 계속하여 지출할 필요가 있을 때에는 정부는 연한을 정하여 계속비로서 국회의 의결을 얻어야 한다. 국무총리는 대통령을 보좌하며, 행정에 관하여 대통령의 명을 받아 행정각부를 통할한다.</p>
			<p>대한민국의 국민이 되는 요건은 법률로 정한다. 국회의원이 회기전에 체포 또는 구금된 때에는 현행범인이 아닌 한 국회의 요구가 있으면 회기중 석방된다.</p>
			<p>헌법에 의하여 체결·공포된 조약과 일반적으로 승인된 국제법규는 국내법과 같은 효력을 가진다. 국가안전보장에 관련되는 대외정책·군사정책과 국내정책의 수립에 관하여 국무회의의 심의에 앞서 대통령의 자문에 응하기 위하여 국가안전보장회의를 둔다.</p>
			<p>국토와 자원은 국가의 보호를 받으며, 국가는 그 균형있는 개발과 이용을 위하여 필요한 계획을 수립한다. 국가는 균형있는 국민경제의 성장 및 안정과 적정한 소득의 분배를 유지하고, 시장의 지배와 경제력의 남용을 방지하며, 경제주체간의 조화를 통한 경제의 민주화를 위하여 경제에 관한 규제와 조정을 할 수 있다.</p>
			<p>법관이 중대한 심신상의 장해로 직무를 수행할 수 없을 때에는 법률이 정하는 바에 의하여 퇴직하게 할 수 있다. 국회의원은 현행범인인 경우를 제외하고는 회기중 국회의 동의없이 체포 또는 구금되지 아니한다.</p>
			<p>모든 국민은 소급입법에 의하여 참정권의 제한을 받거나 재산권을 박탈당하지 아니한다. 군인은 현역을 면한 후가 아니면 국무위원으로 임명될 수 없다.</p>
		</div>
		<div id="list">
			<h1>리스트페이지</h1>
			<table>
				<thead>
					<tr>
						<th>deptno</th>
						<th>dname</th>
						<th>loc</th>
					</tr>
				</thead>
			</table>
			<!-- <a href="#">입력</a>  ▶  데이터베이스 새로운 행을 insert할 수 있는 팝업창과 연결시켜준다. -->
			<a href="#">입력</a>
		</div>
	</div>
	
	<div id="popup">
		<div>
			<h2>입력페이지</h2>
			<!-- form 태그에 enctype="application/x-www-form-urlencoded" 기본 내장되어있음 -->
			<!-- 
				▶ 싱글페이지 어플리케이션
				  <form action="insert.jsp"> 로 하면 페이지가 이동되니,
				  난 그것을 원하지 않는다. 
				  페이지 이동없이 → 한 페이지에서 모든걸 하길 원함.
				  그래서 여기다가 <form action="#"> 로 적고
				  
				  자바스크립트 코드에서 
				  $('#popup form') 을 잡고 → id="popup" 아래 <form>태그
				  form태그의 페이지 이동하는 submit이벤트를 재정의한다. 
				  ▶ .submit() 이벤트에 콜백함수를 재정의한다.
				  
				  기존의 있던 기능은 페이지이동이라 
				  내가 의도하는 바와 다르기 때문에
				  재정의를 한다.
			 -->
			<!-- #의 동작은 양식이 동일한 페이지에 머무른다. -->
			<form action="#">
				<div>
					<!-- name : ▶ 파라미터 이름 정하는 것              -->
					<!--          deptno  (파라미터 이름을 해당으로 정했으니, 파라미터 받는 곳에서 deptno로 받으면 된다.) -->
					<!--          ▶ input창에 입력하는 것이 파라미터의 전달값이 된다. -->
					<label for="deptno">deptno</label><input type="text" name="deptno" id="deptno" />
				</div>
				<div>
					<label for="dname">dname</label><input type="text" name="dname" id="dname" />
				</div>
				<div>
					<label for="loc">loc</label><input type="text" name="loc" id="loc" />
				</div>
				<div>
					<button type="submit">입력</button>
					<button type="reset">취소</button>
					<button type="button">닫기</button>
				</div>
			</form>
		</div>
	</div>
	
</body>
</html>