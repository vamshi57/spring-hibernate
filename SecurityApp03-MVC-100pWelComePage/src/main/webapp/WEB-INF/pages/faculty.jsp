<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   <h1 style="color:blue;text-align: center">Faculty page</h1>
  <p style="text-align: center"> Current username is <%=request.getUserPrincipal().getName()%></p><br>
   <a href="welcome.htm">Home</a><br>
   <a href="logout">logout</a>