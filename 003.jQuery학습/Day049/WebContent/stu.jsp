<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"
%>{"students":[
	<%
		// ▶ 파일확장자는 jsp이지만, (자바 문법을 안에서 쓰고 있기 때문)
		//   하지만 나는 json 파일 형식으로 쓸것이다.

		//   → jsp확장자 파일이지만, 해당파일에 json문법 형식에 잘 맞게만 적었다면,
        //     json처럼 쓰고 싶다면, 해당파일 맨 위에 컨텐츠타입을 명시해줘야한다.
        //     page contentType="application/json" pageEncoding="UTF-8"
        //     이와 가져오는 타입에 맞게 컨텐츠타입을 명시해 준다면
        //     post방식이든, get방식이든 쓸 수 있다. 
	
        // -------------------------------------------------------------------------------
	
		// ▶ 파라미터 받아서 쓰기
		//   ▶ request.getParameter("전달받고자하는이름기입")
		//     → list.jsp에서 파라미터값 전달받아서 쓰고 있다.
		//       거기서 정한 파라미터 이름대로 쓴다.
		
		
		//   ▶ 문자열로 던져지니, 숫자로 받고싶으면 숫자형 변환
		int num = Integer.parseInt(request.getParameter("num"));
		// String num = request.getParameter("num");
	    // int num = 1111;
	
	    
	    //   ▶ 문자열로 던져지니 문자열로 쓸거면, 파라미터 값 받아서 쓰면 된다.
		String name = request.getParameter("name");
	    // String name = "user1";
	    
		int kor = 90;
		int eng = 91;
		int math = 92;
	%>
	{"num" : <%=num %>, "name":"<%=name %>", "kor":<%=kor %>, "eng":<%=eng %>, "math":<%=math %> }
	,{"num" : <%=num %>, "name":"<%=name %>", "kor":<%=kor %>, "eng":<%=eng %>, "math":<%=math %> }
]}

<%
// 해당 jsp파일이 list.jsp에서 잘 불러와지나 확인해보기 위해
// 콘솔창에 찍어본다.
// 해당사항이 잘 찍힌다면 잘 불러와지는 것
System.out.println("call json page");
%>
