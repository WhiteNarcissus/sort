<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=gb2312">
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ include file="WEB-INF/jsp/head.jsp"%>
</head>
<body>
<h2>Hello World!</h2>
<div>
    <form  method="post" action="<%=basePath%>/signUp" >
        <p>用户名：<input id="userName" name="userName" type="text" /></p>  <!--用户名文本框-->
        <p>密　码：<input id="userPassword" name="userPassword" type="password" /></p>  <!--密码文本框-->
        <p id="retry" class="retry"  hidden="hidden">
            再次输入密码： <input id="checkPassword" name="checkPassword"  type="password" placeholder="再次输入密码"/><br>
            手机： <input id="userPhone" name="userPhone"  type="text" placeholder="手机号码"/><br>
            爱好：  <input type="checkbox" name="userHobbit" value="运动">运动<br>
            <input type="checkbox" name="userHobbit" value="音乐">音乐<br>
            <input type="checkbox" name="userHobbit" value="画画">画画<br>
            <input type="checkbox" name="userHobbit" value="一切可以称得上爱好的爱好">一切可以称得上爱好的爱好<br>
            个性签名： <input id="userMessage" name="userMessage"  type="text" placeholder="输入签名"/><br>
        </p>
        <input type=button id="subLogin"  type=submit  value="登入"  onclick="return check(this.form)">
        <input type=button id="signUp"  type=submit  value="注册" onclick="return check(this.form)">
    </form>


</div>


<script >

    function check(form){
        var userName = $("#userName").val();
        var userPassword = $("#userPassword").val();
        $(".retry").hide();

      if(userName != null && userPassword != null && userPassword !="" && userName != "" ){
          $.ajax({
              url :"<%=basePath%>/signUp",
              data :$("#login").serialize(),
              type :"POST",
              success : function () {
                  window.location.href='<%=basePath%>/home/indexHome'
              }

          })
      }

    }



    $("#signUp").click(function (){
        $(".retry").show();
        var userPassword=$("#userPassword").val();
        var checkPassword=$("#checkPassword").val();
        if(checkPassword==userPassword && checkPassword !=""){
            $.ajax({
                url:"<%=basePath%>/signUp",
                data:$("#login").serialize(),
                type:"POST",
                success:function () {
                    // 这里的 跳转 就像 向浏览器重新 输入一个地址所以最好不要用ajax做跳转 ，这样显得很愚蠢 ajax 是不会跳转的
                    window.location.href='<%=basePath%>/home/indexHome'
                }

            })
        }else {
            alert("请两次密码不一致");
        }

    })



</script>
</body>
</html>
