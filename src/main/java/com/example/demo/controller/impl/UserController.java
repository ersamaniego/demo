package com.example.demo.controller.impl;

import com.example.demo.model.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/users")
public interface UserController {
    @GetMapping
    ResponseEntity<List<UserDto>> getUsers();
    @GetMapping("/{id}")
    ResponseEntity<UserDto> getUser(@PathVariable Long id);

}
