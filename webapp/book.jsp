<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="list3">모든 회원정보 가지고 오기</a>
<h3>데이터를 입력하세요 </h3>
<hr color="red">
<form action="one4.multi" method="get">
	id : <input name="id" value="1" ><br>
	<button type="submit" >서버로 전송</button>
</form>
</body>
</html>