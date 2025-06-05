package com.demo.javcore.validator;

import com.demo.javcore.domain.HocSinhDto;

public class AgeValidator implements HocSinhValidator {
    private HocSinhDto dto;

    public AgeValidator(HocSinhDto dto) {
        this.dto = dto;
    }

    @Override
    public void validate() {
        if (dto.getAge() < 14 || dto.getAge() > 18) {
            System.out.println("AGE KHONG hop le");
            return;
        }
        System.out.println("AGE hop le");
    }
}
