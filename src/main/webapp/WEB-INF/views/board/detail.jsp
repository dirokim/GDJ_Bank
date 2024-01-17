<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/head_css.jsp"></c:import>
        <title>${board} Detail</title>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
                <!--사용전 경로를 꼭 수정 하세요  -->
			<c:import url="../temps/header.jsp"></c:import>
            


            <section class="py-5">
                <div class="container px-5 mb-5">
                    <div class="text-center mb-5">
                        <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">${board} Detail</span></h1>
                    </div>
                    <div class="row gx-5 justify-content-center">
                        <div class="col-lg-11 col-xl-9 col-xxl-8">
                            <!-- project -->
                            <div class="card overflow-hidden shadow rounded-4 border-0 mb-5">
                                <div class="card-body p-0">
                                    <div class="d-flex align-items-center">
                                        <div class="p-5">
                                            <h2 class="fw-bolder">${boardDTO.noticeHead}</h2>
                                            <div>
                                            ${boardDTO.noticeContents}
                                            </div>
                                            <div>
                                                <c:forEach items="${boardDTO.fileDTOs}" var="f">
                                                	<a href="/resources/upload/${board}/${f.fileName}">${f.oriName}</a>
                                                </c:forEach>

                                            </div>

                                        </div>
                                      
                                    </div>
                                </div>
                            </div>
                        
                            <div>
                                <c:if test="${bbs eq 1}">
                                <a class="btn btn-primary" href="reply?noticeNum=${boardDTO.noticeNum}">답글</a>
                                </c:if>
                                <a class="btn btn-info" id="update" href="#">Update</a>
                                <a class="btn btn-primary" id="del" href="#">Delete</a>
                                <form id="frm" action="./update" method="get">
                                    <input type="hidden" name="noticeNum" value="${boardDTO.noticeNum}">

                                </form>
                            </div>
					
                     </div>
                    </div>
                </div>
            </section>



        </main>
        <script src="/resources/js/boardDetail.js" type="text/javascript"></script>
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
