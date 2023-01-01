<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<br><br>

<div class="container">
<h1 class="h2"> 팬게시판 작성</h1>
<br>
	<form action="">
	<div class="form-group">
			<select class="custom-select mb-1 form-control" id="entertainer">
				<option selected>대상 </option>
				<option value="아이유">아이유 </option>
				<option value="이종석">이종석 </option>
				<option value="장기하">장기하 </option>
			</select>
		</div>
		<div class="form-group">
			<label for="title">제목 </label> <input type="text" name="title" id="title" class="form-control">

		</div>
		<div class="form-group">
			<label for="content">내용 </label>
			<textarea name="content" id="content" rows="20" class="form-control content">
	</textarea>
		</div>

	</form>
	<br>
	<button type="button" id="btn--save" class="btn btn-outline-dark" style="float: right">글쓰기 완료</button>
<br><br><br><br>
</div>



<script type="text/javascript" src="/js/fanBoard.js">

</script>
        
<%@ include file="../layout/footer.jsp"%>