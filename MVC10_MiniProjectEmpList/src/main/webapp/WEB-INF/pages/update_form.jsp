<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>   

<h1 style="color:red;text-align:center">UPDATE EMPLOYEE DETAILS</h1>
<style type="text/css">
  span{
  color:red;text-decoration: blink;
   }
</style>



<form:form  modelAttribute="EmpCmd"  >
         <table style="color:white" bgcolor="pink" align="center">
             <tr>
                <td>Employee id:: </td>
                <td><form:input path="eid" readonly="true"/></td>
             </tr>
             <tr>
                <td>Employee name:: </td>
                <td><form:input path="ename"/></td>
             </tr>
             <tr>
                <td>Employee job:: </td>
                <td><form:input path="job"/> </td>
             </tr>
             <tr>
                <td>Employee deptname:: </td>
                <td><form:input path="deptno"/></td>
             </tr>
             
              <tr>
                <td><input type="submit"  value="submit"></td>
                <td><input type="reset"  value="cancel"> </td>
             </tr>
  
          </table>
  </form:form>