package com.nisum.assessments.users.services;

import com.nisum.assessments.users.commons.dto.request.RequestCreateUserDTO;
import com.nisum.assessments.users.models.User;

public interface UserService {

    User saveOne(RequestCreateUserDTO request);
}
