<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href ="style.css">
<style type="text/css">
	.form_group{
            margin: 10px;
        }
        .container{
            margin-top: 10%;
            margin-left: 40%;
            position: fixed;
            display: inline-block;
        }
    
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container">
		<h3>Add Products</h3>
		<form action="#" method="post">
			<div class="form_group">
				<label for="pid">Product Id</label> <input type="number" name="pid">
			</div>
			<div class="form_group">
				<label for="pname">Product Name</label> <input type="text"
					name="pname" id="pname">
			</div>
			<div class="form_group">
				<label for="imageurl">Image</label> <input type="text"
					name="imageurl" id="imageurl">
			</div>
			<div class="form_group">
				<label for="description">Description</label> <input type="text"
					name="description" id="description">
			</div>
			<div class="form_group">
				<label for="text">Price</label> <input type="text" name="price"
					id="price">
			</div>
			<div class="btn_actions">
				<button type="submit">Add Product</button>
				<button type="reset">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>