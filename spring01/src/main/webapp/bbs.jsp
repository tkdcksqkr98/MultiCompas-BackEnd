<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판가입 화면입니다. </h3>
<hr color="red">
<form action="insert2.multi" method="get">
	no : <input name="no" value="11"><br>
	title : <input name="title" value="1234"><br>
	content : <input name="content" value="park"><br>
	writer : <input name="writer" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판수정 화면입니다. </h3>
<hr color="red">
<form action="update2.multi" method="get">
	no : <input name="no" value="11"><br>
	content : <input name="content" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판탈퇴 화면입니다. </h3>
<hr color="red">
<form action="delete2.multi" method="get">
	no : <input name="no" value="11"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판검색 화면입니다. </h3>
<hr color="red">
<form action="one2.multi" method="get">
	no : <input name="no" value="11"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>