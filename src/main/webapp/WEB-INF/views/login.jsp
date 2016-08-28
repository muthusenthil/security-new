<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/head.jsp"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <title> login</title>
	 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head><style>.wrapper {    
    margin-top: 80px;
	margin-bottom: 20px;
}

.form-signin {
  max-width: 900px;
  padding: 30px 38px 66px;
  margin: 0 auto;
  background-color: #05D4D0;
  border: 3px dotted rgba(0,0,0,0.1);  
  }

.form-signin-heading {
  text-align:left;
  margin-bottom: 30px;
}

.form-control {
  background: rgba(0,0,0,0.5);
  width: 300;
  position: relative;
  font-size: 18px;
  color: white;
  height: auto;
  padding: 10px;
}

input[type="text"] {
  margin-bottom: 0px;
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
}

input[type="password"] {
  margin-bottom: 20px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.colorgraph {
  height: 400px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #f7fdca 12.5%, #f7fdca 87.5%, #c4e17f 87.5%, #c4e17f);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #f7fdca 12.5%, #f7fdca 87.5%, #c4e17f 87.5%, #c4e17f);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #f7fdca 12.5%, #f7fdca 87.5%, #c4e17f 87.5%, #c4e17f);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #f7fdca 12.5%, #f7fdca 87.5%, #c4e17f 87.5%, #c4e17f);
}

.colorgraph3 {
  height: 50px;
  width: 200px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left,  #c4e17f 37.5%, #c4e17f 50%, #c4e17f 50%, #c4e17f );
  background-image: -moz-linear-gradient(left,  #c4e17f 37.5%, #c4e17f 50%, #c4e17f 50%, #c4e17f );
  background-image: -o-linear-gradient(left,  #c4e17f 37.5%, #c4e17f 50%, #c4e17f 50%, #c4e17f );
  background-image: linear-gradient(to right,  #c4e17f 37.5%, #c4e17f 50%, #c4e17f 50%, #c4e17f );
}</style>
<body><div class="container">
	<div class="row">
		<center>
                            <form:form action="j_spring_security_check" method="post">       
    	                             <div class="colorgraph"><br><br><br>
                                     <font face="Lato" size="8">Login</font><br><br><br>
                                     <input type="text" class="form-control" name="userName" placeholder="Username" required="" autofocus="" />
                                       
			                         <input type="password" class="form-control" name="password" placeholder="Password" required=""/><br><br>
                                     <button class="colorgraph3"><font face="Lato" size="5" color="f7fdca">Login</font></button><br><br>
                                    <hr width="520" color="#f7fdca"> 
                                     </div>
                                </form:form>	
        </center>
        </form>	
	</div>
</div></body>
</html>
<%-- <style>
.wrapper {    
	margin-top: 80px;
	margin-bottom: 20px;
}

.form-signin {
  max-width: 420px;
  padding: 30px 38px 66px;
  margin: 0 auto;
  background-color: #eee;
  border: 3px dotted rgba(0,0,0,0.1);  
  }

.form-signin-heading {
  text-align:center;
  margin-bottom: 30px;
}

.form-control {
  position: relative;
  font-size: 16px;
  height: auto;
  padding: 10px;
}

input[type="text"] {
  margin-bottom: 0px;
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
}

input[type="password"] {
  margin-bottom: 20px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.colorgraph {
  height: 7px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
}
body{

background-color : powderblue;
}
</style>
<body>

<div class = "container">
	<div class="wrapper">
		      
		    <h3 class="form-signin-heading"> Please Sign In</h3>
			  <hr class="colorgraph"><br>
			  <form:form action="j_spring_security_check"  method="POST" id="target">

			  <input  type="text" class="form-control"  placeholder="Username"  name="userName"  />
			  <input type="password" class="form-control"  placeholder="Password"  name="password" />     		  
			  <input class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">
			  	
	<!-- 		  <span class="pull-right"><a href="register">Register</a></span> -->	
			  	
		</form:form>
				
	</div>
</div>
	<div class="modal-footer">
	<div class="col-md-12">
	     <button class="btn" onclick="javascript:history.back()">Cancel</button>
	</div>
	</div>
 <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/> 
</body>
</html> --%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form name='f' action="link" method='POST'>
      <table>
      
         <tr>
            <td>User:</td>
            <td><input type='text' name='userName' value=''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>
 
 
 
 </body>
</html> --%>