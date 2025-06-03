package ecomerce.service;

import ecomerce.validator.PhoneValidator;
import ecomerce.validator.Validator;
import ecomerce.validator.ValidatorFactory;

import java.util.List;

public class OrderService {

    //Order feature
    public void createOrder() {
        //Validate Order
        ValidatorFactory factory = new ValidatorFactory();
        Validator[] validators = factory.getValidatorChain();
        for (Validator validator : validators) {
            validator.validate();
        }
        //Create Order and Save to Database
    }

    public static void main(String[] args) {
        new OrderService().createOrder();
    }
}
