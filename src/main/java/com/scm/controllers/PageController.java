package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.Entities.User;
import com.scm.forms.userform;
import com.scm.helpers.Message;
import com.scm.helpers.MessageType;
import com.scm.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
public class PageController {
    @Autowired
    private UserService userService;

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
    public String register(Model model) {
        userform userform = new userform();
        model.addAttribute("userform", userform);
        return new String("register");
    }
    

    // processing register
    @RequestMapping(value = "/do-register" , method = RequestMethod.POST)
    public String processRegister(@Valid@ModelAttribute userform userform ,BindingResult rBindingResult, HttpSession session){
        System.out.println("Processing Registration");
        //* fetch the form data
        //? user form
        System.out.println(userform);
        //* Validate form data
        if(rBindingResult.hasErrors()){
            return "register";
        }

        //* save to DB
        // User user = User.builder()
        //     .name(userform.getName())
        //     .email(userform.getEmail())
        //     .password(userform.getPassword())
        //     .about(userform.getAbout())
        //     .phoneNumber(userform.getPhoneNumber())
        //     .profilePic("https://img.freepik.com/free-vector/blue-circle-with-white-user_78370-4707.jpg")
        //     .build();
        User user = new User();
        user.setName(userform.getName());
        user.setEmail(userform.getEmail());
        user.setPassword(userform.getPassword());
        user.setAbout(userform.getAbout());
        user.setPhoneNumber(userform.getPhoneNumber());
        user.setProfilePic("https://img.freepik.com/free-vector/blue-circle-with-white-user_78370-4707.jpg");


        User savedUser = userService.saveUser(user);
        System.out.println("User Saved");
        //* message = Registration succesfully
        // add the message
        
        Message message = Message.builder().content("Registartion Successful").type(MessageType.green).build();
        session.setAttribute("message" , message);

        //* redirect to log in page
        return "redirect:/register";
    }

    
}
