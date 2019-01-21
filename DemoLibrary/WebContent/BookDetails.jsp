<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Book Details</h1>
		
		<%@taglib prefix="m" uri="http://java.sun.com/jstl/core_rt" %>
			<table> 
			<tr>
				<td>Book-Id </td>
				<td>Book-Title </td>
				<td>Book-Quantity </td>
				<td>Book-Edition </td>
				<td>Book-Cost </td>
			</tr>
			<m:forEach var="book" items="${bInfo}">
			<tr>
				<td>${book.bkId}</td>
				<td>${book.bkTitle}</td>
				<td>${book.bkQty}</td>
				<td>${book.bkEdition}</td>
				<td>${book.bkCost}</td>
			</tr>
			</m:forEach> 
		</table> 
		
		<br><br><a href="start.obj">Click here to go to the main page</a> 
</body>
</html>