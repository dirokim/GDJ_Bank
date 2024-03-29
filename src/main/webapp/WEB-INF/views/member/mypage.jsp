<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/head_css.jsp"></c:import>
   <title>My page</title>
    </head>
    <body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<!--사용전 경로를 꼭 수정 하세요  -->
		<c:import url="../temps/header.jsp"></c:import>


		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">마이 페이지 </span>
				</h1>
			</div>

			<c:if test="${not empty member.avatarFile}">
				<div>

					<img src="/resources/upload/avatar/${member.avatarFile.fileName}">

				</div>
				<%-- 				<div class="mb-3">
						<a href="/resources/upload/avatar/${member.avatarFile.fileName}">${member.avatarFile.oriName}</a>
						</div> --%>
			</c:if>



			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">

					<form method="post" action="./join" enctype="multipart/form-data">
						<div class="mb-3">
							<label for="userName" class="form-label">I D</label> <input
								type="text" class="form-control" id="userName" name="userName"
								value="${member.userName}" placeholder="아이디를 입력하세요">
						</div>

						<div class="mb-3">
							<label for="password" class="form-label">password</label> <input
								type="text" value="${member.password}" class="form-control"
								id="password" name="password" placeholder="${member.password}">
						</div>
						
						<div class="mb-3">
							<label for="name" class="form-label">name</label> <input
								type="text" value="${member.name}" class="form-control"
								id="name" name="name" placeholder="${member.name}">
						</div>
						
						<div class="mb-3">
							<label for="email" class="form-label">email</label> <input
								type="text" value="${member.email}" class="form-control"
								id="email" name="email" placeholder="${member.email}">
						</div>
						
						<div class="mb-3">
							<label for="phone" class="form-label">phone</label> <input
								type="text" value="${member.phone}" class="form-control"
								id="phone" name="phone" placeholder="${member.phone}">
						</div>
						
						<div class="mb-3">
							<label for="address" class="form-label">address</label> 
						<input
								type="text" value="${member.address}" class="form-control"
								id="address" name="address" placeholder="address 입력하세요">
						</div>




						<!-- 
						<div class="mb-3">

							<button class="btn btn-primary">회원 가입</button>
						</div> -->
					</form>
					

					<div>
					<a class="btn btn-primary" href="./update">수정</a>

					</div>
				</div>
			</div>












		</section>








	</main>
	<!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
