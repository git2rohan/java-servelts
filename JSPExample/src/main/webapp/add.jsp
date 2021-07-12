<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! int i,j,k; %>
	<%
		i = Integer.parseInt(request.getParameter("num1"));
		j = Integer.parseInt(request.getParameter("num2"));
		
		k = i + j;
		
		//let's use implicit objects
		//request we've already used above
		//response
		//page context
		pageContext.setAttribute("pageCtx", "hey this is page ctx value");
		//session
		session.setAttribute("sessionAttr", "sessionAttrValue");
		//application - servlet context
		application.setAttribute("applicationCtx", "app ctx value");
		//config - servlet config // set inside deployment descriptor file - web.xml
		//out object
		out.println("This works as PrintWriter");
		
		//let's configure exception/error page on @page directives
		 
	%>
	<br>
	Output : num1+num2 = <%=k %>
	<br>
	<%= pageContext.getAttribute("pageCtx") %><br>
	<%= session.getAttribute("sessionAttr") %><br>
	<%= application.getAttribute("applicationCtx") %><br>
	
	To check error page just pass string values in num1 and num2
</body>
</html>