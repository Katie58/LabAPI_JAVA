<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<c:forEach var="person" items="${ complete }">
			First Name: ${ person.firstName }<br>
			Last Name: ${ person.lastName }<br>
			Innovation: ${ person.innovation }<br>
			Year: ${ person.year }<br>
			<hr>
		</c:forEach>
	</div>
</body>
</html>