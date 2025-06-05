package validator;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("An", 16, 8.5);
        Validator<Student> validator = new thongtinhocsinh();

        if (validator.isValid(student)) {
            System.out.println("Học sinh hợp lệ.");
        } else {
            System.out.println("Lỗi: " + validator.getErrorMessage());
        }
    }
}