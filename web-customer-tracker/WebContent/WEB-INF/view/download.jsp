<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List" %>
<%@page import="mypack.entity.Customer" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setContentType("application/vnd.ms-excel");
response.setHeader("Content-Disposition","inline; filename=customers.xls");

%>
<table border=1>
      
         <tr>
         
           <th>FirstName</th>
           
           <th>LastName</th>
           
           <th>Email_Id</th>
           
           <th>Action</th>
           
           
           
          </tr>
          
          <c:forEach var="thecustomers" items="${customers}">
          
           <c:url var="updateLink" value="/customer/showFormForUpdate">
          
           <c:param name="customerId" value="${thecustomers.id}"></c:param>
           
            </c:url>
            
           <c:url var="deleteLink" value="/customer/delete">
          
           <c:param name="customerId" value="${thecustomers.id}"></c:param>
            
           </c:url>
          
            <tr>
            
            <td>${thecustomers.firstName}</td>
            
            <td>${thecustomers.lastName}</td>
            
            <td>${thecustomers.email}</td>
            
            <td><a href="${updateLink}" onclick="if(!(confirm('Are u sure u want to update the customer details?')))return false;">Update</a> |
           
            <a href="${deleteLink}" onclick="if(!(confirm('Are u sure u want to delete the customer details?')))return false;">Delete</a></td>
          
            </tr>
            
          </c:forEach>  
      
      
      </table>
  
</body>
</html>