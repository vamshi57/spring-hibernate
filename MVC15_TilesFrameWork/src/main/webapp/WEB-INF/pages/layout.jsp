<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
  <title><tiles:insertAttribute name="title" ignore="true"/> </title>
  <body>
    <table border="1" cellspacing="2" align="center" width="100%" height="100%">
       <tr bgcolor="lightblue">
          <td height="30" colspan="2"><tiles:insertAttribute name="header"/></td>
       </tr>
       <tr bgcolor="lightpink">
            <td height="50" width="20"><tiles:insertAttribute name="menu"/>  </td>
            <td  width="80"><tiles:insertAttribute name="body"/></td>
       </tr>
       <tr>
          <td height="20" colspan="2"><tiles:insertAttribute name="footer"/></td>
       </tr>
    </table>
  </body>
</html>