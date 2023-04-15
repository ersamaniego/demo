package com.example.demo.controller.impl;

import com.example.demo.model.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController{
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @Override
    public ResponseEntity<List<UserDto>> getUsers() {
        List<UserDto> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @Override
    public ResponseEntity<UserDto> getUser(Long id) {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
