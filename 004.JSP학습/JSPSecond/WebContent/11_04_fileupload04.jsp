<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>File Upload</title>
</head>
<body>

	<form name="fileForm" method="post" enctype="multipart/form-data" action="11_04_fileupload04_process.jsp">
		<fieldset>
		<legend>파일 업로드 폼</legend>
		<p>	이 름  : <input type="text" name="name"></p>
		<p>	제 목 : <input type="text" name="subject"></p>
		<p>	파 일 : <input type="file" name="filename"></p>
		<p>	<input type="submit" value="파일 올리기"></p>
		</fieldset>
	</form>
</body>
</html>