<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Registration Form</h1>
<form action ="RegisterServlet" method = "post">
    <br>Name: <input type = "text" name = "userName">
    <br>Password: <input type = "password" name= "password">
    <br>Email: <input type = "text" name = "email">
    <br>Language: <select name = "language">
        <option>English</option>
        <option>Spanish</option>
        <option>French</option>
        </select>
        <br><input type = "submit" value = "Call Servlet" />
</form>
</body>
</html>