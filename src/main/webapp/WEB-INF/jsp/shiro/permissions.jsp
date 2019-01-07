<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: gcb
  Date: 2019/1/7
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
  <from  action="/permission/list"  id="permissionForm" method="post">
       <label >角色</label>
      <select name="role-permission-edit" id="roleId">

      </select>
      <label >权限</label>

      <p>
          <button id="savePermission" value="保存">保存</button>
      </p>

  </from>

</div>


</body>
</html>
