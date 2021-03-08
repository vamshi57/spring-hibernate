<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>   

<h1 style="color:red;text-align:center">Corona Patient Registration</h1>
<style type="text/css">
  span{color:red;text-decoration: blink; }
</style>

<noscript>enable the javascript</noscript>

<script type="javascript" src="js/validation.js"></script>


<form:form  modelAttribute="patCmd" onsubmit="return validate(this)" >
<%-- <center>
  <p style="color:red">
   <li><form:errors path="*"/></li>
  </p>
</center> --%>

         <table bgcolor="cyan" align="center">
             <tr>
                <td>Patient Name:: </td>
                <td><form:input path="name"/><form:errors path="name"/><span id="nameErr" ></span> </td>
             </tr>
             <tr>
                <td>Patient Location:: </td>
                <td><form:input path="location"/><form:errors path="location"/><span id="locationErr"/> </td>
             </tr>
             <tr>
                <td>Patient age:: </td>
                <td><form:input path="age"/><form:errors path="age"/><span id="ageErr"/> </td>
             </tr>
             <tr>
                <td>Hospital:: </td>
                <td><form:input path="hospital"/><form:errors path="hospital"/> <span id="hospitalErr"/></td>
             </tr>
             
              <tr>
                <td><input type="submit"  value="register"></td>
                <td><input type="reset"  value="cancel"> </td>
             </tr>
  
          </table>
  </form:form>