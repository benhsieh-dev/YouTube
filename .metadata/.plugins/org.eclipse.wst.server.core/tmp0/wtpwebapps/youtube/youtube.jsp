<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>youtube.com</title>
</head>
<body>
	<h1 align=center>YouTube</h1>

	<table border=1 cellpadding=30% align=center bordercolor=red>
		<tr>
			<th>ID</th>
			<th>Category</th>
			<th>Source</th>
		</tr>
		<c:forEach var="items" items="${videoItems}">
			<tr>
				<td>${items.id}</td>
				<td>${items.category}</td>
				<td>${items.src}</td>
			</tr>
		</c:forEach>
	</table>
	

</body>
</html>