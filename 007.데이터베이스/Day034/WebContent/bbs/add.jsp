<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="0" width="800" align="center" cellspacing="0"> <!-- cellspacing="0" ▶ 간격 안붙게 이미지 다 붙힘 -->
		<tr> <!--************************************* 상단 *************************************-->
			<td colspan="5">
				<img alt="logo" src="../imgs/logo.png"> <!-- ../ -> 한뎁스 올라가서 찾음 -->
			</td>
		</tr>
		<tr> <!--************************** GNB (Global Navigation Bar) **************************-->
			<td background="../imgs/bg.png"></td> <!-- ../ → 한번 올라가서 이미지를 찾겠다. -->
			<td background="../imgs/bg.png" align="center" width="100"><a href="../index.jsp">[ HOME ]</a></td> <!-- ../ -> 한뎁스 올라가서 찾음 -->
			<td background="../imgs/bg.png" align="center" width="100"><a href="./list.jsp">[ BBS ]</a></td> <!-- ▶ bbs라는 폴더 안에 들어가서 할거임(한뎁스내려감) --> <!-- ./ 현재 디렉토리에서 찾음 -->
			<td background="../imgs/bg.png" align="center" width="100"><a href="../login/form.jsp">[ LOGIN ]</a></td>
			<td background="../imgs/bg.png"></td>
		</tr>
		<tr> <!--************************************* 내용 *************************************-->
			<td colspan="5" align="center">
				<h1>게시판 입력</h1>
				<form action="insert.jsp" method="post"> <!-- post 통신방식씀 -->
					<table>
						<tr>
							<td bgcolor="#dddddd">제목</td>
							<td>
								<input type="text" name="sub">
							</td>
						</tr>
						<tr>
							<td bgcolor="#dddddd">글쓴이</td>
							<td>
								<input type="text" name="id">
							</td>
						</tr>
						<tr>
							<td colspan="2">
							    <!-- rows="6" cols="25" ▶ 가로로 25자 / 세로로 6줄  -->
								<textarea rows="6" cols="25" name="content"></textarea> 
							</td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="입 력">
								<input type="reset" value="취 소">
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
		<tr> <!--************************************* 푸터 *************************************-->
			<td colspan="5" align="center">
				<img alt="footer" src="../imgs/footer.png"> <!-- ../ → 한번 올라가서 이미지를 찾겠다. -->
			</td>
		</tr>
		
	</table>
</body>
</html>