<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="java.util.List" %>

<%@page import="mypack.entity.Customer" %>

<!DOCTYPE html>

<html>

<head>

  <title>Customer list page</title>
  
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
  
</head>

<body>

<div id="wrapper">

 <div id="header">
 
    <h2 align="center">Welcome to Customer Relationship Manager</h2>
 
 </div>

</div>
<%
session.setAttribute("customers",request.getAttribute("customers"));
%>
<div id="container">

  <div id="content">
  
      <input type="button" value="Add Customer" class="add-button" onclick="window.location.href='showFormForAdd';return false;"/> &nbsp; <input type="button" value="Download" class="add-button" onclick="window.location.href='download';return false;"/>
  
      <table>
      
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
  
  </div>
  
</div>

</body>

</html>