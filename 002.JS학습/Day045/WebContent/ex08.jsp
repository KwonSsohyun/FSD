{"student":[
   <%
   for(int i=100;i<106;i++){
      if(i!=100)out.print(",");
   %>
	   {"num":<%=i %>,"name":<%="\"user"+i+"\""%>,"kor":<%=90+i-100%>,"eng":<%=80+i-100%>,"math":<%=70+i-100%>}

   <%} %>
]}
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
