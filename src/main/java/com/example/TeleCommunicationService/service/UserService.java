package com.example.TeleCommunicationService.service;

import com.example.TeleCommunicationService.entity.User;

import java.util.List;

public interface UserService {

    public User addUser(User user);

    public List<User> viewAllUser();

    public User findUserByPhone(Long phone);
}
