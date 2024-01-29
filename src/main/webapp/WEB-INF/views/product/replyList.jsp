<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<c:forEach items="${list}" var="var">
	<tr>
		<td>${var.replyNum}</td>
		<td>${var.userName}</td>
		<td>${var.replyContents}</td>
		<td>${var.replyDate}</td>
		<td>${var.replyJumsu}</td>
	</tr>
</c:forEach>
