
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.12.2015
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="manager.PacientRow" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пациент</title>
</head>
<body>
    <%
        List<PacientRow> list = (List<PacientRow>) request.getAttribute("pacList");
    %>
    <table border="1" cellpadding="6" width="50%">
        <caption><h3>Список пациентов</h3></caption>
        <tr>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Отчество</th>
            <th>Дата рождения</th>
        </tr>
        <%
            for (PacientRow pacRow : list){
        %>
        <tr>
            <td>
                <%=pacRow.surname%>
            </td>
            <td>
                <%=pacRow.name%>
            </td>
            <td>
                <%=pacRow.patronymic%>
            </td>
            <td>
                <%
                    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                %>
                <%=format.format(pacRow.birthday)%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <br>
    <right></right><form action="/medDB/pacient/add_pacient" method="post">
            <input type="submit" value="Добавить пациента"/>
    </form>
</body>
</html>
