package com.demo.javcore.validator;

import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.helper.StringHelper;

public class NameValidator implements HocSinhValidator{
    private HocSinhDto dto;

    public NameValidator(HocSinhDto dto) {
        this.dto = dto;
    }

    @Override
    public void validate() {
        if (StringHelper.isBlank(dto.getName())) {
            System.out.println("Name KHONG hop le");
            return;
        }
        System.out.println("Name hop le");
    }
}
