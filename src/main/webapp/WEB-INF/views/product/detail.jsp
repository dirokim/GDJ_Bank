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
        
				<div>
					<c:if test="${not empty dto}">
						<h3>productName:${dto.productName}</h3>
						<h3>productContents:${dto.productContents}</h3>
						<h3>productRate:${dto.productRate}</h3>
						<h3>productJumsu:${dto.productJumsu}</h3>
					</c:if>
					<input readonly type="text" value="${dto.productNum}" name="productNum" id="productNum">
				</div>
				<div>
				
						<c:if test="${empty dto}">
						<h3>그런번호 없습니다.</h3>
						</c:if>
				</div>
					<a href="./update">업데이트</a>
					<a href="../account/add?productNum=${dto.productNum}">등록</a>
					<button id="btn3" type="button">장바구니 추가</button>



        </main>
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
	<script src="/resources/js/member/wishlistAdd.js"></script>
    </body>
</html>
