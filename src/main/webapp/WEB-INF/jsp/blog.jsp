<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blog</title>
</head>
<body>
    <div>
        <h2>List of Post</h2>
    </div>
    <c:if test="${postList.size() == 0}">
        <div>
            <h2>no data</h2>
        </div>
    </c:if>

    <c:forEach var="post" items="${postList}">
        <div>
            <h2>
                <c:out value="${post.id}" />
                <a href="/post/${post.id}">
                    <c:out value="${post.subject}"/>
                </a>
                <c:out value="${post.regDate}" />
                <a href="/post/${post.id}/delete">
                    delete
                </a>
            </h2>
        </div>
    </c:forEach>
</body>
</html>
