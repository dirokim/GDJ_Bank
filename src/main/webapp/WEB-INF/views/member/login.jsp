<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/head_css.jsp"></c:import>
   <title>로그인</title>
    </head>
    <body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<!--사용전 경로를 꼭 수정 하세요  -->
		<c:import url="../temps/header.jsp"></c:import>


		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">로그인 </span>
				</h1>
			</div>
				

			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">
				<div>
					${msg}
					</div>
					<form method="post" action="./login">
						<div class="mb-3">

				
							<label for="userName"  class="form-label">I D</label> 
							<input
								type="text" class="form-control" id="userName" name="userName"
								value="dodododdd" placeholder="아이디를 입력하세요">
						</div>

						<div class="mb-3">
							<label for="password"  class="form-label">password</label> 
							<input
								type="text"  value="dddd" class="form-control"
								id="password" name="password" placeholder="password를 입력하세요">
						</div>





				

						<div class="mb-3">

							<button class="btn btn-primary">로그인</button>
						</div>
					</form>

				</div>
			</div>












		</section>








	</main>
	<!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
	
    </body>
</html>
