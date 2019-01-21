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
	
		<l:form action="GetBook.obj" modelAttribute="bookInfo">
			Enter Book Title :<l:input path="bkTitle" /><l:errors path="bkTitle"></l:errors><br><br>
			<l:button>Get Book Details</l:button>
		</l:form> 
	
</form>
</body>
</html>