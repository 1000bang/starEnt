<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<sec:authorize access="isAuthenticated()">
  		<sec:authentication property="principal" var="principal"/>
	</sec:authorize>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Star Entertainment</title>
<link rel="stylesheet" href="/css/style.css">
<link rel="shortcut icon" href="/image/logofavicon.ico">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
</head>

<body>
	<div id="wrap">

		<header id="header">

			<div id="logo">
				<img src="./logo.png" alt="">
			</div>
			<nav id="nav">
				<ul>
					<li><a href="#">Company</a></li>
					<li><a href="#">Artist</a></li>
					<li><a href="#">MultiMedia</a></li>
					<li><a href="#">Goods</a></li>
					<li><a href="/news">News</a></li>
					<li><a href="#">Audition</a></li>
					<li><a href="#">Board</a></li>
				</ul>
			</nav>

		</header>