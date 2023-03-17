<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	
    	GradeDAO dao = new GradeDAO();
    	GradeVO bag2 = dao.one(Integer.parseInt(id));
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 id는  <%= id %>
<hr color="red">
<table class="table table-danger table-striped">
<tr>
<td>성적 id</td>
<td><%= bag2.getId() %></td>
</tr>
<tr>
<td>과목명</td>
<td><%= bag2.getSubject() %></td>
</tr>
<tr>
<td>점수</td>
<td><%= bag2.getScore() %></td>
</tr>
<tr>
<td>이름</td>
<td><%= bag2.getName() %></td>
</tr>
<tr>
<td>이미지</td>
<td>
<img src="img/<%= bag2.getImg() %>" width="150" height="150">
</td>
</tr>
</table>
</body>
</html>