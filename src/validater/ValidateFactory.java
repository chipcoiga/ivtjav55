package validater;



import validater.*;
import validater.domain.HocSinhDto;

import java.util.ArrayList;
import java.util.List;

public class ValidateFactory {

    public static List<HocSinhValidater> getValidators(HocSinhDto hocSinh) {
        List<HocSinhValidater> validators = new ArrayList<>();
        validators.add(new NameValidate(hocSinh));
        validators.add(new AgeValidate(hocSinh));
        validators.add(new PointValidate(hocSinh));
        return validators;
    }
}

