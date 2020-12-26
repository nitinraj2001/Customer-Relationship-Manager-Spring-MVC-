<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Access Denied Page</title>
<style type="text/css">
  .message{
      color:blue;
      }
</style>
</head>
<body>

 <p class="message" align="center">Access Denied , you r not authorized to access this resource</p>
 
 <hr>
 
 <p><a href="${pageContext.request.contextPath}/">Back to home page</a></p>
 

</body>
</html>