<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Post</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>${post.subject}</title>
</head>
<body>
    <div>
        <h2>${post.subject}</h2>
        Posted on ${post.regDate}
    </div>
    <br>
    <div>
        id      : ${post.id}<br>
        subject : ${post.subject}<br>
        content : ${post.content}<br>
        regDate :${post.regDate}<br>
    </div>
</body>
</html>
