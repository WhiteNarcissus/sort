<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ include file="WEB-INF/jsp/head.jsp"%>
</head>
<body>
<h2>Hello World!</h2>
<div>
    <form id="login" method="post" >
        <p>用户名：<input id="userName" name="userName" type="text" /></p>  <!--用户名文本框-->
        <p>密　码：<input id="userPassword" name="userPassword" type="password" /></p>  <!--密码文本框-->
        <p id="retry"  hidden="hidden">再次输入： <input id="checkPassword" name="checkPassword"  type="password" placeholder="再次输入密码"/></p>
    </form>
    <p>
        <button id="subLogin" value="提交">登入</button>
        <button id="signUp"   value="注册">注册</button>
    </p>
</div>


<script >
    debugger
    var ctx = "<%=basePath%>"+"<%=path%>"+"/";
    $("#subLogin").click(function () {
        $("#retry").hide();
       $.ajax({
         url :ctx+'signUp.do',
         data :$("#login").serialize(),
         type :"POST",
         success : function () {
             alert();
         }

       })
    });

    $("#signUp").click(function (){
        $("#retry").show();
        var userPassword=$("#userPassword").val();
        var checkPassword=$("#checkPassword").val();
        if(checkPassword==userPassword){
            $.ajax({
                url:ctx+'signUp.do',
                data:$("#login").serialize(),
                type:"POST",
                success:function () {
                  alert("signUp");
                }

            })

        }else {
            alert("请两次密码不一致");
        }

    })


</script>
</body>
</html>
