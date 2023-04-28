package com.example.mockito_test.DAO;

import com.example.mockito_test.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
