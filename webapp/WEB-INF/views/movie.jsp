<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  computer호출했을 때 결과담는 곳!
-->
<table border=1>
<tr>
	<td style="background: lime; font-size: 20px; width: 150px; height: 50px;">영화제목</td>
	<td style="background: lime; font-size: 20px; width: 150px; height: 50px;">영화가격</td>
</tr>
<tr>
	<td style="background: pink; font-size: 20px; width: 150px; height: 50px;">${vo.name}</td>
	<td style="background: pink; font-size: 20px; width: 150px; height: 50px;">${vo.price}원</td>
</tr>
<tr>
	<td>
	<a href="문자인증받기">문자인증받기</a>
	</td>
</tr>
</table>