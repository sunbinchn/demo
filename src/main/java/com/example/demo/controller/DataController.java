package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SUNNE on 4/20/2018.
 */
@RestController
public class DataController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("hello")
    public List<User> hello() {
        List<User> all = userMapper.findAll();
        return all;
    }
}
