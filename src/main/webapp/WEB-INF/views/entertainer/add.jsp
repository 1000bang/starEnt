<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>
<br>

<div class="container">
	<div class="d-flex flex-row justify-content-start">

	 <ul class="nav">
            <li class="nav-item">
              <a class="nav-link text-dark" href="#">앨범 </a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark" href="#">영화 </a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-dark" href="#">프로그램 </a>
            </li>
           
          </ul>
</div>
<hr/>
<div class="row">
		<div class="col">
			<div class="form-group">

				<label for="name"> 이름 </label> <input type="text"
					name="name" id="name" class="form-control" value="">

			</div>

			<div class="form-group">

				<label for="birth">생년 월일 </label> <input type="text" name="birth"
					id="birth" class="form-control" value="">

			</div>

			<div class="form-group">
				<label for="name"> 유닛</label> <select
					class="custom-select mb-1 form-control" id="unit">

					<option selected>선택</option>
					<option value="TRUE">TRUE</option>
					<option value="FALSE">FALSE</option>

				</select>
			</div>

			<div class="form-group">

				<label for="name"> 그룹명 </label> <input type="text" name="unitname"
					id="unitname" class="form-control" value="">

			</div>

			<div class="input-group justify-content-center mt-2">
				<a type="button" id="btn--add" class="btn btn-dark align-self"
					style="width: 20vh;"> 등록 </a>
			</div>
		</div>

	</div>
</div>

<br />
<br />
<br />
<script type="text/javascript" src="/js/artist.js"></script>


<%@ include file="../layout/footer.jsp"%>