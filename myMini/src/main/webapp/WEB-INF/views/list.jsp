<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.multi.mini.ReportVO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-3">
  <h3>유기동물 신고페이지</h3>
  <a href="insert">
             <button type="submit" class="btn btn-primary">등록</button>
             </a>
   <table class="table">
    <thead class="table-success">
	<tr>
        <th>번호</th>
        <th>제목</th>
        <th>내용</th>
        <th>작성자</th>
    </tr>
 </thead>
 <tbody>
		<c:forEach items="${list}" var="vo"> 

<tr>
				<td class="down">${vo.no}</td>
				<td class="down">${vo.title}</td>
				<td class="down">${vo.content}</td>
				<td class="down">${vo.writer}</td>
			</tr>

		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>