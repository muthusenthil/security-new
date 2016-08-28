<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@include file="/WEB-INF/views/head.jsp" %>
<html>
<head>
<title>Upload File Request Page</title>
</head>
<body>
<form method="POST" action="upload" enctype="multipart/form-data" >
File to Upload:<input type="file" name="file"/>
Name:<input type="text" name="name" />
<input type="submit" value="upload"/>press here to upload the file!
</form>
 	
</body>
</html>