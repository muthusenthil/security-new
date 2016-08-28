<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="/WEB-INF/views/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="Stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="Stylesheet" href="<c:url value="/resources/css/custom.css"/>">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
<spring:url value="/resources/css/main.css" var="mainCss" />
<spring:url value="/resources/js/jquery.1.10.2.min.js" var="jqueryJs" />
<spring:url value="/resources/js/main.js" var="mainJs" />
<script src="<c:url value="/resources/js/respond.js"/>"></script>
<title>Insert title here</title>
<style>
product-price{
	font-size: 22px;
}

.product-stock{
	color: #74DF00;
	font-size: 20px;
	margin-top: 10px;
}</style>
</head>

<body>


<div class = "row">
   
   <div class = "col-sm-6 col-md-3">
     <a href = "#" class = "thumbnail">
       <img src="<c:url value="/resources/images/bose/1.jpg" />" alt=" " /><br>
         <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
       </a>
     
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
   <img src="<c:url value="/resources/images/bose/2.jpg" />" alt=" " /> 
   <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
      </a>
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
     <img src="<c:url value="/resources/images/bose/3.jpg" />" alt=" " />
     <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right> 
      </a>
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
<img src="<c:url value="/resources/images/bose/4.jpg" />" alt=" " /> 
<h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
      </a>
   </div>
   
</div><br>


<div class = "row">
   
   <div class = "col-sm-6 col-md-3">
     <a href = "#" class = "thumbnail">
       <img src="<c:url value="/resources/images/bose/5.jpg" />" alt=" " /><br>
         <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
       </a>
     
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
   <img src="<c:url value="/resources/images/bose/6.jpg" />" alt=" " /> 
   <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
      </a>
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
     <img src="<c:url value="/resources/images/bose/7.jpg" />" alt=" " />
     <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right> 
      </a>
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
<img src="<c:url value="/resources/images/bose/8.jpg" />" alt=" " /> 
<h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
      </a>
   </div>
   
</div><br>


<div class = "row">
   
   <div class = "col-sm-6 col-md-3">
     <a href = "#" class = "thumbnail">
       <img src="<c:url value="/resources/images/bose/9.jpg" />" alt=" " /><br>
         <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
       </a>
     
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
   <img src="<c:url value="/resources/images/bose/10.jpg" />" alt=" " /> 
   <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
      </a>
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
     <img src="<c:url value="/resources/images/bose/11.jpg" />" alt=" " />
     <h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right> 
      </a>
   </div>
   
   <div class = "col-sm-6 col-md-3">
      <a href = "#" class = "thumbnail">
<img src="<c:url value="/resources/images/bose/12.jpg" />" alt=" " /> 
<h6><p>Bose QuietComfort 25 Noise Cancelling Headphones, Special Edition for Apple Devices, Triple Black - Wire</p></h6> 
       <div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					 <h6><p>FREE Shipping on eligible orders</p></h6> 
					 <right><button type="button" class="btn btn-success">view</button></right>
      </a>
   </div>
   
</div>


</body>
</html>