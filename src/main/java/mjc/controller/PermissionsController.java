package mjc.controller;

import org.apache.shiro.crypto.hash.Hash;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gcb on 2019/1/7.
 */
@Controller
@RequestMapping("/permissions")
public class PermissionsController {
    @RequestMapping("/list")
    public ModelAndView permissions(String s){
           ModelAndView modelAndView = new ModelAndView();
           modelAndView.setViewName("shiro/permissions");
            List list = new ArrayList();

            list.add(1);
            list.add(2);
           modelAndView.addObject("list",list);
        return modelAndView;
    }

}
