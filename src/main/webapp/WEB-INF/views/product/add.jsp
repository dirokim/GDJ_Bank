<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="../temps/bootStrap_css.jsp"></c:import>
</head>
<body>
	<c:import url="../temps/bpptStrap_js.jsp"></c:import>

    	<section id="contents" class="container-fluid" >
    	 <div class="row mt-4">
			<form action="add" method="post">
			  <div class="mb-3">
			    <label for="productNum" class="form-label">ProductNum</label>
			    <input type="text" name="productNum" class="form-control" id="productNum" aria-describedby="emailHelp">
			    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
			  </div>
			  <div class="mb-3">
			    <label for="productName" class="form-label">ProductName</label>
			    <input type="text" name="productName" class="form-control" id="productName">
			  </div>
			  			  <div class="mb-3">
			    <label for="productContents" class="form-label">ProductContents</label>
			    <input type="text" name="productContents" class="form-control" id="productContents">
			  </div>
			  			  <div class="mb-3">
			    <label for="productRate" class="form-label">ProductRate</label>
			    <input type="text" name="productRate" class="form-control" id="productRate">
			  </div>
			  			  <div class="mb-3">
			    <label for="productJumsu" class="form-label">ProductJumsu</label>
			    <input type="text" name="productJumsu" class="form-control" id="productJumsu">
			  </div>

			  <button type="submit" class="btn btn-primary">Add</button>
			</form>    		
    	
    	</div>
    
     </section>
	







		<c:import url="../temps/header.jsp"></c:import>
</body>
</html>