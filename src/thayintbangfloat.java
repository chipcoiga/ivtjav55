import java.util.Scanner;

public class thayintbangfloat {
    public static void main(String[] args) {
        float number = inputNumber();
        System.out.println("Số bạn đã nhập: " + number);
    }

    private static float inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự bất kỳ: ");
        String numberString = scanner.nextLine();
        System.out.println("Chuỗi vừa nhập: " + numberString);

        try {
            float number = Float.parseFloat(numberString);
            System.out.println("Number thu được: " + number);
            return number;
        } catch (NumberFormatException exception) {
            System.out.println("Bạn nhập vào không phải là số thực");
            return inputNumber();
        }
    }
}
// thay intbangfloat 1