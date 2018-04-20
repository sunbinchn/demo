package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SUNNE on 4/20/2018.
 */
@Mapper
public interface UserMapper {
    List<User> findAll();
}
