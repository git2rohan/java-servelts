<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Simply variable</h4>${name} : check if Ends with "Soudey" => ${fn:endsWith(name, "Soudey")}

	<c:if test="${fn:length(students)>0}">

		<h4>Let's print Students list :</h4>

		<c:forEach items="${students}" var="student">
	 -----------Splitted name----------- <br>
			<c:forEach items="${fn:split(student.name, ' ')}" var="splittedName">
			${splittedName } ,length  => ${fn:length(splittedName)}
							 ,index of 'a' => ${fn:indexOf(splittedName, "a")}
							 ,contains 'h' => ${fn:contains(splittedName, 'h')} 
							<br>
			</c:forEach>
			<br>

		</c:forEach>

	</c:if>

</body>
</html>