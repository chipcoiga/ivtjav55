package validator;

public interface Validator<T> {
    boolean isValid(T t);

    default String getErrorMessage() {
        return null;
    }
}