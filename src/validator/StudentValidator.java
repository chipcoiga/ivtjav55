package validator;

public abstract class StudentValidator implements Validator<Student> {
    protected String errorMessage = "";

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}