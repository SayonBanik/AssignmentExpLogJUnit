<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="RegistrationDate.obj" modelAttribute="mDetails">
		Enter Start Date: <input type="text" name="sDate"><br><br>
		Enter End Date: <input type="text" name="eDate"><br><br>
		<input type="submit" value="Get member details">
	</form>
</body>
</html>