<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <form:form method="post" modelAttribute="pCmd" enctype="multipart/form-data">
      <table>
         <tr><td>name::</td><td><form:input path="name"/></td>
         <tr><td>resume::</td><td><form:input type="file" path="resume"/></td>
         <tr><td>photo::</td><td><form:input  type="file" path="photo"/></td>
          <tr>
            <td colspan="2"> <input type="submit"  value="register"/> </td>
         </tr>
      </table>
    
    
    </form:form>
