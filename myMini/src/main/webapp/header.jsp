<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강아지와🐶</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="resources/css/main.css" />
	
</head>
<body>
	<header
		class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
		<a href="main.jsp"
			class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
			<svg class="bi me-2" width="40" height="32">
                    <use xlink:href="#bootstrap"></use>
            </svg> <span class="fs-4" style="color: black; font-weight: bold">강아지와</span>
		</a>
		<form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
			<input type="search" class="form-control" placeholder="Search..."
				aria-label="Search">
		</form>

		<ul class="nav nav-pills">
			<!-- <li class="nav-item"><a href="#" class="nav-link active"
                aria-current="page">Home</a></li> -->
			<li class="nav-item"><a href="#" class="nav-link link-secondary">커뮤니티</a></li>
			<li class="nav-item"><a href="shoppingList" class="nav-link link-secondary">쇼핑몰</a></li>
			<li class="nav-item"><a href="listhospital?category3=동물병원" class="nav-link link-secondary">반려동물서비스</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-secondary">고객센터</a></li>
			<li class="nav-item"><a href="report.jsp" class="nav-link link-secondary">유기동물신고</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-secondary">마이페이지</a></li>


		</ul>
	</header>