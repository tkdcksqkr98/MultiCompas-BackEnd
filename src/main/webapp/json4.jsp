<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 스크릿트릿
	JSONObject json = new JSONObject();
	json.put("high", 70000); // {name : hong}
	json.put("low", 65000); // {age : 100}
	json.put("end", 68000); // {id : apple}

	JSONObject json2 = new JSONObject();
	json2.put("high", 75000); // {name : hong}
	json2.put("low", 63000); // {age : 100}
	json2.put("end", 74000); // {id : apple}
	
	// 두개를 한번에 묶어서 보내야 하므로 '배열' 을 사용한다.
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	

	%> <%=array.toJSONString() %>