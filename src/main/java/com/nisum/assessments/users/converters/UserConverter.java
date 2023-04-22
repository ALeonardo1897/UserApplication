package com.nisum.assessments.users.converters;

import com.nisum.assessments.users.commons.dto.request.RequestCreateUserDTO;
import com.nisum.assessments.users.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserConverter implements Converter<RequestCreateUserDTO, User> {

    @Autowired
    private PhoneConverter phoneConverter;

    @Override
    public User convert(RequestCreateUserDTO source) {
        User user = new User();
        user.setName(source.getName());
        user.setEmail(source.getEmail());
        user.setPassword(source.getPassword());
        user.setPhones((Objects.nonNull(source.getPhones()) && !source.getPhones().isEmpty()) ? source.getPhones().stream().map(p->phoneConverter.convert(p)).collect(Collectors.toList()) : null);
        return user;
    }
}
