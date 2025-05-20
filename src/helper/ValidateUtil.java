package helper;


public class ValidateUtil {
    public static boolean isValidAge(int age) {
        return age > 0 && age <= 100;
    }

    public static boolean isValidScore(double score) {
        return score >= 0 && score <= 10;
    }
}

