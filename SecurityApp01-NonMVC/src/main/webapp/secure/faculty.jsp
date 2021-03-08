<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <h1 style="color:blue;text-align: center">Faculty page</h1>
   Current username is <%=request.getUserPrincipal().getName()%><br>
   <a href="../index.jsp">Home</a>
   <a href="../logout">logout</a>