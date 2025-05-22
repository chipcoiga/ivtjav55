package service;

import domain.HocSinhDto;
import helper.StringHelper;
import helper.ValidatorUtil;

public class HocSinhService {

    /**
     * Dưới 4 => yếu
     * Từ 4 đến dưới 6 => trung bình
     * Từ 6 đến dưới 8 => khá
     * từ 8 trở lên => Giỏi
     * @param hocSinh
     * @return
     */
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

    public boolean validateHocSinh(HocSinhDto hocSinh) {
        boolean isNameValid = StringHelper.isBlank(hocSinh.getName());
        boolean isAddressValid = StringHelper.isBlank(hocSinh.getAddress());

        if (isNameValid == false || isAddressValid == false) {
            return false;
        }


        if (!ValidatorUtil.isValidAge(hocSinh.getAge()) ||
                !ValidatorUtil.isValidDiem(hocSinh.getMath()) ||
                !ValidatorUtil.isValidDiem(hocSinh.getPhysical()) ||
                !ValidatorUtil.isValidDiem(hocSinh.getChemistry())) {
            return false;
        }
//thtrggg
        return true;
    }
}
