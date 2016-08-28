<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="/WEB-INF/views/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form name='f' action="register" modelAttribute="regform" method='POST'>
      <table>
         <tr>
            <td>Fname:</td>
            <td><input type='text' name='name' value=''></td>
         </tr>
         <tr>
            <td>Lname:</td>
            <td><input type='text' name='name' /></td>
         </tr>
         
          <tr>
            <td>Email:</td>
            <td><input type='text' name='name' /></td>
         </tr>
         
          <tr>
            <td>Phnumber:</td>
            <td><input type='number' name='number' /></td>
         </tr>
         
          <tr>
            <td>Password:</td>
            <td><input type='password' name='pwd' /></td>
         </tr>
         
          <tr>
            <td>Cpassword:</td>
            <td><input type='password' name='pwd' /></td>
         </tr>
         
           <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>



</body>
</html>