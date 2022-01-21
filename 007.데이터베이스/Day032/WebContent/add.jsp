<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 기본으로 나오는 페이지는 디폴트가 뜨는 이름이 "index" -->
	
	<table align="center" width="1130"> <!-- 표 가운데 배치 -->
		<tr> <!-- 1 줄 -->
			<td colspan="6"><img src="imgs/img01.png"></td> <!-- 이미지 테이블에 붙히기 -->
			<!-- 밀리니까 -> 가로 6칸 다먹게 -->
		</tr>
		<tr> <!-- 2 줄 -->
			<td><img src="imgs/img02.png"></td>
			<!-- <td><img src="imgs/img04.png"></td> -->
			<td align="center" width = "184" background="imgs/img03.png"><a href="index.jsp">[ HOME ]</a></td> <!-- 이미지를 백그라운드로 깐다. -->
			<td align="center" width = "184" background="imgs/img04.png"><a href="intro.jsp">[ INTRO ]</a></td>
			<td align="center" width = "184" background="imgs/img05.png"><a href="list.jsp">[ B B S ]</a></td>
			<td align="center" width = "184" background="imgs/img06.png"><a href="guest.jsp">[ GUEST ]</a></td>
			<td><img src="imgs/img02.png"></td>

		</tr>
		<tr> <!-- 3 줄 -->
			<td colspan="6"> <!-- 본문 내용넣을거니까 -> 가로 6칸 다먹게 -->
			<!-- content start -->
			<h1>입력 페이지</h1>
			
			<form action = "insert.jsp"> <!-- 버튼 누르면 값담아서 해당 jsp로 값 넘겨줌 -->
				<table align="center">
					<tr>
						<td width="90">제목</td>
						<td><input type="text" name="sub" size="50"></td>
					</tr>
					<tr>
						<td colspan="2"><textarea rows="10" cols="50" name="content"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center"> <!-- colspan="2"-> 2칸으로 쓰겠다. -->
							<input type="submit" value="입 력">
							<input type="reset" value="취 소"> <!-- input type="reset"  | 값초기화 -->
					    </td>
					</tr>
				</table>
			</form>
			
			
			
			<!-- content end -->
			</td>
		</tr>
		<tr> <!-- 4 줄 -->
			<td colspan="6"><img src="imgs/img08.png"></td>  <!-- 밀리니까 -> 가로 6칸 다먹게 -->
	
		</tr>
	</table>
	
	
</body>
</html>