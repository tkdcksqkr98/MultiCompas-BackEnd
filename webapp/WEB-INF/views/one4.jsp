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
회원검색 처리 요청이 완료되었습니다<br>
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다.  -->
${bag.id} <br><!-- 출력용(expresstion language-EL -->
${bag.name} <br>
${bag.url} <br>
<img src="resources/img/${bag.img}">
</body>
</html>