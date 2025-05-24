package com.exception;

import com.demo.javcore.domain.HocSinhDto;

public class Main {
    public static void main(String[] args) throws IviettechException {
        HocSinhDto hocSinhDto = new HocSinhDto();
        try {
            checkIviettechStudent(hocSinhDto);
            System.out.println("PASS Phong Van");
        } catch (IviettechException e) {
            System.out.println("KHong phai hoc vien IVT");
        }

    }


    private static void checkIviettechStudent(HocSinhDto dto) throws IviettechException {
        throw new IviettechException("Khong phai hoc vien Iviettech");
    }
}
