package com.demo.javcore.vadilator;

import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.helper.StringHelper;

public class NameValidator implements HocSinhValidator {

    private String errorMessage;

    @Override
    public Boolean validate(HocSinhDto dto) {
        if(StringHelper.isBlank(dto.getName())) {
            errorMessage = "Khong duoc de TRỐNG TÊN -_-";
            return false;
        }
        return true;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
