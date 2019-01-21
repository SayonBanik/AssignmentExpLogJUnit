<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="m" uri="http://java.sun.com/jstl/core_rt" %>
	
	<table> 
			<tr>
				<td>Transaction-Id </td>
				<td>Book-Id </td>
				<td>Member-Id </td>
				<td>Issued-Books-Quantity </td>
				<td>Issue-Date </td>
				<td>Return-Date </td>
				<td>Return-Status </td>
			</tr>
			<m:forEach var="txn" items="${tList}">
			<tr>
				<td>${txn.txnId}</td>
				<td>${txn.bId}</td>
				<td>${txn.mId}</td>
				<td>${txn.issuedBooksQty}</td>
				<td>${txn.issueDt}</td>
				<td>${txn.returnDt}</td>
				<td>${txn.returnStatus}</td>
			</tr>
			</m:forEach> 
		</table>  
		
		<br><br><a href="start.obj">Click here to go to the main page</a>
</body>
</html>