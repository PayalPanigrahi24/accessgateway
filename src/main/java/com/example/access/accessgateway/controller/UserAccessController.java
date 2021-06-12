package com.example.access.accessgateway.controller;

import com.example.access.accessgateway.model.User;
import com.example.access.accessgateway.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserAccessController {

    @Autowired
    UserLoginService userLoginService;

    @GetMapping(value = "/access")
    public List<User> getaccess(HttpServletResponse response) {

       return  userLoginService.getUserList();
        }
}
