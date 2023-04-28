package com.example.mockito_test.service;

import com.example.mockito_test.DAO.impl.UserDaoImpl;
import com.example.mockito_test.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserServiceImpl implements UserService {
    final private UserDaoImpl userDaoImpl;

    @Override
    public boolean checkUserExist(User user) {
        String name = user.getName();
        return userDaoImpl.getUserByName(name) != null;
    }
}
