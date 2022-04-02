<%@page contentType="text/html; charset=utf-8"%>
<%@page import="org.apache.commons.fileupload.*"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<html>
<head>
<title>File Upload</title>
</head>
<body>
	<%
		// ▶ 현재 파일 위치의 상대경로 지정가능
		//  String savePath = application.getRealPath("파일을 저장할 폴더");
	    //  예시: String savePath = application.getRealPath("\product");
		String fileUploadPath = "C:\\uploadts" ;
		
  		// ▶ 파일업로드를 위해 객체 생성
  		//  디렉토리 없으면 자동 디렉토리(폴더) 생성해줌
		DiskFileUpload upload = new DiskFileUpload();
  		// ▶ 폼페이지에서 전송된 요청 파라미터를 가져오기
  		//  parseRequest 분해
		List items = upload.parseRequest(request);
  		// ▶ 요청 파라미터를 모아놓은 items배열객체를 가져오기 쉽게 iterator객체로 변환함.
		Iterator params = items.iterator();

		while (params.hasNext()) {
			FileItem fileItem = (FileItem) params.next();
			// out.println(fileItem);
			if (!fileItem.isFormField()) {
				String fileName = fileItem.getName();
				out.println("fileName:  "+fileName);
				fileName = fileName.substring(fileName.lastIndexOf("\\") + 1); // \\ == \
				File file = new File(fileUploadPath + "/" + fileName);
				// 파일이 실제로 업로드 되는 시점
				fileItem.write(file);
			}else{
				// 필드 이름
				 String name = fileItem.getFieldName(); 
				// 필드 값, 한글 인코딩
                 String value = new String((fileItem.getString()).getBytes("8859_1"),"utf-8"); 
				out.print( name+": "+ value +"<br>" );
			}
		}
	%>
</body>
</html>