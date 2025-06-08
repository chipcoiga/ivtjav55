package com.demo.javcore.validator;

import com.demo.javcore.domain.HocSinhDto;

public class ValidatorFactory {
    public HocSinhValidator[] getValidatorChain(HocSinhDto dto) {
        HocSinhValidator[] validators = new HocSinhValidator[3];
        validators[0] = new PointValidator(dto);
        validators[1] = new NameValidator(dto);
        validators[2] = new AgeValidator(dto);
        return validators;
    }

    public HocSinhValidator[] getNameAndAgeValidatorChain() {
        HocSinhValidator[] validators = new HocSinhValidator[2];
        return validators;
    }
}
