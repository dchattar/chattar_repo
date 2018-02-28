<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
   	<link href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<p>Welcome ${userName}</p>
<table class="table table-striped">
<thead><tr><th>UserName</th><th>Password</th></tr></thead>
<tbody>
<c:forEach items="${users}" var="user"> 
<tr>
<td>${user.userName}</td>
<td>${user.password}</td>
<td><a class="btn btn-danger" href="/deleteUser?userName=${user.userName}">Delete</a></td>
</tr>
</c:forEach>
</tbody></table>
<div class="btn btn-success"><a href="/addUser">Add User</a></div>
</div>
</body>
<script src="webjars/jquery/1.11.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>