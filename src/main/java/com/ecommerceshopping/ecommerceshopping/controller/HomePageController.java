package com.ecommerceshopping.ecommerceshopping.controller;

import com.ecommerceshopping.ecommerceshopping.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/")//this is the root page
    public String login(Model model){
        User user=new User();
        model.addAttribute("user",user);
        //or you can write it like this: model.addAttribute("user", new User())
        //creating new user to use in viewer page
        return "home";

    }
}
