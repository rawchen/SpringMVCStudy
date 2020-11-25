<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>TITLE</title>
</head>
<body>
<h3>这是一个jsp页面</h3>

<%-- 常用注解 --%>
<a href="anno/testRequestParam?name=haha">RequestParam</a>

<br>

<form action="anno/testRequestBody" method="post">
	用户姓名：<input type="text" name="username"/><br>
	用户年龄：<input type="text" name="age"/><br>
	<input type="submit" value="提交">
</form>

<br>

<a href="anno/testPathVariable/10">PathVariable</a>

<br>

<a href="anno/testRequestHeader">RequestHeader</a>

<br>

<a href="anno/testCookieValue">CookieValue</a>

<br>

<form action="anno/testModelAttribute" method="post">
	用户姓名：<input type="text" name="uname"/><br>
<%--	用户年龄：<input type="text" name="age"/><br>--%>
	<input type="submit" value="提交">
</form>

<br>

<a href="anno/testSessionAttributes">存入SessionAttributes</a>
<br>
<a href="anno/getSessionAttributes">取出getSessionAttributes</a>
<br>
<a href="anno/deleteSessionAttributes">删除deleteSessionAttributes</a>
<br>

</body>
</html>
