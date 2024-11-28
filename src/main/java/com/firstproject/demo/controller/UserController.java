package com.firstproject.demo.controller;

import java.util.Map;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestParam String id, @RequestParam String name, @RequestParam String email) {
        return userService.createUser(id, name, email);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestParam String name, @RequestParam String email) {
        return userService.createUser(id, name, email);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }

    @GetMapping
    public Map<String, User> getAllUsers() {
        return userService.getAllUsers();
    }
}
