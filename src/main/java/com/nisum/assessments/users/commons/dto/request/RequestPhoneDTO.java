package com.nisum.assessments.users.commons.dto.request;

import javax.validation.constraints.NotNull;

public class RequestPhoneDTO {

    @NotNull(message = "Number can not be null or empty.")
    private String number;
    @NotNull(message = "CityCode can not be null or empty.")
    private String cityCode;
    @NotNull(message = "CountryCode can not be null or empty.")
    private String countryCode;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
