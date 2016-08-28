<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@include file="/WEB-INF/views/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <table border="1"> -->
			<!-- <tr>
			<th> ID </th>
			<th> NAME </th>
			<th> DESCRIPTION </th>
			<th> PRICE </th>
			<th> CATEGORY</th>
				
			</tr> -->
		 	<div class="row">
		<c:forEach items="${productmodelList}" var="productmodel">
		<div class ="col-md-3">
		<div class="thumbnail">
		<img src="<c:url value="/resources/admin/upload/${productmodel.imgname}.jpg"/>"class="img-responsive">
			<div class="caption">
			<div class="col-md-12 col-md-3">
			        <h3><td>${productmodel.id}</td></h3>
					<h2><td>${productmodel.name}</td></h2>
					<h6><td>${productmodel.description}</td></h5>
					<h4><td>${productmodel.price}</td></h4>
					<h3><td>${productmodel.category}</td></h3>
					<button type="button" class="btn btn-success">Add to cart</button>
							<button type="button" class="btn btn-danger">Add to wishlist</button>
			</div>
			</div>
			</div>
			</div>
				</c:forEach>
			</div> 
	
		<!-- </table> -->
</body>
</html>