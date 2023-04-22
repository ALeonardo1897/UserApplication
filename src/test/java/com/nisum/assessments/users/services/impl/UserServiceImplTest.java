package com.nisum.assessments.users.services.impl;

import com.nisum.assessments.users.converters.UserConverter;
import com.nisum.assessments.users.domain.Domain;
import com.nisum.assessments.users.models.User;
import com.nisum.assessments.users.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserConverter userConverter;

    @Mock
    private UserRepository userRepository;

    @Mock PhoneServiceImpl phoneService;

    @Test
    void saveOneTest(){
        Mockito.when(userRepository.existsByEmail(ArgumentMatchers.anyString())).thenReturn(false);
        Mockito.when(userConverter.convert(ArgumentMatchers.any())).thenReturn(Domain.getUser());
        Mockito.when(userRepository.save(ArgumentMatchers.any())).thenReturn(Domain.getUser());
        Mockito.when(phoneService.saveList(ArgumentMatchers.anyList())).thenReturn(List.of(Domain.getPhoneOne()));
        User user = userService.saveOne(Domain.getRequestUser());
        Assertions.assertEquals(user, Domain.getUser());
    }

}