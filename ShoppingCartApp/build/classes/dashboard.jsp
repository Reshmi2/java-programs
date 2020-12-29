<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style type="text/css">
h1 {
	margin-left: 20px;
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<c:choose>
		<c:when test="${sessionScope.user != null}">
			<h1>Welcome..! ${user.userName}, ${user.designation}</h1>
		</c:when>
		<c:otherwise>
			<jsp:forward page="index.jsp"></jsp:forward>
		</c:otherwise>
	</c:choose>
</body>
</html>