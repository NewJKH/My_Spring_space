package com.jkh.space.mybatis;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void save(User2 user2);
    User2 findById(Long id);
}
