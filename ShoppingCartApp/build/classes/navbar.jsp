<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <nav class="navbar">
        <ul class="unorderedlist">
            <li class="itemlist"><a href="home">Home</a></li>
            <li class="itemlist"><a href="#">About us</a></li>
            <c:if test="${sessionScope.user!=null}" ><li class="itemlist"><a href="products">Products</a></li></c:if>
			<c:if test="${sessionScope.user.designation=='manager'}" ><li class="itemlist"><a href="addproduct">Add Products</a></li></c:if>
            <c:if test="${sessionScope.user!=null}" ><li class="itemlist"><a href="logout">Logout</a></li></c:if>
            <c:if test="${sessionScope.user==null}" ><li class="itemlist"><a id="login" href="#" >Login</a></li></c:if>
            <c:if test="${sessionScope.user==null}" ><li class="itemlist"><a id="signup" href="#" >Sign up</a></li></c:if>
        </ul>
    </nav>
