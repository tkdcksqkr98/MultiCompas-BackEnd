<%@page import="com.multi.mvc01.BookVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: pink;
}
td{
	width: 100px;
	text-align: center;
}
.top{
	background: gray;
	color: white;
}
.down{
	background: lime;
}
</style>
</head>
<body>
<!--  표현식(expression) --> 
회원검색 처리 요청이 완료되었습니다.<br>
<!-- bag.getId()  -->
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->
<!-- 	for (String s : list) {
			
		}
 -->
<table>
<tr>
	<td class="top">id</td>
	<td class="top">subject</td>
	<td class="top">score</td>
	<td class="top">name</td>
	<td class="top">img</td>
</tr>
<%-- <% 
	ArrayList<BookVO> list = (ArrayList<BookVO>)request.getAttribute("list");
    for(BookVO bag: list){
%>
<tr>
	<td class="down"><%= bag.getId() %></td>
	<td class="down">
		<a href="one2.multi?no=<%= bag.getId() %>"><%= bag.getName() %></a>
	</td>
	<td class="down"><%= bag.getUrl() %></td>
	<td class="down"><%= bag.getImg() %></td>
</tr>
<%} %> --%>

 <c:forEach items="${list}" var="bag"> 
<
<tr>
	<td class="down">${bag.id}</td>
	<td class="down">
		<a href="one5.multi?no=${bag.id}">${bag.subject}</a>
	</td>
	<td class="down">${bag.score}</td>
	<td class="down">${bag.name}</td>
	<td class="down">
	<img src="resources/img/${bag.img}"></td>
</tr> 


</c:forEach> 
</table>
</body>
</html>