package ecomerce.validator;

public class ProductQuantityValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("ProductQuantityValidator OK");
        countNumber();
    }
}
