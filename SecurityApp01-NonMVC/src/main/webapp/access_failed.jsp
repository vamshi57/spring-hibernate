<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1 style="color: red;text-align: center">Access faild page</h1>
<%=request.getUserPrincipal().getName()%> is not Authorized to access the page
<%=request.getUserPrincipal().getClass()%>
<a href="indext.jsp">Home</a>