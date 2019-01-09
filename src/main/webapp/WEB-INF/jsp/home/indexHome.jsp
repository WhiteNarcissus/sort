<%@ taglib prefix="apache shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: gcb
  Date: 2019/1/8
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SORT</title>
</head>
<body>

来了来了
<shiro:hasPermission name="admin:delete">
    222222
</shiro:hasPermission>
</body>
</html>
