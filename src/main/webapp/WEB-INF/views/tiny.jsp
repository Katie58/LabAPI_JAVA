<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tiny</title>
</head>
<body>
	<div>
		<c:forEach var="person" items="${ tiny }">
			Person: ${ person.name }<br>
			Invented: ${ person.invented }<br>
			Year: ${ person.year }<br>
			<hr>
		</c:forEach>
	</div>
</body>
</html>