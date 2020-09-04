<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/admin/test" >测试</a>
<form method="post" action="${pageContext.servletContext.contextPath}/admin/regisregisterUser">
    id:<input name="userId" type="text" /><br>
    userName:<input name="userName" type="text" /><br>
    userPassword:<input name="userId" type="text" /><br>
    <input type="submit" />
</form>
</body>
</html>
