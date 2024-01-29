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
					<input readonly type="hidden" value="${dto.productNum}" name="productNum" id="productNum">
				</div>
				<div>
				
						<c:if test="${empty dto}">
						<h3>그런번호 없습니다.</h3>
						</c:if>
				</div>
					<a href="./update" class="btn btn-light" id="up"
					data-product-num="${dto.productNum}">업데이트</a>
					<a href="./delete">delete</a>
					<a href="../account/add?productNum=${dto.productNum}">등록</a>
					<button id="btn3" type="button">장바구니 추가</button>

			<div class="my-3">
				<table>
					<thead>
						<tr>
							<th>Contents</th>
							<th>Writer</th>
							<th>Date</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody id="replyList" data-user="${member.userName}">
		
					</tbody>
				
			</table>
				<div>
					<button id="more" data-replyList-page="1" data-replyList-totalPage="1">더보기(${pager.page}/${pager.totalPage})</button>
				</div>
			</div>
			
		<nav aria-label="Page navigation example">
		
			<ul class="pagination">
			<c:if test="${!start}">
				<li class="page-item"><a class="page-link" href="/product/detail?page=${pager.startNum-1}"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span></a></li>
				</c:if>
				
				
				<c:forEach begin="${pager.startNum}"  end="${pager.lastNum}"  var="p">
				<li class="page-item"><a class="page-link" href="/product/detail?page=${p}">${p}</a></li>
				</c:forEach>
	
			<c:if test="${!last}">
				<li class="page-item"><a class="page-link" href="/product/detail?page=${pager.lastNum+1}"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
					</c:if>
			</ul>
			
		</nav>




		<div class="my-3">
					<form id="replyForm">
						  <input type="hidden" name="productNum" value="${dto.productNum}">	
						  <div class="mb-3">
							<textarea class="form-control" name="replyContents" id="replyContents" rows="3"></textarea>
						  </div>
						  <div class="mb-3">
						  <select class="form-select" name="replyJumsu" aria-label="Default select example">
							<option value="5">5</option>
							<option value="4">4</option>
							<option value="3">3</option>
							<option value="2">2</option>
							<option value="1">1</option>
						  </select>
						  </div>

						  <div>
							<button type="button" class="btn btn-primary" id="replyAdd">댓글달기</button>
						  </div>
					</form>
						
				</div>
				

        </main>
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
	<script src="../../../resources/js/member/wishlistAdd.js"></script>
    </body>
</html>
