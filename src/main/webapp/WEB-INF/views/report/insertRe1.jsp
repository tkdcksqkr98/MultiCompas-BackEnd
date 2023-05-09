<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../../../header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr color="red">

<h3>정보등록 </h3>
<hr color="red">
<form action="insertRe" method="get">
	제목 : <input name="number" value="011"><br>
	내용 : <input name="writer" value="1234"><br>
	작성자 : <input name="animal" value="park"><br>
	작성자 : <input name="content" value="park"><br>
	<button type="submit">등록</button>
</form>
<hr color="red"> 
</body>
</html>