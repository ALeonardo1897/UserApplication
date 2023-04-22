package com.nisum.assessments.users.services.impl;

import com.nisum.assessments.users.commons.dto.request.RequestCreateUserDTO;
import com.nisum.assessments.users.converters.UserConverter;
import com.nisum.assessments.users.exceptions.ConflictException;
import com.nisum.assessments.users.models.Phone;
import com.nisum.assessments.users.models.User;
import com.nisum.assessments.users.repositories.UserRepository;
import com.nisum.assessments.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PhoneServiceImpl phoneService;
    @Transactional
    @Override
    public User saveOne(RequestCreateUserDTO request) {
        if (userRepository.existsByEmail(request.getEmail())) throw new ConflictException("Email is already registered.");
        User user = userRepository.save(userConverter.convert(request));
        List<Phone> phones = user.getPhones();
        phones.forEach(phone -> phone.setUser(user));
        phoneService.saveList(phones);
        return user;
    }
}
