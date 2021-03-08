<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <h2 style="color:red;text-align:center;">page setting</h2>
 <form:form modelAttribute="pageCmd" action="report.htm">
     Enter PageSize <form:input path="pagesize"/><br><br>
      <form:hidden  path="pageNo" />
      <input type="submit" value="get Report">
</form:form>
    
