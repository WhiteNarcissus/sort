package mjc.controller;

import mjc.domain.User;
import mjc.myutil.RedisCaheUtils;

import mode.generic.Code;
import mode.generic.ReturnObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpSession;

/**
 * Created by gcb on 2018/12/12.
 */
@Controller
public class LoginController {

   @Autowired
   private RedisCaheUtils redisCaheUtils ;


   @RequestMapping("/signUp")
    public ModelAndView  image(User user, HttpSession session) {


        ModelAndView modelAndView = new ModelAndView();
        ReturnObject returnObject = new ReturnObject();

        //注册
        if(user.getUserPhone() != null &&  !"".equals(user.getUserPhone())){
            returnObject.setCode(Code.SUCCESS);
            returnObject.setData(user);
            returnObject.setMsg("用户："+ user.getUserName() +"---注册");

              modelAndView.addObject(user);
              modelAndView.setViewName("redirect: home/indexHome");
            return modelAndView;
        }


        if(user.getUserName()==null){
            returnObject.setCode(Code.SUCCESS);
            returnObject.setMsg("用户名为空");
            modelAndView.setViewName("/shiro/permissions");
            return modelAndView;
        }


        //主体,当前状态为没有认证的状态“未认证”
        Subject subject = SecurityUtils.getSubject();
        // 登录后存放进shiro token
        try {
        UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(), user.getUserPassword());
        //登录方法（认证是否通过）
        //使用subject调用securityManager,安全管理器调用Realm

            //利用异常操作
            //需要开始调用到Realm中
            System.out.println("========================================");
            System.out.println("1、进入认证方法");
            subject.login(token);
            user = (User)subject.getPrincipal();
            session.setAttribute("user",subject);
            modelAndView.setViewName("menu");
            //放入缓冲
            redisCaheUtils.oset(user.getUserName(),user);
            System.out.println("登录完成");

            returnObject.setCode(Code.SUCCESS);
            returnObject.setData(user);
            returnObject.setMsg("用户："+ user.getUserName() +"---登入");
        } catch (UnknownAccountException e) {

            return null;
        }

        return modelAndView;

    }

  // @RequestMapping("/signUp")
    public ModelAndView aa(){

        //重定向
       // return "redirect: permissions/list";

       ModelAndView modelAndView = new ModelAndView();
       //modelAndView.setViewName("redirect: shiro/permissions");
       modelAndView.setViewName("forward:permissions/list");
      return modelAndView;
    }


}
