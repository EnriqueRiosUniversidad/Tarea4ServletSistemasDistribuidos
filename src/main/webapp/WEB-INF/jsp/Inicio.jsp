<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mostrar Datos</title>
</head>
<body>
    <h1>Datos de la API</h1>
    <table border="1">
        <tr>
            <th>User ID</th>
            <th>Title</th>
            <th>Body</th>
        </tr>
        <c:forEach items="${data}" var="item">
            <tr>
                <td>${item.userId}</td>
                <td>${item.title}</td>
                <td>${item.body}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
