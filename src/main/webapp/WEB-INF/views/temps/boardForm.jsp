<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="row gx-5 justify-content-center">
	<div class="col-lg-11 col-xl-9 col-xxl-8">

		<form  method="post" enctype="multipart/form-data">
			<input type="hidden" name="noticeNum" value="${boardDTO.noticeNum}">
			<div class="mb-3">
				<label for="head" class="form-label">Title</label> <input
					type="text" class="form-control" id="head" name="noticeHead"
					value="${boardDTO.noticeHead}" placeholder="제목을 입력하세요">
			</div>

<%-- 			<div class="mb-3">
				<label for="noticeWriter" class="form-label">Writer</label> <input
					type="text"  value="${member.userName}"
					class="form-control" id="noticeWriter" name="noticeWriter"
					placeholder="작성자를 입력하세요">
			</div>
 --%>

			<div class="mb-3">
				<label for="noticeContents" class="form-label">Contents</label>
				<textarea class="form-control" name="noticeContents"
					id="noticeContents" rows="3">${boardDTO.noticeContents}</textarea>
			</div>
			<div class="mb-3">
				<input class="form-control" type="file" name="attachs"> <input
					class="form-control" type="file" name="attachs"> <input
					class="form-control" type="file" name="attachs">
			</div>


			<div class="mb-3">

				<button class="btn btn-primary">수정</button>
			</div>
		</form>

	</div>
</div>

