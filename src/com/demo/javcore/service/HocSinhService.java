package com.demo.javcore.service;


import com.demo.javcore.domain.HocSinhDto;
import com.demo.javcore.vadilator.HocSinhValidator;
import com.demo.javcore.vadilator.ValidatorFactory;

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

    public ValidationResult validateHocSinh(HocSinhDto hocSinh) {
        ValidatorFactory factory = new ValidatorFactory();
        HocSinhValidator[] validators = factory.getValidatorsChain(hocSinh);

        for (HocSinhValidator validator : validators) {
            if(!validator.validate(hocSinh)) {
                return new ValidationResult(false, validator.getErrorMessage());
            }
        }

        return  new ValidationResult(true, "Validate thành công trên mọi mặt trận");
    }
    public  static class  ValidationResult {
        private boolean isValid;
        private String message;

        public ValidationResult(boolean isValid, String message ) {
            this.isValid = isValid;
            this.message = message;
        }

        public boolean isValid() {
            return isValid;
        }

        public void setValid(boolean valid) {
            isValid = valid;
        }
    }
}
