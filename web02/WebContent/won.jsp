<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //입력한값 받아오기.
    String won = request.getParameter("won");
	int won2 = Integer.parseInt(won);
	int dollar = 1283;
	int result = won2 / dollar;
    
    %><%= result %>
