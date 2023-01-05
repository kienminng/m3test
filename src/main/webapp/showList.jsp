<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/1/2023
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quản lý học viên</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Quản lý nhan vien</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Email</th>
            <th>Name</th>
            <th>address</th>
            <th>Phone Number</th>
            <th>Salary</th>
            <th>IdDep</th>
            <th>NameDep</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <button><a href="/create">Create</a></button>
        <form action="/search">
            <input name="search">
            <button type="submit">Search</button>
        </form>
        <form method="post">
            <c:forEach items="${list}" var="hv">
            <tr>
                <td>${hv.email}</td>
                <td>${hv.name}</td>
                <td>${hv.address}</td>
                <td>${hv.phone}</td>
                <td>${hv.salary}</td>
                <td>${hv.idDepartment}</td>
                <td>${hv.department}</td>
                <td><button><a href="/edit?email=${hv.email}">Edit</a></button></td>
                <td><button><a href="/delete?email=${hv.email}">Delete</a></button></td>
            </tr>
        </form>
        </c:forEach>

        </tbody>
    </table>
</div>

</body>
</html>
