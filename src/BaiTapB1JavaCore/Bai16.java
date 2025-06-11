package BaiTapB1JavaCore;

// Custom exception: dùng cho giá trị âm
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class Bai16 {
    public static double calculateBMI(double weight, double height) throws ArithmeticException, NegativeValueException {
        if (weight < 0 || height < 0) {
            throw new NegativeValueException("Cân nặng và chiều cao phải là số dương.");
        }
        if (height == 0) {
            throw new ArithmeticException("Chiều cao không được bằng 0.");
        }
        return weight / (height * height);
    }

    public static void main(String[] args) {
        try {
            String inputWeight = "60";
            String inputHeight = "1.65";

            double weight = Double.parseDouble(inputWeight);
            double height = Double.parseDouble(inputHeight);

            double bmi = calculateBMI(weight, height);
            System.out.printf("Chỉ số BMI là: %.2f\n", bmi);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi định dạng: vui lòng nhập số hợp lệ.");
        } catch (ArithmeticException e) {
            System.out.println("Lỗi số học: " + e.getMessage());
        } catch (NegativeValueException e) {
            System.out.println("Lỗi dữ liệu: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình tính BMI.");
        }
    }
}

