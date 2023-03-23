<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //입력한값 받아오기.
    String dollar = request.getParameter("dollar");
	int dollar2 = Integer.parseInt(dollar);
	int won = 1283;
	int result = dollar2 * won;
    
    %><%= result %>
