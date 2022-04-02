<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 에러 화면</title>
</head>
<body>
   <table>
      <tr>
         <td>
            <b>arithmeticError 기본 에러 화면입니다.</b>
         </td>
      </tr>
   </table>
   <br>
   <!-- 에러 메세지 -->
   <table>
      <tr>
         <td>
            <br><br><br><br><br>
            Message : ${exception.message}
            <br><br><br><br><br>
         </td>
      </tr>
   </table>
</body>
</html>