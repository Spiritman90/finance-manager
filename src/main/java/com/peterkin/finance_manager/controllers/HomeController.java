package com.peterkin.finance_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index () {
        return "index";
    }


    @GetMapping("/login")
    public String loginPage (){
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }

}
