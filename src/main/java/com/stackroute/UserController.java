package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("login")
    public ModelAndView greet(@RequestParam("t1") String user)
    {
        ModelAndView mv = new ModelAndView();

        mv.addObject("username",user);
        mv.setViewName("display");
        return mv;
    }
}
