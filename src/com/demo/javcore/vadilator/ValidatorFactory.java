package com.demo.javcore.vadilator;

import com.demo.javcore.domain.HocSinhDto;

public class ValidatorFactory {
    public HocSinhValidator[] getValidatorsChain(HocSinhDto dto){
        HocSinhValidator[] validators = new HocSinhValidator[3];

        validators[0] = new AgeValidator();
        validators[1] = new NameValidator();
        validators[2] = new PointValidator();

        return validators;
    }
}
