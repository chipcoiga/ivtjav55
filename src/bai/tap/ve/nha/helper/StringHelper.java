package bai.tap.ve.nha.helper;

public class StringHelper {
    public static boolean isBlank(String input) {
        if (input == null) {
            return false;
        }

        if ( input.isEmpty() ) {
            return false;
        }

        String addressStrim = input.replaceAll(" ", "");
        if ( addressStrim.isEmpty() ) {
            return false;
        }

        return true;
    }
}
