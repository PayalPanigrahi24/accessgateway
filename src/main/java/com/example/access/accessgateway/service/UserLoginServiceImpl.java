package com.example.access.accessgateway.service;

import com.example.access.accessgateway.model.User;
import com.example.access.accessgateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    UserRepository UserRepository;

    public List<User> getUserList(){

      return UserRepository.findAll();
    }
}
