<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<c:forEach items="${requestScope.list}" var="var">
	<tr>
		<td>
			<div class="form-check">
				<input class="form-check-input checks" type="checkbox"
					value="${var.productNum}">
			</div>
		</td>
		<td>${var.productNum}</td>
		<td><a href="/product/detail?productNum=${var.productNum}">${var.productName}</a></td>
		<td>${var.productRate}</td>

	</tr>
</c:forEach>