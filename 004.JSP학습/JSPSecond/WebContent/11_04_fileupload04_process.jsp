<%@page contentType="text/html; charset=utf-8"%>
<%@page import="org.apache.commons.fileupload.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<html>
<head>
<title>File Upload</title>
</head>
<body>
	<%
		String path = "C:\\upload";

		DiskFileUpload upload = new DiskFileUpload();
		//파일최대크기 용량제한 . 최대로 업로드할수 있는 파일의 크기를 바이트 단위로 지정
		upload.setSizeMax(1000000); //1MB정도

		List items = upload.parseRequest(request);
		Iterator params = items.iterator();

		while (params.hasNext()) {
			FileItem item = (FileItem) params.next();

			if (item.isFormField()) {
				String name = item.getFieldName();
				String value = item.getString("utf-8");
				out.println(name + "=" + value + "<br>");
			} else {
				String fileFieldName  = item.getFieldName();				
				String fileName = item.getName();
				String contentType = item.getContentType();

				fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
				long fileSize = item.getSize();

				File file = new File(path + "/" + fileName);
				item.write(file);

				out.println("-----------------------------------<br>");
				out.println("요청 파라미터 이름 : " + fileFieldName  + "<br>");
				out.println("저장 파일 이름 : " + fileName + "<br>");
				out.println("파일 콘텐츠 타입 : " + contentType + "<br>");
				out.println("파일 크기 : " + fileSize);
			}
		}
	%>
</body>
</html>