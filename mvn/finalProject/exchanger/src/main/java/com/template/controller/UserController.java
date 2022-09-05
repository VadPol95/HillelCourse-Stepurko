package com.template.controller;

import com.template.dto.UserDto;
import com.template.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public Long createUser(@RequestBody UserDto user) {
        return userService.createUser(user);
    }

    @GetMapping("user/{id}")
    public UserDto getUserById(long id){
        return userService.getUserById(id);
    }

    @GetMapping("user")
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }


}
