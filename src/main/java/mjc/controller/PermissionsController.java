package mjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gcb on 2019/1/7.
 */
@Controller
public class PermissionsController {
    @RequestMapping("/list")
    public String permissions(){

        return "shiro/permission";
    }

}
