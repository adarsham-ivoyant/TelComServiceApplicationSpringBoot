package com.example.TeleCommunicationService.controller;

import com.example.TeleCommunicationService.entity.User;
import com.example.TeleCommunicationService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("UserRegistration")
    public String add(@RequestBody User user){
        userService.addUser(user);
        return "User added successfully";
    }

    @GetMapping("GetAllUser")
    public List<User> getAllUser(){
        return userService.viewAllUser();
    }

    @GetMapping("GetUserByPhone/{phone}")
    public User getUserByPhoneNum(@PathVariable("phone") Long phone){
        return userService.findUserByPhone(phone);
    }
}
