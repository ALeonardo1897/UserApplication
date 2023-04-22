package com.nisum.assessments.users.controllers;

import com.nisum.assessments.users.services.UserService;
import com.nisum.assessments.users.services.impl.UserServiceImpl;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserController userController;

    @MockBean
    private UserServiceImpl userService;

    @Test
    public void createUser() throws Exception {
        String user = "{\n" +
                "    \"name\": \"Alvaro\",\n" +
                "    \"email\": \"test@hotmail.com\",\n" +
                "    \"password\": \"P@ssw0rd\",\n" +
                "    \"phones\": [\n" +
                "        {\n" +
                "            \"cityCode\": \"1\",\n" +
                "            \"number\": \"1234567\",\n" +
                "            \"countryCode\": \"51\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        mockMvc.perform(MockMvcRequestBuilders.post("/users")
                        .content(user)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    public void handleValidationExceptions() throws Exception {
        String user = "{\n" +
                "    \"name\": \"Alvaro\",\n" +
                "    \"email\": \"test\",\n" +
                "    \"password\": \"111\",\n" +
                "    \"phones\": [\n" +
                "        {\n" +
                "            \"cityCode\": \"1\",\n" +
                "            \"number\": \"1234567\",\n" +
                "            \"countryCode\": \"51\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        mockMvc.perform(MockMvcRequestBuilders.post("/users")
                        .content(user)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

}