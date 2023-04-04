<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url:"list2",
			success: function(x) {
				$('#result').append(x)
			}
		})
		$('#b1').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				url:"list5",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		$('#b2').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				data:{
					bbsno : 1
				},
				url:"list6",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		$('#b3').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				data:{
					bbsno : 3
				},
				url:"list6",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		$('#b4').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				data:{
					id : "apple"
				},
				url:"one5",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		$('#b5').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				data:{
					no : 1
				},
				url:"one6",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		$('#b6').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				url:"list7",
				success : function(x) {
					$('#result').append(x)
				}//success
			})//ajax
		})//b1
		$('#b7').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				url:"update3",
				data:{
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function(x) {
					$.ajax({
						url:"list2",
						success: function(x) {
							$('#result').append(x)
						}
					})
				}//success
			})//ajax
		})//b1
		$('#b8').click(function() {
			$('#result').empty()//기존의 것 삭제됨.
			$.ajax({
				url:"delete3",
				data:{
					no : $('#no2').val()
				},
				success : function(x) {
					$.ajax({
						url:"list2",
						success: function(x) {
							$('#result').append(x)
						}
					})
				}//success
			})//ajax
		})//b1
		$('#b9').click(function(){
			$.ajax({
				crossOrigin: true,
				url:'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=43238037f8f84c1b9d70369513a425e6',
				dataType : 'json',
				success: function(x){
					console.log(x);
					$('#result').html("위치"+x.name+"<br>"+
							"날씨"+x.weather[0].description+"<br>"+
							"풍속"+x.wind.speed+"<br>"+
							"최고 기온"+x.main.temp_max+"<br>"+
							"최저 기온"+x.main.temp_min+"<br>"+
							"체감 온도"+x.main.feels_like+"<br>"+
							"구름"+x.clouds.all+"<br>")
				}
			}
			})
	})//$
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>
<button id="b2">bbs번호 1번 reply리스트 가지고 오기</button>
<button id="b3">bbs번호 6번 reply리스트 가지고 오기</button>
<button id="b4">member id가 apple인사람 정보 가지고 오기</button>
<!-- one5, id: apple, views/one5.jsp -->
<button id="b5">bbs no가 1인사람 게시물의 상세 정보 가지고 오기</button>
<!-- one6, no: 1 views/one6.jsp -->
<button id="b6">member의 모든 리스트가지고 오기</button>
<!-- one7,  views/list7.jsp -->
<hr color="red">
수정할 no: <input id="no" ><br>
수정할 content: <input id="content" >
	<input id="b7" type="button" value="수정버튼">
<br>삭제할 no : <input id="no2" >
	<input id="b8" type="button" value="삭제버튼">
<button id="b9">날씨가져오기</button>
<div id="result" style="background: yellow"></div>
</body>
</html>