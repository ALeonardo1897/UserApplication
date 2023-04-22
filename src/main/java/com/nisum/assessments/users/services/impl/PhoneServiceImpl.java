package com.nisum.assessments.users.services.impl;

import com.nisum.assessments.users.models.Phone;
import com.nisum.assessments.users.repositories.PhoneRepository;
import com.nisum.assessments.users.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public List<Phone> saveList(List<Phone> phones) {
        return phoneRepository.saveAll(phones);
    }
}
