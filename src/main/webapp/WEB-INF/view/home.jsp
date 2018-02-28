<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>

<div ng-app="loginApp" ng-controller="loginController">
<p>Welcome {$userName}</p>

</div>

<script>
var app = angular.module('loginApp', []);
app.controller('loginController', function($scope) {
    $scope.userName='{$userName}';    
});
</script>

</body>
</html>