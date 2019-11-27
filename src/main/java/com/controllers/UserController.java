package com.controllers;

import com.domain.User;
import com.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/user/{id}")
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
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
    public String addUser(String userName, String firstName, String lastName, String email, String city, String street_Number, String postCode){

        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setCity(city);
        user.setStreet_Number(street_Number);
        user.setPostCode(postCode);
        userRepository.save(user);
        log.info("Użytkownik : " + userName + " został zapisany.");

        return "user";
    }

}
