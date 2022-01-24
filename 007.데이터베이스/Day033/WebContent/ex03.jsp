<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  
		java.util.Enumeration<String> head = request.getHeaderNames();
		
		while(head.hasMoreElements()){
			String name = head.nextElement();
			String[] values = request.getParameterValues(name);
			System.out.println(name + ":" + java.util.Arrays.toString(values));
		}
	
	
		// ▶ GET 방식  → 일반적 주소에 치고 접근
		// ▶ POST 방식 → 숨겨서 전달 (주소표시줄 안나옴)
		String method = request.getMethod();
	    // 이것만 실행시키면 전달해주는게 없으니 null이라 뜬다.
	    // ex02에서 실행시키고 값입력 없이 넘기면 빈문자열 간다. (is empty)
		String ename = request.getParameter("ename");
		String empno = request.getParameter("empno");
		System.out.println("ename : " + ename);
		System.out.println("empno : "+ empno);
		System.out.println(method);
		
		
		// 넘어오는 파리미터이름 확인 >> request.getParameterNames()
		// 넘어오는게 뭐인지 항목 확인할때
		// 자료구조 백터사용(동적할당 - 자바최초부터 존재) Enumeration
		java.util.Enumeration<String> enu = request.getParameterNames();
		
	    // ▶▶ 한개의 값 보여줌
		// while(enu.hasMoreElements()){
			// String msg = enu.nextElement();
			// System.out.println(msg + ":" + request.getParameter(msg));
			// System.out.println(enu.nextElement());
		// }
		
		// ▶▶ 여러개 체크했을때 값 다 보고 싶을때
		// String[] chk = request.getParameterValues("chk");
		// System.out.println(java.util.Arrays.toString(chk)); // [i2, i3] 여러개 체크한만큼 배열로 넘어옴
		
		// 위에서 봤듯이 한개의 값이어도 []배열
		// 키값 호출하면 벨류값 얻어낼 수 있다. -> MAP
		// java.util.Map<String, String[]> map = request.getParameterMap();
		// String[] chk = map.get("chk");
		// System.out.println(java.util.Arrays.toString(chk));
		
		
		
		
	%>
</body>
</html>