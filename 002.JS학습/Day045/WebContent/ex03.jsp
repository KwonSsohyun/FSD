<?xml version="1.0" encoding="UTF-8"?>

<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>

<students>
<%	
	// 파라미터 받기
	// 주소창 ▶ http://localhost:8080/Day045/ex03.jsp?cnt=1
	//          → ?cnt=몇번나타낼지숫자입력
	// int cnt = 5;
	int cnt=Integer.parseInt(request.getParameter("cnt"));

	for(int i=0; i<cnt; i++){
%>
	   <student>
	      <num><%=i %></num>
	      <name>user<%=i %></name>
	      <kor><%=i+90 %></kor>
	      <eng><%=i+80 %></eng>
	      <math><%=i+70 %></math>
	   </student>
<%
	}
%>
</students>