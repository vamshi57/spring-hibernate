<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <h1 style="color:blue;text-align:center"><spring:message code="form.title"></spring:message></h1>
    <table bgcolor="lightpink" align="center">
   <form:form modelAttribute="patCmd">
   <tr><td>
    <spring:message code="form.patName"/><form:input path="patName"/><br>
    </td></tr>
    <tr><td>
    <spring:message code="form.patAddr"/><form:input path="patAddr"/><br>
    </td></tr>
    <tr><td>
    <spring:message code="form.patAge"/><form:input path="patAge"/><br>
    </td></tr>
    <tr><td>
    <input type="submit" value="<spring:message code='form.submit'/>"/>
   </td></tr>
   </form:form>
    </table>
   <br>
   <center><a href="?language=hi_IN">Hindi</a>&nbsp;&nbsp;
   <a href="?language=te_IN">telugu</a>&nbsp;&nbsp;</center>
   

