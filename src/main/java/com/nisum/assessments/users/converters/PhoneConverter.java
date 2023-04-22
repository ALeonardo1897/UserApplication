package com.nisum.assessments.users.converters;

import com.nisum.assessments.users.commons.dto.request.RequestPhoneDTO;
import com.nisum.assessments.users.models.Phone;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class PhoneConverter implements Converter<RequestPhoneDTO, Phone> {
    @Override
    public Phone convert(RequestPhoneDTO source) {
        Phone phone = new Phone();
        phone.setNumber(source.getNumber());
        phone.setCityCode(source.getCityCode());
        phone.setCountryCode(source.getCountryCode());
        return phone;
    }
}
