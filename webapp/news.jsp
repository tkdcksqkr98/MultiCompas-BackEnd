<%@page import="com.multi.mvc01.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<% if(session.getAttribute("id") == null){ %>
<%}else{ %>
<img src="https://imgnews.pstatic.net/image/024/2023/03/30/0000080990_001_20230331134601036.jpg?type=w647"
width="150" height="150">
	<form action="aaaa">
		댓글<input name="reply">
			<button>댓글달기</button>
	</form>

<%} %>
</body>
</html>