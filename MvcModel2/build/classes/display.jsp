<%@ page import="java.util.List" %>
<%@ page import="org.hcl.model.Emp" %>
<%@ page   language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<%List<Emp> employees = (List<Emp>)request.getAttribute("empatt");
	for(Emp e: employees){%>
	<tr>
	<td><%= e.getEno() %></td>
	<td><%= e.getEname() %></td>
	<td><%= e.getAddress() %></td>
	</tr>
	<%} %>
	</table>
</body>
</html>