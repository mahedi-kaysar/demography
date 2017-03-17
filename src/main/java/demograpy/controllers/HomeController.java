package demograpy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mahedi on 3/15/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
