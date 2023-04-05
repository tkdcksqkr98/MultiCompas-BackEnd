<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 스크릿트릿
	JSONObject json = new JSONObject();
	json.put("wea", "raining"); // {name : hong}
	json.put("temp", 13); // {age : 100}
	json.put("hu", 89); // {id : apple}

	

	%> <%=json.toJSONString() %>