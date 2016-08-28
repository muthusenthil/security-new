<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="uploadMultipleFile" enctype="multipart/form-data">
		File1 to upload: <input type="file" name="file">
 
		Name1: <input type="text" name="name">
 
 
		File2 to upload: <input type="file" name="file">
 
		Name2: <input type="text" name="name">
 

		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
</body>
</html>