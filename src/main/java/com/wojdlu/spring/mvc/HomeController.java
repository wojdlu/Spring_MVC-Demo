package com.wojdlu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @RequestParam("studentName") String name,
                              Model model){
        String result = name.toUpperCase() + " m8";
        model.addAttribute("shoutName", result);
        return "helloworld";
    }

}
