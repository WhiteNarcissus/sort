package mjc.controller;

import mjc.domain.User;
import mjc.myutil.RedisCaheUtils;

import mjc.myutil.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gcb on 2018/12/12.
 */
@Controller
public class LoginController {

   @Autowired
   private RedisCaheUtils redisCaheUtils ;


    @RequestMapping("/signUp")
    public ModelAndView  image(User user) {


        ModelAndView modelAndView = new ModelAndView();

     redisCaheUtils.set("rty","rty");
       String b = redisCaheUtils.get("rty").toString();




        return modelAndView;
    }



}
