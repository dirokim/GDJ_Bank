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
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Account List</span></h1>
                    </div>
					
						<div>
							
							<table class="table table-striped">
									<thead>
										<tr>
											<th>상품명</th>
											<th>이자율</th>
											<th>계좌번호</th>
											<th>잔액</th>
											<th>가입일</th>
										</tr>
									</thead>
									<tbody>
										<c:if test="${list.size()==0} ">
<!-- 											<tr>
												<td colspan="5">검색 결과 없습니다</td>
											</tr> -->
										</c:if>
										<c:forEach items="${list}" var="v">
										<c:forEach items="${v.accountDTOs}" var="iac">
											<tr>
												<td>${v.productName}</td>
												<td>${v.productRate}</td>

												<td>${iac.accountNum}</td>
												<td>${iac.accountDate }</td>
												<td>${iac.accountBalance}</td>
												</tr>
										</c:forEach>
										</c:forEach>
									
									</tbody>
								
								</table>
						
						</div>
						
						
			</div>
		
			

			





        </main>
            <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
