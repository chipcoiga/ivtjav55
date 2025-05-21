package com.demo.javcore.service;

import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.helper.StringHelper;
import com.demo.javcore.helper.ScoreHelper;

public class HocSinhService {

    /**
     * Dưới 4 => yếu
     * Từ 4 đến dưới 6 => trung bình
     * Từ 6 đến dưới 8 => khá
     * từ 8 trở lên => Giỏi
     */
    public String phanLoaiHocLuc(HocSinhDto hocSinh) {
        double diemTrungBinh =
                (hocSinh.getMath()
                        + hocSinh.getPhysical()
                        + hocSinh.getChemistry()) / 3;

        if (diemTrungBinh < 4) {
            return "Học lực yếu";
        }

        if (diemTrungBinh < 6) {
            return "Học lực trung bình";
        }

        if (diemTrungBinh < 8) {
            return "Học lực khá";
        }

        return "Học lực giỏi";
    }

    public boolean validateHocSinh(HocSinhDto hocSinh) {
        // Kiểm tra tên và địa chỉ không rỗng
        if (StringHelper.isBlank(hocSinh.getName()) || StringHelper.isBlank(hocSinh.getAddress())) {
            System.out.println("Tên hoặc địa chỉ không hợp lệ");
            return false;
        }

        // Kiểm tra tuổi hợp lệ
        int age = hocSinh.getAge();
        if (age < 6 || age > 100) {
            System.out.println("Tuổi không hợp lệ (phải từ 6 đến 100)");
            return false;
        }

        // Kiểm tra điểm từng môn
        if (!ScoreHelper.isValidScore(hocSinh.getMath())
                || !ScoreHelper.isValidScore(hocSinh.getPhysical())
                || !ScoreHelper.isValidScore(hocSinh.getChemistry())) {
            System.out.println("Điểm các môn phải từ 0 đến 10");
            return false;
        }

        return true;
    }
}
