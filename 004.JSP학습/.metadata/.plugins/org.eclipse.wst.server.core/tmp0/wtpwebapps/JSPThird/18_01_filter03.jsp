<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import="java.util.*" %>
<html>
<head><title>NullParameterFilter 테스트</title></head>
<body>
id 파라미터 : <%= request.getParameter("id") %> <br>
name 파라미터 : <%= request.getParameter("name") %> <br>
member 파라미터 : <%= request.getParameter("member") %> <br>

<% 
String[] str1= request.getParameterValues("id");
String[] str2= request.getParameterValues("name") ;

%> <br>
id 파라미터 : <%= str1[0] %> <br>
name 파라미터 : <%= str2[0] %> <br>
</body>
</html>