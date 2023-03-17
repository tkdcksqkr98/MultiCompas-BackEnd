<%@page import="multi.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <jsp:useBean id="bag" class="multi.GradeVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    
    <%
    	
        GradeDAO dao = new GradeDAO();
        dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
성적이 입력되었습니다.!!<br>
</body>
</html>