package com.exception;

import com.demo.javcore.domain.HocSinhDto;

public class Main {
    public static void main(String[] args) throws IviettechException {
        int a = 5;
        int b = 6;
        int temp = a;
        a = b;
        b = temp;

        //Hoan doi o day
        System.out.println(a); // => 6
        System.out.println(b); // => 5
    }


    private static void checkIviettechStudent(HocSinhDto dto) throws IviettechException {
        throw new IviettechException("Khong phai hoc vien Iviettech");
    }
}
