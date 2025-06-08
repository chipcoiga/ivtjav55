package ecomerce.validator;

import java.util.Arrays;
import java.util.List;

public class ValidatorFactory {
    public Validator[] getValidatorChain() {
        Validator[] validators = new Validator[5];
        validators[0] = new ProductQuantityValidator();
        validators[1] = new ProductStatusValidator();
        validators[2] = new ShippingAddressValidator();
        validators[3] = new ShippingTimeValidator();
        validators[4] = new PhoneValidator();
        return validators;
    }
}
