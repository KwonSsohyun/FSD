<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단 출력</h1>
	<p>표에 담아서 출력</p>
	<table border=1>
	<% // 자바 소스코드 작성
			
	
		for(int j=1; j<10; j++){
		    out.println("</tr>");
			for(int i=2; i<10; i++){
				out.print("<td>"+i+"x"+ j +"="+(i*j)+"</td>");
			}
			out.println("</tr>");
		}

	    // -------------------------------------------------
	    
	    // int sum;
	    
		// for(int i=1; i<=9; i++){
			// out.print("<tr>");
			
			// for(int j=1; j<=9; j++){
				// out.print("<td>");
				// sum = i*j;
				// out.print(j + "x" + i + "=" + sum + "   ");
				// out.print("</td>");
			// }
			// out.print("</tr>");
		// }
	%>
	</table>

</body>
</html>