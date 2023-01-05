<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/1/2023
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
  <a href="/Home">Back to customer list</a>
</p>
<form method="post"  action="/edit">
  <fieldset>
    <legend>Customer information</legend>
    <table>
      <tr>
        <td>Email</td>
        <td><input type="text" name="email" id="email" value="${employee.email}" readonly></td>
      </tr>
      <tr>
        <td>Name: </td>
        <td><input type="text" name="name" id="name" value="${employee.name}"></td>
      </tr>
      <tr>
        <td>address </td>
        <td><input type="text" name="birth" id="birth" value="${employee.address}"></td>
      </tr>
      <tr>
        <td>Phone: </td>
        <td><input type="text" name="address" id="address" value="${employee.phone}"></td>
      </tr>
      <tr>
        <td>Salary: </td>
        <td><input type="text" name="phone" id="phone" value="${employee.salary}"></td>
      </tr>

      <tr>
        <td>Class:</td>
        <td><select name="class" id="class" value="${employ.idDepartment}">
          <option value="1">nhan vien</option>
          <option value="2">quan li </option>
          <option value="3">giam doc</option>
        </select></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Update customer"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
