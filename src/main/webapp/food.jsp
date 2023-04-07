<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
 body{
 background-image:url('resources/img/no2.jpg');
 }
</style>
<body>

<h3>회원등록 화면입니다. </h3>
<hr color="red">
<form action="insert4" method="get">
	id : <input name="id" value="1"><br>
	pw : <input name="pw" value="1111"><br>
	name : <input name="name" value="박상찬"><br>
	favorite : <input name="favorite" value="양식"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>회원정보수정 화면입니다. </h3>
<hr color="red">
<form action="update4" method="get">
	id : <input name="id" value="1"><br>
	favorite : <input name="favorite" value="중식"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>회원정보삭제 화면입니다. </h3>
<hr color="red">
<form action="delete4" method="get">
	id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<a href="login.jsp">
	<button style="background: pink;" >로그인 화면으로 go</button>
</a>
<hr color="red">
<a href="list4">모든 회원정보 가지고 오기</a>
<hr color="red">
<h3>회원검색 화면입니다. </h3>
<a href="one4.multi?id=1">1번 검색</a>
<form action="one4.multi" method="get">
id : <input name="id" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
</body>
</html>