<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/head_css.jsp"></c:import>   
    </head>
    
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
                <!--사용전 경로를 꼭 수정 하세요  -->
			<c:import url="../temps/header.jsp"></c:import>


		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">약관 동의</span>
				</h1>
			</div>
			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">

					<div class="form-check">					
						<input class="form-check-input" type="checkbox" value="" id="checkAll"> 
						<label class="form-check-label" for="checkAll"> 모두동의 </label>
					</div>
					<div class="form-check">
						<input class="form-check-input checks" type="checkbox" value="" id="a1"> 
						<label class="form-check-label req" for="a1"> 필수 동의 1 </label>
					</div>

					<div class="form-check">
						<input class="form-check-input checks" type="checkbox" value="" id="a2"> 
						<label class="form-check-label req" for="a2"> 필수 동의 2 </label>
						
					</div>

					<div class="form-check">
						<input class="form-check-input checks" type="checkbox" value="" id="a3"> 
						<label class="form-check-label req" for="a3"> 필수 동의 3 </label>
					</div>

					<div class="form-check">
						<input class="form-check-input checks opts" type="checkbox" value="" id="a4"> 
						<label class="form-check-label" for="a4"> 선택 동의 4 </label>
					</div>

					<div class="form-check">
						<input class="form-check-input checks opts" type="checkbox" value="" id="a5"> 
						<label class="form-check-label" for="a5"> 선택 동의 5 </label>
					</div>

					<div>
						<a class="btn btn-primary" id="btn" href="./join">회원 가입</a>


					</div>		
				</div>
			</div>
		</section>
	</main>
        
        
        
        
        
        
        
        
        
        <script src="../resources/js/agreement.js" type="text/javascript"></script>
        
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
