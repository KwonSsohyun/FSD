<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Internationalization</title>
</head>
<body>
	<p> 숫자 : <fmt:formatNumber value="3200100" />	
	<p> 기본값(천단위구분): <fmt:formatNumber value="3200100" type="number" />
	<p> 기본값(천단위안함): <fmt:formatNumber value="3200100" type="number" groupingUsed="false" />	
	<p> 기본값(천단위구분, 통화기호 기본 포함): <fmt:formatNumber value="3200100" type="currency" groupingUsed="true" />
	<p> 기본값(천단위구분, 통화기호 설정): <fmt:formatNumber value="3200100" type="currency" currencySymbol="&#8361;" />	 
	<p> 기본값(비율로 표현): <fmt:formatNumber value="0.45" type="percent" />
	<p> 정수 최소 10자리 표현, 소수점 2자리 표현: <fmt:formatNumber value="3200100" minIntegerDigits="10" minFractionDigits="2" />
	<p> 소수점 3자리표현. 빈 곳은 0으로 표시: <fmt:formatNumber value="3200100.45" pattern=".000" />
	<p> 천단위 구분.소수점 두 자리 수까지 표현. 세번째서 반올림: <fmt:formatNumber value="3200155.456" pattern="#,#00.0#" />
</body>
</html>