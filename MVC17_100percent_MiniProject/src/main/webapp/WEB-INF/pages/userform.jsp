<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="text-align: center;color: red">USER FORM</h1>
<form:form modelAttribute="userCmd">
<center>
  <table >
    <tr><td>name</td>
    <td><form:input path="username"/>  </td>
    </tr>
    <tr><td>password</td>
    <td><form:input path="password"/>  </td>
    </tr>
    <tr><td colspan="2">
    <input type="submit" value="submit"/>
    </td>
    </tr>
  </table>
  </center>

</form:form>
