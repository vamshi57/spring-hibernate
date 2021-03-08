<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  
  
 <c:choose>
    <c:when test="${!empty listDTO}">
    
     <table align="center" border="1">
      <tr bordercolor="blue">
        <th>srNo </th> <th>Empid</th> <th>EmpName </th> <th>Desg </th> <th>deptno </th> 
      </tr>
      <c:forEach var="emp" items="${listDTO}">
        <tr>
           <td>${emp.srno}</td>
           <td>${emp.eid}</td>
           <td>${emp.ename}</td>
           <td>${emp.job}</td>
           <td>${emp.deptno}</td>
        </tr>
      </c:forEach>
    
    </table>
    </c:when>
    
  <c:otherwise>
       <h1 style="color:red;text-align:center"> Records not found </h1>
       
    </c:otherwise>
 
 </c:choose>
 
 <br><br>
   <h3><a href="welcome.htm">home</a></h3>
