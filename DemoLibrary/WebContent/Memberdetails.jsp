<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Details</h1>
		
		<table> 
			<tr> <td>Member Id </td> <td>: ${mRecord.memId}</td> <tr>
			<tr> <td>Member Name </td> <td>: ${mRecord.memName}</td> <tr>
			<tr> <td>Membership Type </td> <td>: ${mRecord.memType}</td> <tr>
		    <tr> <td>Duration </td> <td>: ${mRecord.duration}</td> <tr>
			<tr> <td>Registration Date </td> <td>: ${mRecord.regDate}</td> <tr> 
		</table>
		
		<br><br><a href="start.obj">Click here to go to the main page</a>
</body>
</html>