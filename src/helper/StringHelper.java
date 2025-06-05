package helper;

public class StringHelper {
    public static boolean isBlank(String input) {
        if (input == null) {
            System.out.println("Input bi null");
            return false;
        }
        if (input.equals("")) {
            System.out.println("Input bi empty");
            return false;
        }
        String addressStrim = input.replaceAll(" ", "");
        if (addressStrim.equals("")) {
            System.out.println("Input bi empty");
            return false;
        }

        return true;
    }
}
