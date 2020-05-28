<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-Tracker</title>
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div align="center">
	<div id="wrapper">
		<div id="header">
			<h3>CRM-Customer Relational Mapping</h3>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		<div align="center">
		<input  class="add-button" type="button" value="Add Customer" onclick="window.location.href='showAddCustomer'"/>
			</div>
			<table>
				
					<caption></caption>
					<tr>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Email ID</th>
						<th>Actions</th>
					</tr>
					<c:forEach var="customer" items="${customers}">
					<c:url var="updateCustomerLink"  value="showFormForUpdate" >
					<c:param name="customerId" value="${customer.id}"/>
					</c:url>
					<c:url var="deleteCustomerLink"  value="deleteCustomer" >
					<c:param name="customerId" value="${customer.id}"/>
					</c:url>
					<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.email}</td>
					<td><a href="${updateCustomerLink}">Update</a>
					|
					<a href="${deleteCustomerLink}" onclick="if(!(confirm('are you sure you wanna delete the record?')))return false">Delete</a></td>
					</tr>
					
				</c:forEach>
			</table>

		</div>


	</div>


</div>
</body>
</html>