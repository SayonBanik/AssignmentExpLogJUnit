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
				<td>Member Id </td>
				<td>Member Name </td>
				<td>Membership-Type </td>
				<td>Duration </td>
				<td>Registration Date </td>
			</tr>
			<m:forEach var="mem" items="${mList}">
			<tr>
				<td>${mem.memId}</td>
				<td>${mem.memName}</td>
				<td>${mem.memType}</td>
				<td>${mem.duration}</td>
				<td>${mem.regDate}</td>
			</tr>
			</m:forEach> 
		</table>  
	<br><br><a href="start.obj">Click here to go to the main page</a>
</body>
</html>