package com.example.access.accessgateway.service;

import com.example.access.accessgateway.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserLoginService {

    public List<User> getUserList();
}
