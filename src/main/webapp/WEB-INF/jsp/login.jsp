<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Log-in</title>
</head>
<body>
    <form action="/login" method="post">
        User Name : <input type="text" name="username"><br>
        Password : <input type="password" name="password"><br>
        Remember me : <input type="checkbox" name="remember-me"><br>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <input type="submit" value="Sign In">
    </form>
</body>
</html>