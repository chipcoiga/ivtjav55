package com.demo.javcore;


import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.service.HocSinhService;
import java.util.Scanner;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Gia dinh da co hoc sinh
        Scanner sc = new Scanner(System.in);

        HocSinhDto hocSinhDto = new HocSinhDto();

        System.out.print("Nhập tên học sinh: ");
        hocSinhDto.setName(sc.nextLine());

        System.out.print("Nhập địa chỉ: ");
        hocSinhDto.setAddress(sc.nextLine());

        System.out.print("Nhập tuổi: ");
        hocSinhDto.setAge(sc.nextInt());

        System.out.print("Nhập điểm Toán: ");
        hocSinhDto.setMath(sc.nextFloat());

        System.out.print("Nhập điểm Lý: ");
        hocSinhDto.setPhysical(sc.nextFloat());

        System.out.print("Nhập điểm Hóa: ");
        hocSinhDto.setChemistry(sc.nextFloat());

        HocSinhService service = new HocSinhService();

        boolean isHocSinhValid = service.validateHocSinh(hocSinhDto);
        if (!isHocSinhValid) {
            System.out.println("Thông tin học sinh không hợp lệ");
            return;
        }
        String hocLuc = service.phanLoaiHocLuc(hocSinhDto);
        System.out.println("Học lực của học sinh tên "
                + hocSinhDto.getName() + " là: " + hocLuc);
    }
}