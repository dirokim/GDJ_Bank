<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<table class="table table-hover">
<c:forEach items="${list}" var="var">
	<tr>
		<td>${var.replyNum}</td>
		<td>${var.userName}</td>
		<td>${var.replyContents}</td>
		<td>${var.replyDate}</td>
		<td>${var.replyJumsu}</td>
	</tr>
</c:forEach>
</table>
<div>
	<button id="more" data-replylist-page ="${pager.page}">더보기(${pager.page}/${pager.totalPage})</button>
</div>