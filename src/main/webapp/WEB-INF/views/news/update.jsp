<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<br><br>
<div class="container">
	<form action="">
	<input type="hidden" id = "id" value="principal.user.id">
	
	<div class="form-group">
		<label for="title" id="board-id" data-id = "${news.id}">글 번호 : ${news.id} </label> 
	</div>
	
	
	
	<div class="form-group">
			
			<label for="username">Username</label> 
			<input type="text" name="username" id="username" 
			class="form-control" value="${principal.username}" readonly="readonly">

		</div>
	
		<div class="form-group">
			<label for="title">Title</label> <input type="text" name="title" id="title" 
			class="form-control" value="${news.title}">

		</div>
		<div>
			<label for="content">Content</label>
			<textarea name="content" id="content" rows="5" class="form-control content">
			${news.content}
	</textarea>
		</div>

	</form>

<button type="button" id="btn--update" class="btn btn-outline-dark" style="float: right">글쓰기 완료</button>

</div>
<script type="text/javascript" src="/js/news.js">
<script>
	$('.content').summernote({
		placeholder : '내용을 입력하세요 ',
		tabsize : 2,
		height : 300
	});
</script>

<%@ include file="../layout/footer.jsp"%>