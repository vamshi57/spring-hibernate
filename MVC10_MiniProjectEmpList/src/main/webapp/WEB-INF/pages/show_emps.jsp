<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  
  
 <c:choose>
    <c:when test="${!empty listDTO}">
    
     <table align="center" border="1">
      <tr style="color:white" bgcolor="pink">
        <th>srNo </th> <th>Empid</th> <th>EmpName </th> <th>Desg </th> <th>deptno </th> <th>Operation</th> 
      </tr>
      <c:forEach var="emp" items="${listDTO}">
        <tr bgcolor="lightblue" >
           <td>${emp.srno}</td>
           <td>${emp.eid}</td>
           <td>${emp.ename}</td>
           <td>${emp.job}</td>
           <td>${emp.deptno}</td>
           <td><a href="update.htm?eid=${emp.eid}"><img src="images/update.png" width="20" height="20"></a>
          &nbsp &nbsp <a href="delete.htm?eid=${emp.eid}"><img src="images/delete.jpg" width="20" height="20"></a>
           </td>
        </tr>
      </c:forEach>
    
    </table>
    </c:when>
    
  <c:otherwise>
       <h1 style="color:red;text-align:center"> Records not found </h1>
       
    </c:otherwise>
 
 </c:choose>
 
 <br><br>
 <center><a href="add.htm"><img src="images/add.jpg" width="40" height="40"></a></center>
   <h3><a href="home.htm"><img  src="images/home.png" width="50"height="50"></a></h3>
