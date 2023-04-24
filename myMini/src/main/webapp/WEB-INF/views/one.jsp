<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
정보검색이 요청됨.
<!-- 속성으로 지정한 값은 EL로 프린트 -->
<hr color="red">
${vo.no} <br>
${vo.title} <br>
${vo.content} <br>
${vo.writer} <br>
</body>
</html>