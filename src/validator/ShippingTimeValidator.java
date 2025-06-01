package validator;

public class ShippingTimeValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("ShippingTimeValidator OK");
        countNumber();
    }
}
