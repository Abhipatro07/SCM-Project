package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
