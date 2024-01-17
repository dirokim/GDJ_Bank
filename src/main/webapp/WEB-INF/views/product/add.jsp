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
                <div class="container px-5">
                    <!-- Contact form-->
                    <div class="bg-light rounded-4 py-5 px-4 px-md-5">
                        <div class="text-center mb-5">
                            <div class="feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 mb-3"><i class="bi bi-envelope"></i></div>
                            <h1 class="fw-bolder">Product Add</h1>
                            <p class="lead fw-normal text-muted mb-0">Let's go Add!!</p>
                        </div>
                        <div class="row gx-5 justify-content-center">
                            <div class="col-lg-8 col-xl-6">
                         
                                <form id="contactForm" action="/product/add" method="POST" enctype="multipart/form-data">
                                    <!-- Name input-->
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="productName" name="productName" type="text" placeholder="상품명 입력하세요" data-sb-validations="required" />
                                        <label for="name">상품명</label>
                                        <div class="invalid-feedback" data-sb-feedback="name:required">상품명은 필수 입니다</div>
                                    </div>
                                    
        
                                    <!-- 상품상세-->
                                    <div class="form-floating mb-3">
                                        <textarea class="form-control" id="productContents" name="productContents"  type="text" placeholder="상품 상세 설명" style="height: 10rem" data-sb-validations="required"></textarea>
                                        <label for="message">상품 상세</label>
                                        <div class="invalid-feedback" data-sb-feedback="message:required">상품내용 필수입니다</div>
                                    </div>
                                    <!-- 이자율 -->
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="productRate"  name="productRate"  type="text" placeholder="이자율을 입력하세요" data-sb-validations="required" />
                                        <label for="name">이자율</label>
                                        <div class="invalid-feedback" data-sb-feedback="name:required">이자율은 필수 입니다</div>
                                    </div>
                                    <!-- 평균 -->
                                    <div class="form-floating mb-3">
                                        <input class="form-control" id="productJumsu" name="productJumsu"  type="text" placeholder="평균을 입력하세요" data-sb-validations="required" />
                                        <label for="name">평균</label>
                                        <div class="invalid-feedback" data-sb-feedback="name:required">평균을 필수 입니다</div>
                                    </div>

                                    <!-- 첨부파일 -->
                                    <div class=" mb-3">
                                        <label for="photo">파일 첨부</label>
                                        <input class="form-control" id="photo" type="file" name="photo" />
										<input class="form-control" id="photo" type="file" name="photo" />
                                        <input class="form-control" id="photo" type="file" name="photo" />
                                        <input class="form-control" id="photo" type="file" name="photo" />
                                        <input class="form-control" id="photo" type="file" name="photo" />
                                        <div class="invalid-feedback" data-sb-feedback="name:required"></div>
                                    </div>


                                    <!-- Submit success message-->
                                    <!---->
                                    <!-- This is what your users will see when the form-->
                                    <!-- has successfully submitted-->
                                    <div class="d-none" id="submitSuccessMessage">
                                        <div class="text-center mb-3">
                                            <div class="fw-bolder">Form submission successful!</div>
                                            To activate this form, sign up at
                                            <br />
                                            <a href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
                                        </div>
                                    </div>

                                    <div class="d-none" id="submitErrorMessage"><div class="text-center text-danger mb-3">Error sending message!</div></div>
                                    <!-- Submit Button-->
                                    <div class="d-grid"><button class="btn btn-primary btn-lg" id="submitButton" type="submit">상품 등록</button></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
			
			






        </main>
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
