package com.example.mockito_test.service;

import com.example.mockito_test.DAO.impl.UserDaoImpl;
import com.example.mockito_test.model.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserDaoImpl userDaoImplMock;
    @InjectMocks
    private UserServiceImpl userService;
    @BeforeAll
    private static void initParam() {
        System.out.println("Start testing");
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    public void shouldCheckUserExistTrue() {
        when(userDaoImplMock.getUserByName("Василий"))
                .thenReturn(new User("Василий"));
       boolean checkExist =  userService.checkUserExist(new User("Василий"));
       assertTrue(checkExist);

    }

    @Test
    public void shouldCheckUserExistFalse() {
        when(userDaoImplMock.getUserByName("Василий"))
                .thenReturn(null);
        boolean checkExist =  userService.checkUserExist(new User("Василий"));
        assertFalse(checkExist);

    }

}