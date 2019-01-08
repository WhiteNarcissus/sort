package mjc.controller;

import mjc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gcb on 2019/1/8.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/indexHome")
    public ModelAndView indexHome(User user){
        ModelAndView modelAndView = new ModelAndView("home/indexHome");



        return  modelAndView;
    }


}
