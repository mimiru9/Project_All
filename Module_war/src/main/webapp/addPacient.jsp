<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.12.2015
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление пациента</title>
</head>
<body>
    <form action="/pacient/add_pacient" method="POST">
        <tr>
            <td>Фамилия</td>
            <input type="text" name="surname" value=""/>
        </tr>
        <br>
        <tr>
            <td>Имя</td>
            <input type="text" name="name" value=""/>
        </tr>
        <br>
        <tr>
            <input type="submit" value="Добавить"/>
        </tr>
    </form>
</body>
</html>
