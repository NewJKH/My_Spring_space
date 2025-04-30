package com.jkh.space.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBatis {
    @Autowired
    UserMapper userMapper;

    public void getName(){

        User2 user = new User2();
        user.setName("XX");
        userMapper.save(user);

        User2 found = userMapper.findById(user.getId());

    }
}
