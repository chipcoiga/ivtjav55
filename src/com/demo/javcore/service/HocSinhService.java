package com.demo.javcore.service;


import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.helper.StringHelper;
import com.demo.javcore.helper.ValidationUtil;
import emiri.HocSinh;

public class HocSinhService {
    public String phanLoaiHocLuc(HocSinhDto hocSinh) {
        float diemTrungBinh = (hocSinh.getMath()
                + hocSinh.getChemistry()
                + hocSinh.getPhysical()) / 3;

        if (diemTrungBinh < 4) {
            return "Học lực yếu";
        }
        if (diemTrungBinh < 8) {
            return "Học lực Khá";
        }
        return "Học lực Giỏi";
    }

    public boolean validateHocSinh(HocSinhDto hocSinh) {
        boolean isNameBlank = StringHelper.isBlank(hocSinh.getName());
        boolean isAddressBlank = StringHelper.isBlank(hocSinh.getAddress());

        if (isNameBlank || isAddressBlank) {
            System.out.println("Tên hoặc địa chỉ không hợp lệ");
            return false;
        }

        if (!ValidationUtil.isValidAge(hocSinh.getAge())) {
            System.out.println("Tuổi không hợp lệ (phải từ 6 đến 100)");
            return false;
        }

        if (!ValidationUtil.isValidScore(hocSinh.getMath())) {
            System.out.println("Điểm Toán không hợp lệ (0-10)");
            return false;
        }

        if (!ValidationUtil.isValidScore(hocSinh.getPhysical())) {
            System.out.println("Điểm Lý không hợp lệ (0-10)");
            return false;
        }
        if (!ValidationUtil.isValidScore(hocSinh.getChemistry())) {
            System.out.println("Điểm Hóa không hợp lệ (0-10)");
            return false;
        }
        return isNameBlank;
    }
}