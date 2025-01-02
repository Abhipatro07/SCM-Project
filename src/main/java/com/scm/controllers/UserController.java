package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/user")
public class UserController {
    //*user dashboard
    @RequestMapping(value = "/dashboard")
    public String userDashboard() {
        return "user/dashboard";
    }
    //* user profilepage
    @RequestMapping(value = "/profile")
    public String userProfile() {
        return "user/profile";
    }
    //*user add contact
    //*user view contact
    //*user edit contact
    //*user delet contact
    //*user search contact


}
