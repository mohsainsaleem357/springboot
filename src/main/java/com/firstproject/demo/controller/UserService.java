package com.firstproject.demo.controller;
import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final Map<String, User> userDatabase = new HashMap<>();

    public User createUser(String id, String name, String email) {
        User user = new User(id, name, email);
        userDatabase.put(id, user);
        return user;
    }

    public User getUser(String id) {
        return userDatabase.get(id);
    }

    public User updateUser(String id, String name, String email) {
        User existingUser = userDatabase.get(id);
        if (existingUser != null) {
            existingUser.setName(name);
            existingUser.setEmail(email);
            return existingUser;
        }
        return null;
    }

    public User deleteUser(String id) {
        return userDatabase.remove(id);
    }

    public Map<String, User> getAllUsers() {
        return userDatabase;
    }
    
}
