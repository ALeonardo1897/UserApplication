package com.nisum.assessments.users.domain;

import com.nisum.assessments.users.commons.dto.request.RequestCreateUserDTO;
import com.nisum.assessments.users.commons.dto.request.RequestPhoneDTO;
import com.nisum.assessments.users.models.Phone;
import com.nisum.assessments.users.models.User;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Domain {

    public static User getUser() {
        User user = new User();
        user.setName("Alvaro");
        user.setEmail("leo@gmail.com");
        user.setPassword("P@ssw0rd");
        user.setPhones(List.of(getPhoneOne()));
        user.setToken(UUID.randomUUID());
        user.setCreatedAt(new Date());
        user.setModifiedAt(new Date());
        user.setLastLogin(new Date());
        return user;
    }

    public static Phone getPhoneOne(){
        Phone phone = new Phone();
        phone.setCountryCode("51");
        phone.setNumber("123456789");
        phone.setCityCode("1");
        return phone;
    }

    public static RequestCreateUserDTO getRequestUser() {
        RequestCreateUserDTO request = new RequestCreateUserDTO();
        request.setEmail("leo@gmail.com");
        request.setName("Test");
        request.setPassword("P@ssw0rd");
        request.setPhones(List.of(getRequestPhone()));
        return request;
    }

    public static RequestPhoneDTO getRequestPhone() {
        RequestPhoneDTO request = new RequestPhoneDTO();
        request.setCountryCode("51");
        request.setNumber("123456789");
        request.setCityCode("1");
        return request;
    }
}
