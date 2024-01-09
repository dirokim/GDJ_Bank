<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
	<c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>

<body>
	<c:import url="../temps/header.jsp"></c:import>
	
	
	<table class="table table-hover">
		<thead>
		<tr>
			<th>ProductNum</th>
			<th>ProductName</th>
			<th>ProductContents</th>
			<th>ProductRate</th>
			<th>ProductJumsu</th>
		</tr>
		</thead>
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.productNum}</td>
				<td><a href="./detail?productNum=${dto.productNum}">${pageScope.dto.productName}</a></td>
				<td>${pageScope.dto.productContents}</td>
				<td>${pageScope.dto.productRate}</td>
				<td>${pageScope.dto.productJumsu}</td>
			</tr>
		</c:forEach>
		<tbody>
		</tbody>
	</table>
	
	
	
	
	<div>
			
	<nav aria-label="Page navigation example">
  	<ul class="pagination">
  	
  	<c:if test="${!pager.start}">
   	  <li class="page-item">
      <a class="page-link" href="./list?page=${pager.startNum-1}" aria-label="Previous">
      <span aria-hidden="true">&laquo;</span></a></li>
 	</c:if>
 
 
 	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i" >
    <li class="page-item"><a class="page-link" href="./list?page=${i}">${i}</a></li>
	</c:forEach>
    
    
    
    
    <c:if test="${!pager.last}">
      <li class="page-item">
      <a class="page-link" href="./list?page=${pager.lastNum+1}" aria-label="Next">
      <span aria-hidden="true">&raquo;</span></a>
      </li>
 	</c:if>
 
  </ul>
	</nav>
	
	
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<button type="submit" class="btn btn-primary">Add</button>
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
</body>
</html>