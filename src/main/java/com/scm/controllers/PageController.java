package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Handler");

        //Sending data to view
        model.addAttribute("name", "substring");
        model.addAttribute("Youtube", "Abhi");
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutpage(){
        System.out.println("About Page Loading");
        return "about";
    }


    //services
    @RequestMapping("/services")
    public String servicespage(){
        System.out.println("Services Page Loading");
        return "services";
    }

    //Contact page
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }


    //Login
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }
    
    //Register
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
    

    
}
