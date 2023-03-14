<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //스크립트릿 - 조금 코드를 써서 만드는 작은 프로그램
    //자바코드 넣는 부분!!
    //HttpsServletRequest request = new HttpsServletRequest(); 
    //teomcat은 미리 requset를 만들어서 내장시켜놨어요!
    String id = request.getParameter("id"); //"apple"
    
    %>
    <!--3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음.  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: orange;
	}

</style>
</head>
<body>
회원탈퇴가 요청되었음.
<hr color ="red">
탈퇴한 id : <%= id %> <br>
</body>
</html>