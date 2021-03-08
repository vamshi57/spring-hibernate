<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form  modelAttribute="patCmd">
         <table bgcolor="cyan" align="center">
             <tr>
                <td>Patient Name:: </td>
                <td><form:input path="name"/> </td>
             </tr>
             <tr>
                <td>Patient Location:: </td>
                <td><form:input path="location"/> </td>
             </tr>
             <tr>
                <td>Patient age:: </td>
                <td><form:input path="age"/> </td>
             </tr>
             <tr>
                <td>Hospital:: </td>
                <td><form:input path="hospital"/> </td>
             </tr>
             
              <tr>
                <td><input type="submit"  value="register"></td>
                <td><input type="reset"  value="cancel"> </td>
             </tr>
  
          </table>
  </form:form>