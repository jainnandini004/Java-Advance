<%--Here we used JSP Action Tags listed below-
	jsp:useBean
    jsp:setProperty
    jsp:getProperty
   --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="JavaBean2.jsp">
Enter Id:<input type="text" name="id"/>
Enter Name:<input type="text" name="name"/>
Enter Email:<input type="text" name="email"/>
<input type="submit" value="Submit"/>
</form>
</body>
</html>