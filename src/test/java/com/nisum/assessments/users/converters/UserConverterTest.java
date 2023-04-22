package com.nisum.assessments.users.converters;

import com.nisum.assessments.users.domain.Domain;
import com.nisum.assessments.users.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserConverterTest {

    @InjectMocks
    private UserConverter userConverter;

    @Mock
    private PhoneConverter phoneConverter;

    @Test
    void convert() {
        Mockito.when(phoneConverter.convert(Domain.getRequestPhone())).thenReturn(Domain.getPhoneOne());
        User user = userConverter.convert(Domain.getRequestUser());
        Assertions.assertEquals(user, Domain.getUser());
    }
}