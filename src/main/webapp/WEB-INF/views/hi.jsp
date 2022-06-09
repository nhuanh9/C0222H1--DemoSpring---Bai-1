<%--
  Created by IntelliJ IDEA.
  User: daonhuanh
  Date: 5/27/22
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <c:forEach var="p" items="${list}">
            <h1>${p.name}</h1>
        </c:forEach>
</body>
</html>
