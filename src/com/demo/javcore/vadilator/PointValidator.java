package com.demo.javcore.vadilator;

import com.demo.javcore.domain.HocSinhDto;

public class PointValidator implements HocSinhValidator {

    private String errorMessage;
    @Override
    public Boolean validate(HocSinhDto dto) {
        if (dto.getMath() < 0 || dto.getMath() > 10) {
            errorMessage = "Điểm toán phải từ 0 đến 10";
            return false;
        }

        // Kiểm tra điểm lý
        if (dto.getPhysical() < 0 || dto.getPhysical() > 10) {
            errorMessage = "Điểm lý phải từ 0 đến 10";
            return false;
        }

        // Kiểm tra điểm hóa
        if (dto.getChemistry() < 0 || dto.getChemistry() > 10) {
            errorMessage = "Điểm hóa phải từ 0 đến 10";
            return false;
        }

        return true;

    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
