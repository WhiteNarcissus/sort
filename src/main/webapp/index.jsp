<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ include file="WEB-INF/jsp/head.jsp"%>
</head>
<body>
<h2>Hello World!</h2>
<div>
    <form id="login" >
        <p>用户名：<input id="userName" name="userName" type="text" /></p>  <!--用户名文本框-->
        <p>密　码：<input id="userPassword" name="userPassword" type="text" /></p>  <!--密码文本框-->
        <p>：<input id="checkPassword" name="checkPassword"  hidden="hidden" type="text" value="再次输入密码" /></p>
        <p>
           <button id="subLogin" value="提交">提交</button>
           <button id="signUp"   value="注册">注册</button>
        </p>
    </form>
</div>


<script >

    $("#subLogin").click(function () {

       $.ajax({
         url :"",
         data :$("#login").serialize(),
         type :"POST",
         success : function () {
             alert("success");
         }

       })
    });

    $("#signUp").click(function (){
        $("#checkPassword").toggle();
        $.ajax({
           url:"",
           data:$("#login").serialize(),
           type:"POST",
            success:function () {
                alert("signUp");
            }

        })

    })


</script>
</body>
</html>
