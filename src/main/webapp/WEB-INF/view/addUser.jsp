<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h3>Add user</h3>
		<form action="/addUser" method="post">
			<fieldset>
				<label>UserName:</label> <input class="form-control" type="text"
					name="userName">
			 <label>Password:</label><input
					class="form-control" type="password" name="password">
					</fieldset><br>
			<input class="btn btn-success" type="submit" value="add">
		</form>
	</div>
</body>
<script src="webjars/jquery/1.11.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>