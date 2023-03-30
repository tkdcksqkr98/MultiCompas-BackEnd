<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
게시판검색 처리 요청이 완료되었습니다<br>
${bag.no} <br><!-- 출력용(expresstion language-EL -->
${bag.title} <br>
${bag.content} <br>
${bag.writer} <br>
</body>
</html>