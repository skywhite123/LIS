package com.LIS.demo.mapper;

import com.LIS.demo.Model.User;

public interface UserMapper {
    User selectById();
    void update();
    void insert();
    void delete();
}
