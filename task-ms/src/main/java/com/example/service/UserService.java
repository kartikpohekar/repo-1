package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.User;
import com.example.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public User registerUser(User u) {
        return repo.save(u);
    }

    public User loginUser(String username, String password) {
        User user = repo.findByUsername(username);

        if (user == null) {
            return null;
        }

        if (!user.getPassword().equals(password)) {
            return null;
        }

        return user;
    }
}
