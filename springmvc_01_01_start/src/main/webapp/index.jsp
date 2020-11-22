<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>TITLE</title>
</head>
<body>
<h3>这是一个jsp页面</h3>
<a href="hello">入门程序</a>
<a href="param/testParam?username=username&password=123">入门程序-参数绑定</a>

<%--
把数据封装到Account类中
<form action="param/saveAccount" method="post">
	姓名：<input type="text" name="username"/><br>
	密码：<input type="text" name="password"/><br>
	金额：<input type="text" name="money"/><br>
	用户姓名：<input type="text" name="user.uname"/><br>
	用户年龄：<input type="text" name="user.age"/><br>
	<input type="submit" value="提交">
</form>
--%>

<%-- 把数据封装到Account类中，类中存在list和map集合 --%>
<form action="param/saveAccount" method="post">
	姓名：<input type="text" name="username"/><br>
	密码：<input type="text" name="password"/><br>
	金额：<input type="text" name="money"/><br>

	用户姓名：<input type="text" name="list[0].uname"/><br>
	用户年龄：<input type="text" name="list[0].age"/><br>

	用户姓名：<input type="text" name="map['one'].uname"/><br>
	用户年龄：<input type="text" name="map['one'].age"/><br>
	<input type="submit" value="提交">
</form>

</body>
</html>
