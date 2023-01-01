<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal" />
</sec:authorize>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.btn-social-login {
	transition: all .2s;
	outline: 0;
	border: 1px solid transparent;
	padding: .5rem !important;
	border-radius: 50%;
	color: #fff;
}

.btn-social-login:focus {
	box-shadow: 0 0 0 .2rem rgba(0, 123, 255, .25);
}

.text-dark {
	color: #343a40 !important;
}
</style>
<title>Star Entertainment</title>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">

<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel="shortcut icon" href="/image/logofavicon.ico">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>


</head>

<body>
	<div id="wrap">

		<header id="header">

			<div id="logo">
				<a href="/"> <img src="../image/logo.png" alt="">
				</a>
			</div>
			<nav id="nav">
				<ul>
				<c:choose>
				<c:when test="${sessionScope.principal.role eq 'USER'}">
					<li><a href="#">Company</a></li>
					<li><a href="/artist">Artist</a></li>
					<li><a href="#">MultiMedia</a></li>
					<li><a href="#">Goods</a></li>
					<li><a href="/news">News</a></li>
					<li><a href="#">Audition</a></li>
					<li><a href="/board">Board</a></li>
					<c:choose>
					<c:when test="${empty sessionScope.principal}">
						<li><a href="/login">login</a></li>		
					</c:when>
					<c:otherwise>
						<li><a href="/logout">logout</a></li>	
					</c:otherwise>
					</c:choose>
				</c:when>
				<c:otherwise>
					<li><a href="/artist/add">Artist</a></li>
					<li><a href="/goods">Goods</a></li>
					<li><a href="/news">News</a></li>
					<li><a href="/board">Board</a></li>
					<c:choose>
					<c:when test="${empty sessionScope.principal}">
						<li><a href="/login">login</a></li>		
					</c:when>
					<c:otherwise>
						<li><a href="/logout">logout</a></li>	
					</c:otherwise>
					</c:choose>
					</c:otherwise>
				</c:choose>
				</ul>
			</nav>

		</header>