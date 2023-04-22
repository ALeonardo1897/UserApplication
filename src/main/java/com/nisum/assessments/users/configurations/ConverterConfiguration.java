package com.nisum.assessments.users.configurations;

import com.nisum.assessments.users.converters.PhoneConverter;
import com.nisum.assessments.users.converters.UserConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConverterConfiguration implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new UserConverter());
        registry.addConverter(new PhoneConverter());
    }
}
