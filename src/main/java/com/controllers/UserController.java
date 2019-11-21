package com.controllers;

import com.domain.User;
import com.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashSet;

@Controller
@RequestMapping("/user/{id}")
public class UserController {

    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public User getUser(){
        User user = new User();
        return  user;
    }


    @GetMapping("user/add")
    public String preaperUsercreation(){

        return "ścieżka do ";
    }

    @PostMapping("user/add")
    public String addUser(String userName, String firstName, String lastName, String email, String city, String street_Number, String postCode, Model model){

        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setCity(city);
        user.setStreet_Number(street_Number);
        user.setPostCode(postCode);
        model.addAttribute("user", user);
        return "user";
    }


}
