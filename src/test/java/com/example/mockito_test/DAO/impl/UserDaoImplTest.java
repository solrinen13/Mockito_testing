package com.example.mockito_test.DAO.impl;

import com.example.mockito_test.model.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {

    private static UserDaoImpl userDao;

    @BeforeAll
    public static void initParam() {
        System.out.println("Start testing");
        userDao = new UserDaoImpl();
    }

    @AfterAll
    public static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    void shouldGetUserByName() {
        assertNotNull(userDao.getUserByName("Степан"));
    }

    @Test
    void shouldGetUserByNameNull() {
        assertNull(userDao.getUserByName("Ваня"));
    }

}