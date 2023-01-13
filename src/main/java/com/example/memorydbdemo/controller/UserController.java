package com.example.memorydbdemo.controller;

import com.example.memorydbdemo.model.User;
import com.example.memorydbdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers () {
        List<User> users = userService.getAllUsers();
        return users;
    }


}
