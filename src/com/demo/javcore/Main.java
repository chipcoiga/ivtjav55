package com.demo.javcore;


import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.service.HocSinhService;
import com.demo.javcore.validator.HocSinhValidator;
import staticmethod.HocSinh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Gia dinh da co hoc sinh
        HocSinhDto[] dtos = new HocSinhDto[1];

        HocSinhDto hocSinhDto = new HocSinhDto();
        hocSinhDto.setName("Nguyen Van A");
        hocSinhDto.setAddress("102 Quang Trung");
        hocSinhDto.setMath(11);
        hocSinhDto.setPhysical(6);
        hocSinhDto.setChemistry(7);
        hocSinhDto.setAge(16);

        dtos[0] = hocSinhDto;

        HocSinhService service = new HocSinhService();

        for (HocSinhDto dto : dtos) {
            service.validateHocSinh(dto);
        }

        HocSinhValidator hocSinhValidator = new HocSinhValidator() {
            @Override
            public void validate() {
                System.out.println("sfsd");
            }
        };

        HocSinh hocSinh = new HocSinh();

        switch (hocSinh.getGender()) {
            case BD -> System.out.println("BD");
            case LESS -> System.out.println("LESS");
            case MALE -> System.out.println("MALE");
            case FEMALE -> System.out.println("FEMALE");
            default -> System.out.println("Khong tiet lo");
        }
    }
}
