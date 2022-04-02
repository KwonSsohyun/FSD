<%@page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>File Upload</title>
</head>
<body>
<h2>commons를 이용한 파일 업로드</h2>
<p>업로드할 디렉토리가 없으면 자동으로 생성됨.</p>
<p>- commons-fileupload-버전.jar, commons-id-버전.jar파일 필요</p>
<dl>
<p>commons-fileupload-버전-bin.zip파일 다운 경로 : 
<a href="https://commons.apache.org/proper/commons-fileupload/download_fileupload.cgi" target="_blank">다운받기</a></p>
<p>commons-io-버전-bin.zip파일 다운 경로 : 
<a href="https://commons.apache.org/proper/commons-io/download_io.cgi" target="_blank">다운받기</a></p>
</dl>
	<form action="11_03_fileupload03_process.jsp" method="post" enctype="multipart/form-data">
		<fieldset>
			<legend>파일 업로드 폼</legend>
			<p>	이 름  : <input type="text" name="name"></p>	
			<p>	제 목 : <input type="text" name="subject"></p>
			<!-- 다중파일 업로드 속성: multiple="multiple" -->
			<p>	파 일 : <input type="file" name="filename" multiple="multiple" ></p>	
			<p>	<input type="submit" value="파일 올리기"> </p>
		</fieldset>
	</form>
</body>
</html>
