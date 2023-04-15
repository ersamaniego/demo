package com.example.demo.service;

import com.example.demo.model.dto.UserDto;

import java.util.List;

public interface UserService{
    List<UserDto> getUsers();
    UserDto getUser(Long id);
}
