package validator;

public class ShippingAddressValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("ShippingAddressValidator OK");
        countNumber();
    }

}
