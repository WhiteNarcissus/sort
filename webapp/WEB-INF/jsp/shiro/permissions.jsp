<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
          <c:forEach var="role" items="${list}" >
           <option value="" selected >${role}</option>
          </c:forEach>

      </select>
      <br>
      <label >权限</label>
      <tr>
          <td>模块</td>
      </tr>

      <p>
          <button id="savePermission" value="保存">保存</button>
      </p>

  </from>

</div>


</body>
</html>
