package validater.service;


import validater.HocSinhValidater;
import validater.ValidateFactory;
import validater.domain.HocSinhDto;

import java.util.List;

public class HocSinhService {
    /**
     * Dưới 4 => yếu
     * Từ 4 đến dưới 6 => trung bình
     * Từ 6 đến dưới 8 => khá
     * từ 8 trở lên => Giỏi
     *
     * @param
     * @return
     */
    public String phanLoaiHocLuc(HocSinhDto hocSinh) {
        float diemTrungBinh = (hocSinh.getMath() + hocSinh.getPhysical() + hocSinh.getChemistry()) / 3;

        if (diemTrungBinh < 4)
            return "Học lực yếu";
        if (diemTrungBinh < 6)
            return "Học lực trung bình";
        if (diemTrungBinh < 8)
            return "Học lực khá";

        return "Học lực giỏi";
    }

    public boolean validateHocSinh(HocSinhDto hocSinh) {
        List<HocSinhValidater> validators = ValidateFactory.getValidators(hocSinh);
        boolean isValid = true;

        for (HocSinhValidater validator : validators) {
            validator.validate();
        }


        if (hocSinh.getName() == null || hocSinh.getName().trim().isEmpty())
            return false;
        if (hocSinh.getAge() < 15 || hocSinh.getAge() > 18)
            return false;
        if (hocSinh.getMath() < 0 || hocSinh.getMath() > 10)
            return false;
        if (hocSinh.getPhysical() < 0 || hocSinh.getPhysical() > 10)
            return false;
        if (hocSinh.getChemistry() < 0 || hocSinh.getChemistry() > 10)
            return false;

        return true;
    }
}//a
