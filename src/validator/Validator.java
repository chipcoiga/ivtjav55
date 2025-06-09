package validator;

public interface Validator {
    void validate();

    default void countNumber() {
        System.out.println("Show count number");
    }
}

