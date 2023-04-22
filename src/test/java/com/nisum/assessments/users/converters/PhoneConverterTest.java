package com.nisum.assessments.users.converters;

import com.nisum.assessments.users.domain.Domain;
import com.nisum.assessments.users.models.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneConverterTest {

    @InjectMocks
    private PhoneConverter phoneConverter;

    @Test
    void convert() {
        Phone phone = phoneConverter.convert(Domain.getRequestPhone());
        Assertions.assertEquals(Domain.getPhoneOne(), phone);
    }
}