
<!-- 페이지 디렉토리 ⇒⇒ 클래스밖에 명세되야될것들-->
<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%> <!-- ▶▶ 엔코딩 타입 동일해야함 : 컨텐츠타입 - 브라우저해석(해더에 정보 보냄)-->
<%@ page pageEncoding="UTF-8"%> <!-- ▶▶ 엔코딩 타입 동일해야함 : 자바에서 해석(자바는 유니코드기본으로 사용함)-->
<%@ page import = "java.lang.*" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <!-- ▶▶ 엔코딩 타입 동일해야함 : 브라우저 해석(브라우저내용 전달)--> <!-- 브라우저창에 노출해라 -->
<title>Insert title here</title>
</head>
<body>
	<h1>내용</h1>
	<%! 
		// 선언부 ⇒⇒ 필드 (클래스 안이면서, main메서드 밖)
		// : 자바의 메서드 "정의" 하는 곳 -> 호출은 스트립트립에서!
		// 클래스 명을 모르니 접근제한자가 필요없다.
		// non-static 이다.
		public static void func(){
			System.out.println("호출");
		}
		public void func1(){ 
			System.out.println("호출");
		}
		void func2(){ 
			System.out.println("호출");
		}
		public static int su=1234; // 변수선언 가능
		public int su1=1234;
		int su2=1234;
	%>
	
	<%
		// 스크립트릿 (자바의 코드 들어감) ⇒⇒ main메서드 안
		// 메인이 아님 메서드 - 쓰래드의 run느낌
		// 내장 객체 - 스크립트릿에서 제공되는 참조변수 (스크립트릿에서만 쓸 수 있음 | 선언부에서 못씀)
		func();
		func1(); // non-static 도 가능하나 의미가 없다.
	%>
</body>
</html>