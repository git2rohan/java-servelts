<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.POJO.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>

<p>Hey ${user.getName()} <br></p>

<a href="community.jsp">Checkout our community</a>

<%@ include file="logout.html" %>

</body>
</html>