package com.demo.javcore;


import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.service.HocSinhService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HocSinhDto hocSinh = new HocSinhDto();

        System.out.println("\n=== NHẬP THÔNG TIN HỌC SINH ===");

        System.out.print("Tên: ");
        hocSinh.setName(scanner.nextLine());

        System.out.print("Địa chỉ: ");
        hocSinh.setAddress(scanner.nextLine());

        hocSinh.setAge(nhapSoNguyen("Tuổi: "));
        hocSinh.setMath(nhapSoThuc("Điểm Toán: "));
        hocSinh.setPhysical(nhapSoThuc("Điểm Lý: "));
        hocSinh.setChemistry(nhapSoThuc("Điểm Hóa: "));

        HocSinhService service = new HocSinhService();
        HocSinhService.ValidationResult result = service.validateHocSinh(hocSinh);

        if (!result.isValid()) {
            System.out.println("\n DỮ LIỆU KHÔNG HỢP LỆ:");
            System.out.println(result.getClass());
            return;
        }

        // Hiển thị thông tin khi hợp lệ
        System.out.println("\n DỮ LIỆU HỢP LỆ - THÔNG TIN HỌC SINH:");
        System.out.println("Tên: " + hocSinh.getName());
        System.out.println("Địa chỉ: " + hocSinh.getAddress());
        System.out.println("Tuổi: " + hocSinh.getAge());
        System.out.println("Điểm Toán: " + hocSinh.getMath());
        System.out.println("Điểm Lý: " + hocSinh.getPhysical());
        System.out.println("Điểm Hóa: " + hocSinh.getChemistry());

        float diemTB = (hocSinh.getMath() + hocSinh.getPhysical() + hocSinh.getChemistry()) / 3;
        System.out.printf("Điểm trung bình: %.2f\n", diemTB);

        String hocLuc = service.phanLoaiHocLuc(hocSinh);
        System.out.println("Xếp loại học lực: " + hocLuc);
    }

    private static int nhapSoNguyen(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(" Vui lòng nhập số nguyên!");
            }
        }
    }

    private static float nhapSoThuc(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Float.parseFloat(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(" Vui lòng nhập số thực!");
            }
        }
    }
}
