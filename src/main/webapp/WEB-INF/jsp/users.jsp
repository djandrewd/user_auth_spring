<%--
  Created by IntelliJ IDEA.
  User: andreymi
  Date: 4/10/2017
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

Hello users
<br/>
<c:forEach items="${users}" var="user">
    <table>
        <tbody>
        <tr>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.type}"/></td>
        </tr>
        </tbody>
    </table>
</c:forEach>
</body>
</html>
