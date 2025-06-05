package com.demo.javcore.vadilator;

import com.demo.javcore.domain.HocSinhDto;

public interface HocSinhValidator {
     Boolean  validate(HocSinhDto dto);
     String getErrorMessage();
}
