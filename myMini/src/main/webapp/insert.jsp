<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.multi.mini.ReportVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="resources/css/main.css" />
</head>
<body>
<hr color="red">

<h3>신고등록 </h3>
<hr color="red">
<form action="insert" method="get">
	제목 : <input name="title" value="011"><br>
	내용 : <input name="content" value="1234"><br>
	작성자 : <input name="writer" value="park"><br>

             <button type="submit" class="btn btn-primary">삭제하기</button>
            
</form>






<hr color="red"> 
</body>
</html>