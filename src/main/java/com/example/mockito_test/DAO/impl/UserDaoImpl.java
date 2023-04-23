package com.example.mockito_test.DAO.impl;

import com.example.mockito_test.DAO.UserDao;
import com.example.mockito_test.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class UserDaoImpl implements UserDao {

    private final List<User> userList = new ArrayList<>();

    public UserDaoImpl() {
        userList.add(new User("Рома"));
        userList.add(new User("Степан"));
        userList.add(new User("Вадим"));
        userList.add(new User("Максим"));
        userList.add(new User("Лена"));
    }

    @Override
    public User getUserByName(String name) {

        return userList.stream()
                .filter(a -> name.equals(a.getName()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAllUsers() {

        return userList;
    }

}
