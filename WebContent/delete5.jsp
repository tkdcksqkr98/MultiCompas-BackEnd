<%@page import="multi.GradeDAO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest();
    	//car.run();
    	String id = request.getParameter("id"); //외부에서 전달되는 것은 String
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    	
    	
    	GradeDAO dao = new GradeDAO();
    	dao.delete(Integer.parseInt(id));
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 삭제를 원하는 id는  <%= id %>
</body>
</html>