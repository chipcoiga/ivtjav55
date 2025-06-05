package com.demo.javcore.validator;

import com.demo.javcore.domain.HocSinhDto;

public class PointValidator implements HocSinhValidator {
    private HocSinhDto dto;

    public PointValidator(HocSinhDto dto) {
        this.dto = dto;
    }

    @Override
    public void validate() {
        if (dto.getMath() < 0
                || dto.getChemistry() < 0
                || dto.getPhysical() < 0) {
            System.out.println("POINT KHONg hop le: <0");
            return;
        }

        if (dto.getMath() > 10
                || dto.getChemistry() > 10
                || dto.getPhysical() > 10) {
            System.out.println("POINT KHONg hop le: >10");
            return;
        }

        System.out.println("Point hop le");
    }
}
