package com.nisum.assessments.users.services.impl;

import com.nisum.assessments.users.domain.Domain;
import com.nisum.assessments.users.models.Phone;
import com.nisum.assessments.users.repositories.PhoneRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneServiceImplTest {

    @InjectMocks
    private PhoneServiceImpl phoneService;

    @Mock
    private PhoneRepository phoneRepository;

    @Test
    void saveList() {
        Mockito.when(phoneRepository.saveAll(ArgumentMatchers.anyList())).thenReturn(List.of(Domain.getPhoneOne()));
        List<Phone> phoneList = phoneService.saveList(ArgumentMatchers.anyList());
        Assertions.assertIterableEquals(phoneList, List.of(Domain.getPhoneOne()));
    }
}