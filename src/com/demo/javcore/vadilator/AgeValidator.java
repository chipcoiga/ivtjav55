package com.demo.javcore.vadilator;

import com.demo.javcore.domain.HocSinhDto;

public class AgeValidator implements HocSinhValidator {
    private  String errorMessage;

    @Override
    public Boolean validate(HocSinhDto dto) {
        int age = dto.getAge();
        if (age < 15 || age > 18) {
            errorMessage = "KHông dành cho nguoi chưa đủ tuổi ";
            return false;
        }
        return true;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
