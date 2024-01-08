<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<c:import url="../temps/bootStrap_css.jsp"></c:import>
	<c:import url="../temps/bpptStrap_js.jsp"></c:import>

<body>
	<div>
		<c:if test="${not empty dto}">
				<h3>${dto.productName}</h3>
				<div>${dto.productNum}</div>
				<div>${dto.productContents}</div>
				<div>${dto.productRate}</div>
				<div>${dto.productJumsu}</div>
		</c:if>
		<c:if test="${empty dto}">
			<h3>그런 정보는 없습니다.</h3>		
		</c:if>
	
	
	</div>


		<c:import url="../temps/header.jsp"></c:import>
</body>
</html>