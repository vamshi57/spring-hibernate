<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <h1 style="color:blue;text-align:center">Person Registration </h1>
    
    
    <center><form:form modelAttribute="perCmd">
    <center><p>
    <form:errors path="*"/>
    </p></center>
    <table bgcolor="lightpink" style="color:black;align:center">
      <tr>
       <td>Name:</td>
       <td><form:input path="name"/></td>
      </tr>
      <tr>
       <td>Age:</td>
       <td><form:input path="age"/></td>
      </tr>
      <tr>
       <td>Gender:</td>
       <td><form:radiobuttons path="gender" items="${genderList }"/></td>
      </tr>
      <tr>
       <td>Hobies:</td>
       <td><form:checkboxes path="hobies" items="${hobiesList}"/></td>
      </tr>
       <tr>
       <td>Courses:</td>
       <td><form:select path="courses" multiple="multiple">
       <form:options items="${coursesList}"/></form:select></td>
      </tr>
       <tr>
       <td>Qualification:</td>
       <td><form:select path="hobies" multiple="no">
       <form:options items="${qlfList}"/>
        </form:select></td>
      </tr>
      <tr><td><input type="submit" value="submit"/></td></tr>
    
    </table>
    </form:form></center>
