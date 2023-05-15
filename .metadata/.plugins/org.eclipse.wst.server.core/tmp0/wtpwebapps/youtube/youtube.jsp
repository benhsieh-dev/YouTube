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
	<c:forEach var="items" items="${videoItems}">
		${items.id}
		${items.category}
		${items.src}
	</c:forEach>

</body>
</html>