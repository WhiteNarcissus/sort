<%--
  Created by IntelliJ IDEA.
  User: gcb
  Date: 2018/12/12
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
%>
<!-- 静态资源文件 如果放在WEB-INF 会报404-->
<script src="<%=basePath%>/importjs/jquery-3.3.1.min.js" ></script>
