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
        	
        	<div class="container px-5 my-5">
        	        <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">ProductList</span></h1>
                    </div>
						
						<div>
							
								<table class="table table-striped">
									<thead>
										<tr>
											<th>ProductName</th>
											<th>ProductJumsu</th>
											<th>ProductRate</th>
										</tr>
									</thead>
									<tbody>
										<c:if test="${list.size()==0} ">
											<tr>
												<td colspan="4">검색 결과 없습니다</td>
											</tr>
										</c:if>
										<c:forEach items="${requestScope.list}" var="var">
											<tr>
						
												<td><a href="./detail?productNum=${var.productNum}">${pageScope.var.productName}</a></td>
												<td>${pageScope.var.productRate}</td>
												<td>${pageScope.var.productJumsu}</td>

											</tr>
										</c:forEach>
									
									</tbody>
								
								</table>
						
						</div>
						
						
				<div>
					<nav aria-label="Page navigation example">
  					<ul class="pagination">
  				<c:if test="${!pager.start}">
  				<li class="page-item">
  				<a class="page-link" href="./list?page=${startNum-1}" aria-label="Previous">
  					<span aria-hidden="true">&laquo;</span></a></li>
    			</c:if>	
    				
    			<c:forEach begin="${pager.startNum}"  end="${pager.lastNum}" var="p" >
    			<li class="page-item"><a class="page-link" href="./list?page=${p}">${p}</a></li>
    			</c:forEach>

    					
   				
   				<c:if test="${!pager.last}">
   				<li class="page-item"><a class="page-link" href="./list?page=${pager.lastNum+1}" aria-label="Next">
    			<span aria-hidden="true">&raquo;</span></a></li>
 				 </c:if>
 				 </ul>
				</nav>
				</div>
						
						
					<div>
						<a href="add" class="btn btn-primary">상품등록</a>
					</div>	

        	</div>

			





        </main>
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
