package net.bkv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bkv on 14.11.2014.
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model){
        model.addAttribute("message", "Spring3 MVC hello world");
        return "hello";
    }

}
