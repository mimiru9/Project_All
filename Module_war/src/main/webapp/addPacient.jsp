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
    <script>
        function goBack() {
            window.history.back()
        }
    </script>
</head>
<body>
    <form action="/medDB/pacient/add_pacient/add" method="post">
        <table>
            <tbody>
            <tr>
                <td>Фамилия</td>
                <td>
                    <input type="text" name="surname" value=""/>
                </td>
            </tr>
            <tr>
                <td>Имя</td>
                <td>
                    <input type="text" name="name" value=""/>
                </td>
            </tr>
            <tr>
                <td>Отчество</td>
                <td>
                    <input type="text" name="patronymic" value=""/>
                </td>
            </tr>
            <tr>
                <td>Дата рождения</td>
                <td>
                    <input type="date" name="birthday" value=""/>
                </td>
            </tr>
            <tr>
                <td>Пол</td>
                <td>
                    <input type="text" name="gender" value=""/>
                </td>
            </tr>
            <tr>
                <td>Адрес</td>
                <td>
                    <input type="text" name="address" value=""/>
                </td>
            </tr>
            <tr>
                <td>Телефон</td>
                <td>
                    <input type="text" name="phone" value=""/>
                </td>
            </tr>
            <tr>
                <td>E-mail</td>
                <td>
                    <input type="text" name="e_mail" value=""/>
                </td>
            </tr>
            <tr>
                <td>Номер страхового полиса</td>
                <td>
                    <input type="text" name="strah_polis" value=""/>
                </td>
            </tr>
            </tbody>
        </table>
        <input type="submit" name="add" value="Добавить"/>
        <input type="button" name="cancel" value="Назад" onclick="goBack()">
    </form>
</body>
</html>
