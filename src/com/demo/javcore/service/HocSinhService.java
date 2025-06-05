package com.demo.javcore.service;


import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.helper.StringHelper;
import com.demo.javcore.validator.HocSinhValidator;
import com.demo.javcore.validator.ValidatorFactory;
import ecomerce.validator.Validator;

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
        ValidatorFactory validatorFactory = new ValidatorFactory();
        HocSinhValidator[] validators = validatorFactory.getValidatorChain(hocSinh);
        for (HocSinhValidator validator : validators) {
            validator.validate();
        }
        return true;
    }
}
