package mjc.controller;

import mjc.domain.User;
import mjc.myutil.RedisCaheUtils;

import mjc.myutil.RedisUtils;
import mode.generic.Code;
import mode.generic.ReturnObject;
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
        ReturnObject returnObject = new ReturnObject();
        returnObject.setCode(Code.SUCCESS);
        returnObject.setData(user);
        returnObject.setMsg("用户："+ user.getUserName() +"---登入");

        redisCaheUtils.oset(user.getUserName(),user);


//       redisCaheUtils.set("rty","rty");
//       String b = redisCaheUtils.get("rty").toString();
        modelAndView.setViewName("");
        modelAndView.addObject(returnObject);

        return modelAndView;
    }



}
