package com.nisum.assessments.users.commons.dto.request;

import com.nisum.assessments.users.components.annotations.ValidPassword;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

public class RequestCreateUserDTO {
    @NotEmpty(message = "Name can not be null or empty.")
    private String name;
    @NotEmpty(message = "Email can not be null or empty.")
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$", message = "Email must be valid.")
    private String email;
    @NotEmpty(message = "Password can not be null or empty.")
    @ValidPassword
    private String password;
    @NotEmpty(message = "Phones can not be null or empty.")
    @Valid
    private List<RequestPhoneDTO> phones;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RequestPhoneDTO> getPhones() {
        return phones;
    }

    public void setPhones(List<RequestPhoneDTO> phones) {
        this.phones = phones;
    }
}
