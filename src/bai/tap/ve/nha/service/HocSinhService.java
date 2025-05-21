package bai.tap.ve.nha.service;


import bai.tap.ve.nha.domain.HocSinhDto;
import bai.tap.ve.nha.helper.StringHelper;

public class HocSinhService {
    public String phanLoaiHocLuc(HocSinhDto hocSinh) {
        float diemTrungBinh =
                (hocSinh.getMath()
                        + hocSinh.getPhysical()
                        + hocSinh.getChemistry())/3;

        if (diemTrungBinh < 4) {
            return "Học lực yếu";
        }

        if (diemTrungBinh < 6) {
            return "Học lực trung bình";
        }

        if (diemTrungBinh < 8) {
            return "Học lực Khá";
        }

        return "Học lực GIỎI";
    }

    public boolean validateHocSinh( HocSinhDto hocSinh) {
        boolean isNameValid = StringHelper.isBlank(hocSinh.getName());
        boolean isAddressValid = StringHelper.isBlank(hocSinh.getAddress());

        return isNameValid && isAddressValid;
    }
}
