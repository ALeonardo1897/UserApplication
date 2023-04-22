package com.nisum.assessments.users.components.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, String> {

    private static final Logger logger = LoggerFactory.getLogger(ValidPasswordValidator.class);
    @Value("${nisum.assessments.users.config.user-password-regex-pattern}")
    private String pattern;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.nonNull(pattern) && !pattern.isBlank()) {
            return Pattern.matches(pattern, value);
        }
        logger.error("Regex Pattern for password is wrong.");
        return false;
    }
}
