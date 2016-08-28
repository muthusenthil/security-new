<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>


<form:form action="${addAction}" method="POST" modelAttribute="musicplay" enctype="multipart/form-data">
<h3>Product List</h3>
<c:if test="${!empty listProducts}">
	<table class="tg">
	<tr>
	<th width="120">Product image</th>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Category</th>
		<th width="120">Description</th>
		<th width="120">Price</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProducts}" var="pd">
		<tr>
		<td><a><img src=[${file}] ></a></td>
			<td>${pd.productid}</td>
			<td>${pd.productname}</td>
			<td>${pd.productcategory}</td>
			<td>${pd.productdescription}</td>
			<td>${pd.productprice}</td>
			<td><a href="<c:url value='/edit/${pd.productid}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${pd.productid}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</form:form>
</body>
</html>