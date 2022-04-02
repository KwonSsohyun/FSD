<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head><title>EL의 기본객체</title></head>
<body>
<h2>기본객체를 사용한 EL</h2>
<fmt:requestEncoding value="utf-8"/>
<!-- param.code => request.getParameter("code") 
	                            파라미터 중에 키값이 code인것
-->
<!-- ne -> not equal -->
<c:choose>
  <c:when test="${param.code ne null}">
    <p>code 파라미터: ${param.code}</p>
  </c:when>
  <c:otherwise>
    <p>code 파라미터가 없습니다.<br>쿼리스트링으로 code파라미터를 전송해주세요.</p>
  </c:otherwise>
</c:choose>
</body>
</html>
