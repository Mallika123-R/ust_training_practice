<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
..


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Page</title>
</head>

<body>
<h1>Registration Page</h1>

<form action="userRegister" method="post">
    Name : <input type="text" name="ename">
    Phone : <input type="number" name="phone">
    Email : <input type="email" name="email">
    <input type="submit" value="Register">
</form>