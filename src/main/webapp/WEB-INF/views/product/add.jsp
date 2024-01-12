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
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>



</head>
<body>
		<c:import url="../temps/header.jsp"></c:import>


    	<section id="contents" class="container-fluid" >
    	 <div class="row mt-4">
			<form action="add" method="post" enctype="multipart/form-data">	
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
			
			
			<div class="mb-3">
  			<label for="productText" class="form-label">Example textarea</label>
  			<textarea class="form-control" id="productText" ></textarea>
			</div>
			<div>
			<input type="file" name="photo">
					
			 </div>
			  <button type="submit" class="btn btn-primary">Add</button>
			  
			</form>    		
    	
    	</div>
    
     </section>
	





	<c:import url="../temps/bootStrap_js.jsp"></c:import>
	<script>
	$('#productText').summernote();
	</script>
	
</body>
</html>