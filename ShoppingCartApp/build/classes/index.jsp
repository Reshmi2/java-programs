<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<link rel="stylesheet" href ="style.css">
</head>
<body>
    <%@include file="navbar.jsp" %>
    <div>
        <section class="loginsect">
            <form action="login" method="POST">
                <div class="logindiv">
                    <label >Username</label>
                    <input type="text" name="username"></input>
                </div >
                <div class="logindiv">
                    <label >Password</label>
                    <input type="password" name="password" >
                </div>
                
                <input type="submit" value="Login" id="login">
                <input type="button" value="Cancel" id ="cancellogin"> 
            </form>
        </section>
    </div>
<div>
<section class="signupsect">
    <form action="signup" method="POST">
        <div class="signupdiv">
            <label >Userid</label>
            <input type="number" name="userid"></input>
        </div >
        <div class="signupdiv">
            <label >Username</label>
            <input type="text" name="username"></input>
        </div >

        <div class="signupdiv">
            <label >Gender</label>
            <input type="radio" name="gender" >Male</input>
            <input type="radio" name="gender" >Female</input>
        </div>
        <div class="signupdiv">
            <label >Designation</label>
            <select name="designation" id="designation">
                <option value="manager">Manager</option>
                <option value="customer">Customer</option>
            </select>
        </div >
        <div class="signupdiv">
            <label >Password</label>
            <input type="password" name="password" >
        </div>
        <input type="submit" value="Submit" id="signup">
        <input type="button" value="Cancel" id ="cancelsignup"> 
    </form>
</section>
<div class="msg">
	<h3><%=request.getAttribute("message") %></h3>
</div>
</div>
    <script type="text/javascript">
        const loginlink = document.getElementById('login');
        const signuplink = document.getElementById('signup');
        const loginmodal = document.querySelector('.loginsect');
        const signupmodal = document.querySelector('.signupsect');
        const cancellogin = document.getElementById('cancellogin');
        const cancelsignup = document.getElementById('cancelsignup');
        function showLoginHandler(){
            signupmodal.classList.remove('visible');
            loginmodal.classList.add('visible');
        }
        function cancelLoginHandler(){
            loginmodal.classList.remove('visible');
        }
        function showSignupHandler(){
            loginmodal.classList.remove('visible');
            signupmodal.classList.add('visible');
        }
        function cancelsignupHandler(){
            signupmodal.classList.remove('visible');
        }
        loginlink.addEventListener('click', showLoginHandler);
        cancellogin.addEventListener('click', cancelLoginHandler);
        signuplink.addEventListener('click', showSignupHandler);
        cancelsignup.addEventListener('click', cancelsignupHandler);
    </script>
</body>
</html>