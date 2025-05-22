package helper;

public class ValidatorUtil {

    public static boolean isValidAge(int age) {
        if (age >= 6 && age <= 100) {
            return true;
        } else {
            System.out.println("Tuổi không hợp lệ (phải từ 6 đến 100)");
            return false;
        }
    }
// ềsr
    public static boolean isValidDiem(float diem) {
        if (diem >= 0 && diem <= 10) {
            return true;
        } else {
            System.out.println("Điểm không hợp lệ (phải từ 0 đến 10)");
            return false;
        }
    }
}
