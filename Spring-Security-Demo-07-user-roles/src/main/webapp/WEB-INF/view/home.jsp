<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
   .header{
       color:green;
    }
</style>
</head>
<body>

<h2 align="center" class="header">Welcome to my home page.</h2>

<hr>

<p>Hey! to all hope u guys r doing well lets going to rock yo yo........</p>

<p>This is nitin raj hope u r going to enjoy our company,good bye</p>

<p>This is going to be a vast course hope u guys would manage ur time efficiently, stay connected with us see u in next meeting..yo! yo!</p>

<hr>

UserName: <security:authentication property="principal.username"/><br><br>

UserRoles: <security:authentication property="principal.authorities"/><br><br>

<security:authorize access="hasRole('MANAGER')">

<p><a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>(only for managers peers)</p>

</security:authorize>

<security:authorize access="hasRole('ADMIN')">

<p><a href="${pageContext.request.contextPath}/systems">IT Management Meeting</a>(only for system administrative peers)</p>

</security:authorize>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="Logout"/>

</form:form>

</body>
</html>