<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    
    <center>
<c:choose>
   <c:when test="${!empty listRDTO }">
     <table border="1" bgcolor="blue">
      <tr><th>Employee no</th><th>Employee name</th><th>Employee salary</th><th>Dept no</th><th>Address</th></tr>
       <c:forEach  var="emp" items="${listRDTO }">
           <tr bgcolor="orange">
              <td>${emp.eno} </td>
              <td>${emp.ename } </td>
               <td>${emp.esal} </td>
               <td>${emp.deptno} </td>
              <td>${emp.addr } </td>
           </tr>
        </c:forEach>
     </table>
   </c:when>
 
    <c:otherwise>
       <h1 style="color:red;text-align:center">Records  not Found </h1>
    </c:otherwise>
 
</c:choose>
</center>

<br> <a href="home.htm">search again</a>