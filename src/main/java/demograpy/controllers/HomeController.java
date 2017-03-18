package demograpy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mahedi on 3/15/2017.
 */

@Controller
public class HomeController {

    /**
     * This method return the home page of the website
     *
     * @return index.html
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
