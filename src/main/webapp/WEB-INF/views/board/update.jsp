<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/head_css.jsp"></c:import>
   <title>${board} Update</title>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
                <!--사용전 경로를 꼭 수정 하세요  -->
			<c:import url="../temps/header.jsp"></c:import>
        

            <section class="py-5">
                <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">${board} Update</span></h1>
                </div>



                <div class="row gx-5 justify-content-center">
                    <div class="col-lg-11 col-xl-9 col-xxl-8">

                    <form  action="./add" method="post" enctype="multipart/form-data">
                    	<input type="hidden" name="noticeNum" value="${boardDTO.noticeNum}">
                        <div class="mb-3">
                            <label for="head" class="form-label">Title</label>
                            <input type="text" class="form-control" id="head" name="noticeHead" value="${boardDTO.noticeHead}" placeholder="제목을 입력하세요">
                        </div>

                        <div class="mb-3">
                            <label for="noticeWriter" class="form-label">Writer</label>
                            <input type="text" readonly value="${boardDTO.noticeWriter}" class="form-control" id="noticeWriter" name="noticeWriter" placeholder="작성자를 입력하세요">
                        </div>
                          
                          
                        <div class="mb-3">
                            <label for="noticeContents" class="form-label">Contents</label>
                            <textarea class="form-control" name="noticeContents" id="noticeContents" rows="3">${boardDTO.noticeContents}</textarea>
                        </div>
                        <div class="mb-3">
                            <input class="form-control" type="file" name="attachs">
                            <input class="form-control" type="file" name="attachs">
                            <input class="form-control" type="file" name="attachs">
                        </div>


                       <div class="mb-3">

                        <button  class="btn btn-primary"> 수정 </button>
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
