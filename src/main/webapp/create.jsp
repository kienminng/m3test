<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/1/2023
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form method="post" action="/create">
  Add new Student
  <table>
    <tr>

      <td><input name="email" type="text" placeholder="email"></td>
    </tr>
    <tr>

      <td><input name="name" type="text" placeholder="name"></td>
    </tr>
    <tr>

      <td><input name="address" type="text" placeholder="address"> </td>
    </tr>

    <tr>

      <td><input name="phone" type="text" placeholder="phone"></td>
    </tr>
    <tr>

      <td><input name="salary" type="number" placeholder="salary"></td>
    </tr>

    <tr>
      <td>
        <select name="idClassRoom">

          <option value="1">Nhan vien</option>
          <option value="2">quan li</option>
          <option value="3">giam doc</option>

        </select>
      </td>
    </tr>
  </table>
  <button type="submit">Create</button>
</form>
</body>
</html>
