package src.javcore.domain.service;

import src.javcore.domain.domain.HocSinhDto;

public class HocSinhService {

    /**
     * Dưới 4 => yếu
     * Từ 4 đến dưới 6 => trung bình
     * Từ 6 đến dưới 8 => khá
     * Từ 8 trở lên => Giỏi
     */
    public String phanLoaiHocLuc(HocSinhDto hocSinh) {
        float diemTrungBinh = (hocSinh.getMath()
                + hocSinh.getPhysical()
                + hocSinh.getChemistry()) / 3;

        if (diemTrungBinh < 4) {
            return "Học lực yếu";
        } else if (diemTrungBinh < 6) {
            return "Học lực trung bình";
        } else if (diemTrungBinh < 8) {
            return "Học lực khá";
        } else {
            return "Học lực giỏi";
        }
    }

}