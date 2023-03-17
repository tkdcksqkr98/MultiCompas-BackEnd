<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	GradeDAO dao = new GradeDAO();
//.5,6) dao가 리턴한 BbsVO가 들어간 Arraylist를 받는다.
ArrayList<GradeVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
전체 성적 갯수: <%= list.size() %>
<% if(list.size() == 0) { %>
<h3>등록된 성적 없습니다.</h3>
<img src="img/x.png" width ="200" height ="250">
<% }else{ %>
	<table class="table table-dark table-striped">
		<tr>
			<td>id</td>
			<td>subject</td>
			<td>score</td>
			<td>name</td>
			<td>img</td>
		</tr>
		<%
			for (GradeVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td>
			<!--one3.jsp?id=102  -->
			<a href="one5.jsp?id=<%=bag2.getId()%>">
			<%= bag2.getSubject() %>
			</a>
			</td>
			<td><%=bag2.getScore() %></td>
			<td><%=bag2.getName() %></td>
			<td><%=bag2.getImg() %></td>
		</tr>
		<%  }//for  %> 
	</table>
	<%} //else %>
</body>
</html>