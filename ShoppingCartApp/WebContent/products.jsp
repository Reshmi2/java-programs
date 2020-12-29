<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.hcl.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container {
	display: block;
}

.image {
	width: 30px;
	height: 30px;
}

.productimage {
	display: inline;
}
</style>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%@include file="navbar.jsp"%>
	<c:choose>
		<c:when test="${sessionScope.user!=null}">
			<div class="container">
				<h1 class="title">Products</h1>
				<section class="products">
					<%
						List<Product> list = (List<Product>) session.getAttribute("products");
					for (Product pro : list) {
					%>
					<article class="product">
						<div class="image">
							<img class="productimage" alt="<%=pro.getProductName()%>"
								src="<%=pro.getImageUrl()%>" height=400px width=300px>
						</div>
						<h2 class="product_title"><%=pro.getProductName()%></h2>
						<p class="product_description"><%=pro.getDescription()%></p>
						<p class="product_price">$<%=pro.getPrice()%></p>
						<div class="btn_actions">
							<c:if test="${sessionScope.user.designation=='customer'}"><a href="#" class="add">Add To Cart</a></c:if>
							<c:if test="${sessionScope.user.designation=='manager'}"><a href="#" class="edit">Edit</a></c:if>
							<c:if test="${sessionScope.user.designation=='manager'}"><a href="#" class="delete">Delete</a></c:if>
						</div>
					</article>
					<%
						}
					%>
				</section>
			</div>
		</c:when>
		<c:otherwise>
			<jsp:forward page="index.jsp"></jsp:forward>
		</c:otherwise>
	</c:choose>
</body>
</html>