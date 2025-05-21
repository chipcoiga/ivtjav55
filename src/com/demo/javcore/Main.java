package com.demo.javcore;

import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.service.HocSinhService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HocSinhDto hocSinhDto = new HocSinhDto();

        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        hocSinhDto.setName(name);

        System.out.print("Nhập tuổi học sinh: ");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Tuổi phải là số nguyên");
            scanner.close();
            return;
        }
        hocSinhDto.setAge(age);

        System.out.print("Nhập địa chỉ học sinh: ");
        String address = scanner.nextLine();
        hocSinhDto.setAddress(address);

        System.out.print("Nhập điểm Toán: ");
        float math = 0;
        try {
            math = Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Điểm Toán phải là số");
            scanner.close();
            return;
        }
        hocSinhDto.setMath(math);

        System.out.print("Nhập điểm Lý: ");
        float physical = 0;
        try {
            physical = Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Điểm Lý phải là số");
            scanner.close();
            return;
        }
        hocSinhDto.setPhysical(physical);

        System.out.print("Nhập điểm Hóa: ");
        float chemistry = 0;
        try {
            chemistry = Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Điểm Hóa phải là số");
            scanner.close();
            return;
        }
        hocSinhDto.setChemistry(chemistry);

        scanner.close();

        HocSinhService service = new HocSinhService();
        boolean isValid = service.validateHocSinh(hocSinhDto);

        if (!isValid) {
            System.out.println("Thông tin học sinh không hợp lệ");
            return;
        }

        String hocLuc = service.phanLoaiHocLuc(hocSinhDto);
        System.out.println("Học lực của học sinh " + hocSinhDto.getName() + " là: " + hocLuc);
    }
}
