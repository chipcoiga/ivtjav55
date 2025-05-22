package src.javcore.helper;

public class StringHelper {

    public static boolean isBlank(String input) {
        if (input == null) {
            System.out.println("Giá trị nhập vào bị null.");
            return false;
        }

        if (input.trim().isEmpty()) {
            System.out.println("Giá trị nhập vào rỗng.");
            return false;
        }

        return true;
    }
}