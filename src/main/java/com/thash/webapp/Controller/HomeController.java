package com.thash.webapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    String Home(){
        return "Home page";
    }


    @RequestMapping("/about")
    public String about(){
        return "About page";
    }
}
