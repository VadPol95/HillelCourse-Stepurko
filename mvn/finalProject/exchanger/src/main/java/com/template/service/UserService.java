package com.template.service;

import com.template.dto.UserDto;
import com.template.entity.User;

import java.util.List;

public interface UserService {
    Long createUser(UserDto user);
    UserDto getUserById(Long id);
    List<UserDto> getUsers();
}
