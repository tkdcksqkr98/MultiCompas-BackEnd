<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>성적 전체 검색 화면입니다. </h3>
<a href="list4">모든 성적정보 가지고 오기</a>

<h3>성적기입 화면입니다. </h3>
<hr color="red">
<form action="insert4.multi" method="get">
	id : <input name="id" value="11"><br>
	subject : <input name="subject" value="과학"><br>
	score : <input name="score" value="70"><br>
	name : <input name="name" value="김길동"><br>
	img : <input name="img" value="100.png"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>성적수정 화면입니다. </h3>
<hr color="red">
<form action="update3.multi" method="get">
	id : <input name="id" value="11"><br>
	name : <input name="name" value="황길동"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>성적 삭제 화면입니다. </h3>
<hr color="red">
<form action="delete3.multi" method="get">
	id : <input name="id" value="11"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>성적 검색 화면입니다. </h3>
<hr color="red">
<form action="one5.multi" method="get">
	id : <input name="id" value="11"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>