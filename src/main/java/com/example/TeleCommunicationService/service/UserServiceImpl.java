package com.example.TeleCommunicationService.service;

import com.example.TeleCommunicationService.entity.User;
import com.example.TeleCommunicationService.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> viewAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User findUserByPhone(Long phone) {
        return userRepo.findUserByPhone(phone);
    }
}
