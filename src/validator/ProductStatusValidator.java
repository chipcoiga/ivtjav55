package validator;

public class ProductStatusValidator implements Validator{
    @Override
    public void validate() {
        System.out.println("ProductStatusValidator OK");
        countNumber();
    }

}
