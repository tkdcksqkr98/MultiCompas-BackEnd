<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강아지와 유기동물 신고페이지</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () {
    $.ajax({
        url : "list",
        success : function(response) {
			$('#result').append(response)        	
        }//success
    })
})
</script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	margin-right: 5%;
	margin-left: 5%;
}
.con1{
	margin-right : 5%;
	float : right;
	width : 300px;
}
</style>
</head>
<body>
<header	class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
		<a href="main.jsp" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
			<svg class="bi me-2" width="40" height="32">
					<use xlink:href="#bootstrap"></use>
			</svg> 
			<span class="fs-4" style="color: black; font-weight: bold">강아지와</span>
		</a>
		<form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
          <input type="search" class="form-control" placeholder="Search..." aria-label="Search">
        </form>


		<ul class="nav nav-pills">
			<!-- <li class="nav-item"><a href="#" class="nav-link active"
				aria-current="page">Home</a></li> -->
			<li class="nav-item"><a href="#" class="nav-link link-secondary">커뮤니티</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-secondary">쇼핑몰</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-secondary">반려동물서비스</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-secondary">고객센터</a></li>
			<li class="nav-item"><a href="report.jsp" class="nav-link link-secondary">유기견신고</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-secondary">마이페이지</a></li>
		</ul>
	</header>
<!-- <a href="list">모든 게시물정보 가지고 오기</a>

<hr color="red">

<h3>정보등록 </h3>
<hr color="red">
<form action="insert" method="get">
	제목 : <input name="title" value="011"><br>
	내용 : <input name="content" value="1234"><br>
	작성자 : <input name="writer" value="park"><br>
	<button type="submit">등록</button>
</form>
<hr color="red"> -->


<div id="result"></div>
</body>
</html>