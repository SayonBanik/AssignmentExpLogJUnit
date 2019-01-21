<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%-- <%@taglib prefix="m" uri="http://java.sun.com/jstl/core_rt" %> --%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		  
		<Table>
			<tr>
				<td>Book-Title</td>
				<td>Book-Edition</td>
				<td>Available Books</td>
			</tr>
			<c:forEach var="book" items="${bDetails}">
			<tr>
				<td>${book.bkTitle}</td>
				<td>${book.bkEdition}</td>
				<td>${book.bkQty}</td>
			</tr>
		</c:forEach>
		</Table>
		
		
		<br><br><a href="start.obj">Click here to go to the main page</a>
		
</body>
</html>