<%@page import="com.multi.mvc300.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}

td {
	width: 100px;
	text-align: center;
}

.top {
	background: black;
	color: white;
}

.down {
	background: lime;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td class="top">id</td>
			<td class="top">pw</td>
			<td class="top">name</td>
			<td class="top">favorite</td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

<tr>
				<td class="down">${bag.id}</td>
				<td class="down"><a href="one4.multi?id=${bag.id}">${bag.pw}</a>
				</td>
				<td class="down">${bag.name}</td>
				<td class="down">${bag.favorite}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>