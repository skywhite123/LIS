package com.LIS.demo.DAO;

import com.LIS.demo.Model.User;

public interface UserDAO {
    User findById(int id);

    void save(User user);
    void update(User user);
    void delete(User user);
}
