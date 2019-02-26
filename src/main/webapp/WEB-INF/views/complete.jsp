<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../style.css">
<meta charset="ISO-8859-1">
<title>Complete People</title>
</head>
<body>
	<div>
	<h1><center>Complete List of Famous People in Computer Science History<center></h1>
	<div>
		<table style="position:absolute;left:25%;top:15%">
			<tr>
				<th class="left">Year</th>
				<th class="left">First Name</th>
				<th class="left">Last Name</th>
				<th class="left">Innovation</th>
			</tr>
			<c:forEach var="person" items="${ complete }">
				<tr>
					<td class="left">${ person.year }</td>
					<td class="left">${ person.firstName }</td>
					<td class="left">${ person.lastName }</td>
					<td class="left">${ person.innovation }</td>
				</tr>
			</c:forEach>		
		</table>
	</div>
	</div>
</body>
</html>