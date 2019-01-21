<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@taglib prefix="l" uri="http://www.springframework.org/tags/form"%>
	
	<l:form action="MemberId.obj" modelAttribute="mDetails">
		Enter User Id :<l:input path="memId"/><l:errors path="memId"></l:errors><br>
		<l:button>Get Details</l:button>
	</l:form>
	
</body>
</html>