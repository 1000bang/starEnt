<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<br><br>

<br>
<br>
<div class="container">

	<button class="btn btn-outline-secondary" onclick="history.back();">돌아가기</button>
	<c:if test="${news.user.id == principal.id}">
		<a class="btn btn-outline-warning" id="" href="/news/${news.id}/update">수정</a>
		<a class="btn btn-outline-danger" id="" href="/news/${news.id}/delete">삭제</a>
	</c:if>
	<br /> <br /> <br />

	<div>
		<input type="hidden" id="board-id" value="${news.id}"> 글 번호 : <span> <i> ${boardData.id + 100} </i></span>
	</div>
	<div>
		글 작성자 : <span> <i> ${news.user.username} </i></span>
	</div>
	<br /> <br /> <br />
	<div class="">
		<h3>${news.title}</h3>
	</div>
	<hr/>
	<br /> <br />
	<div>${news.content}</div>
	<br /> <br /> <br />
	



<script type="text/javascript" src="/js/news.js">

</script>
        
<%@ include file="../layout/footer.jsp"%>