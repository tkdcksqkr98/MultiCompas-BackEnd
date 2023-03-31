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

<img src="https://shop-phinf.pstatic.net/20220630_211/1656572837868qQo2T_JPEG/%EB%A6%AC%EB%B9%99%EA%B3%A0%EC%A0%95%EB%B0%B0%EB%84%88_%EB%89%B4%EB%B2%A0_%EC%B0%BD%EC%9E%91%EA%B3%B5%EB%B0%A9.jpg?type=w860"
width="200" height="200">
<% 
	if(session.getAttribute("id") != null){ //로그인이 성공
%>
	<a href="bbb"><button>공동구매 참여</button></a>

<%}else{ %> <!--로그인 실패  -->
	<a href="login.jsp">로그인페이지로</a>
<%} %>
</body>
</html>